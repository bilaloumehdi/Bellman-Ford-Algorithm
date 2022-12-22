package Bellmane;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String name ;
	private boolean isVisited ;
	private double minDistance;
	private Vertex previousVertex ;
	private List<Edge> adjacenciesList ;

	public Vertex(String name) {
		this.name = name;
		this.adjacenciesList = new ArrayList<>();
	}

	public void addEdge(Edge edge) {
		this.adjacenciesList.add(edge);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public double getMinDistance() {
		return minDistance;
	}

	public void setMinDistance(double distance) {
		this.minDistance = distance;
	}

	public Vertex getPreviousVertex() {
		return previousVertex;
	}

	public void setPreviousVertex(Vertex previousVertex) {
		this.previousVertex = previousVertex;
	}

	public List<Edge> getAdjacenciesList() {
		return adjacenciesList;
	}

	public void setAdjacenciesList(List<Edge> adjacenciesList) {
		this.adjacenciesList = adjacenciesList;
	}


}
