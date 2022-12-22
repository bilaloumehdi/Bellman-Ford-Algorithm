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

		System.out.println("Entrer le nombre des sommets: ");
		 vertexNumber = clavier.nextInt();

		System.out.println("Entrer les noms des sommets: ");
		for(int i=0 ;i<vertexNumber ; i++) {
			String name = clavier.next();
			vertexList.add(new Vertex(name));
		}

		System.out.println("Entrer le nombre des arcs: ");
		 edgesNumber = clavier.nextInt();

		for(int i=0 ; i<edgesNumber ; i++) {
			System.out.println("Edge "+(i+1));
			System.out.print("Entrer le nom du sommet origin: ");
			 edgeOriginName = clavier.next();

			System.out.print("\n Entrer le nom du sommet extrémité: ");
			edgeFinalName = clavier.next();

			System.out.print("\n Enter le poids de l'arc correspondant:  ");
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


				/*
				 * it just a first test:
				 *
				 * Vertex  A = new Vertex("A");
				Vertex  B =	new Vertex("B");
				Vertex  C = new Vertex("C");
				Vertex  D = new Vertex("D");
				Vertex  E = new Vertex("E");
				Vertex  F = new Vertex("F");
				Vertex  G = new Vertex("G");

				vertexList.add(A);
				vertexList.add(B);
				vertexList.add(C);
				vertexList.add(D);
				vertexList.add(E);
				vertexList.add(F);
				vertexList.add(G);



				Edge AB = new Edge(30,A,B);
				Edge AE = new Edge(36,A,E);
				Edge AG = new Edge(180,A,G);
				Edge BC = new Edge(60,B,C);
				Edge BD = new Edge(42,B,D);
				Edge BE = new Edge(27,B,E);
				Edge BF = new Edge(18,B,F);
				Edge CG = new Edge(84,C,G);
				Edge DC = new Edge(18,D,C);
				Edge DG = new Edge(90,D,G);
				Edge EC = new Edge(48,E,C);
				Edge EF = new Edge(48,E,F);
				Edge EG = new Edge(126,E,G);
				Edge FA = new Edge(33,F,A);
				Edge FC = new Edge(36,F,C);
				Edge FD = new Edge(12,F,D);
				Edge FG = new Edge(132,F,G);




				edgesList.add(AB);
				edgesList.add(AE);
				edgesList.add(AG);
				edgesList.add(BC);
				edgesList.add(BD);
				edgesList.add(BE);
				edgesList.add(BF);
				edgesList.add(CG);
				edgesList.add(DC);
				edgesList.add(DG);
				edgesList.add(EC);
				edgesList.add(EF);
				edgesList.add(EG);
				edgesList.add(FA);
				edgesList.add(FC);
				edgesList.add(FD);
				edgesList.add(FG); */


				/* BellmaneFord bellman = new BellmaneFord(vertexList,edgesList);
				//bellman.shortestPaths(edgesList.get(0).getStartVertex(),edgesList.get(7).getTargetVertex());
			    bellman.shortestPaths(vertexList.get(0)); */



			}

}
