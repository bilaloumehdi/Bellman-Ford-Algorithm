package Bellmane;

import java.util.List;

public class BellmaneFord {
	private List<Vertex> vertexList ;
	private List<Edge> edgeList ;

	//constructor
	public BellmaneFord(List<Vertex> vertexList, List<Edge> edgeList) {
		this.vertexList = vertexList;
		this.edgeList = edgeList;
	}


	public void shortestPaths(Vertex sourceVertex) {
		// Initialization
		sourceVertex.setMinDistance(0);
		for(int i =1;i<vertexList.size();i++) {
			vertexList.get(i).setMinDistance(Double.MAX_VALUE);
		}

		int length = this.vertexList.size()-1 ;
		for(int i=0 ;i< length ;i++) {

			for(Edge edge: this.edgeList) {

				if(edge.getStartVertex().getMinDistance() == Double.MAX_VALUE) continue ;

				Vertex v = edge.getStartVertex();
				Vertex u = edge.getTargetVertex();
				double newDistance = v.getMinDistance()+ edge.getWeight() ;

				if(newDistance < u.getMinDistance()) {
					u.setMinDistance(newDistance);
					u.setPreviousVertex(v);
				}
			}
		}
		for(Edge edge : this.edgeList) {
			if( edge.getStartVertex().getMinDistance() != Double.MAX_VALUE) {
				if(hasCycle(edge)) {
					System.out.println("There is a negative Cycle");
				}
			}
		}


		// printing The result :
		for(Vertex vertex : vertexList ) {
			System.out.print(" \n Vertex :"+vertex.getName()+ ",  min distance= " + vertex.getMinDistance());
			// printing the shortesPath to a vertex from the source
			 System.out.print(" the shortest path form the source is (" + vertex.getName());

			while(vertex.getPreviousVertex() != null ) {
				System.out.print(vertex.getPreviousVertex().getName());
				vertex = vertex.getPreviousVertex() ;
			}
			System.out.println("). \n ");
		}
	}

	// function to verify if the Graph has a negative cycle
	public boolean hasCycle(Edge edge) {
		return (edge.getStartVertex().getMinDistance()+ edge.getWeight() ) < edge.getTargetVertex().getMinDistance() ;
	}



}
