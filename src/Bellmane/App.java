package Bellmane;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws InterruptedException {

		List<Vertex> vertexList = new ArrayList<Vertex>();
		List<Edge> edgesList = new ArrayList<Edge>();
		int vertexNumber ;
		int edgesNumber ;
		int weight ;
		String edgeOriginName ;
		String edgeFinalName ;

		Scanner clavier = new Scanner(System.in);

		System.out.println("Enter the number of vertexes : ");
		 vertexNumber = clavier.nextInt();

		System.out.println("Enter the Vertexes's name : ");
		for(int i=0 ;i<vertexNumber ; i++) {
			String name = clavier.next();
			vertexList.add(new Vertex(name));
		}

		System.out.println("Enter the number of Edges : ");
		 edgesNumber = clavier.nextInt();

		for(int i=0 ; i<edgesNumber ; i++) {
			System.out.println("Edge "+(i+1));
			System.out.print("Enter the vertex's start name : ");
			 edgeOriginName = clavier.next();

			System.out.print("\n Enter the vertex's end name : ");
			edgeFinalName = clavier.next();

			System.out.print("\n Enter the weight of the Edge :  ");
			weight= clavier.nextInt();

			// search for the vertex's index that contains the corresponding name
			int edgeOriginIndex =0;
			int edgeFinalIndex = 0 ;
			for(Vertex vertex : vertexList) {
				if(vertex.getName().equals(edgeOriginName)) edgeOriginIndex = vertexList.indexOf(vertex);

				if(vertex.getName().equals(edgeFinalName)) edgeFinalIndex = vertexList.indexOf(vertex);

			}


			edgesList.add(new Edge(weight,vertexList.get(edgeOriginIndex),vertexList.get(edgeFinalIndex)));
		}


		BellmaneFord bellman = new BellmaneFord(vertexList,edgesList);
		bellman.shortestPaths(vertexList.get(0));

		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();

			}

}
