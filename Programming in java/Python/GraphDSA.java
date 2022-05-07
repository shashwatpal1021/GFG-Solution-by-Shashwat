Graph Data Stucture
In this tutorial, you will learn what a Graph Data Structure is. Also, you will find representations of a graph.

A graph data structure is a collection of nodes that have data and are connected to other nodes.

Let's try to understand this through an example. On facebook, everything is a node. That includes User, Photo, Album, Event, Group, Page, Comment, Story, Video, Link, Note...anything that has data is a node.

Every relationship is an edge from one node to another. Whether you post a photo, join a group, like a page, etc., a new edge is created for that relationship.

graph data structure explained using facebook's example. Users, groups, pages, events, etc. are represented as nodes and their relationships - friend, joining a group, liking a page are represented as links between nodes
Example of graph data structure
All of facebook is then a collection of these nodes and edges. This is because facebook uses a graph data structure to store its data.

More precisely, a graph is a data structure (V, E) that consists of

A collection of vertices V
A collection of edges E, represented as ordered pairs of vertices (u,v)
a graph contains vertices that are like points and edges that connect the points
Vertices and edges
In the graph,

V = {0, 1, 2, 3}
E = {(0,1), (0,2), (0,3), (1,2)}
G = {V, E}
Graph Terminology
Adjacency: A vertex is said to be adjacent to another vertex if there is an edge connecting them. Vertices 2 and 3 are not adjacent because there is no edge between them.
Path: A sequence of edges that allows you to go from vertex A to vertex B is called a path. 0-1, 1-2 and 0-2 are paths from vertex 0 to vertex 2.
Directed Graph: A graph in which an edge (u,v) doesn't necessarily mean that there is an edge (v, u) as well. The edges in such a graph are represented by arrows to show the direction of the edge.
'Graph Representation
Graphs are commonly represented in two ways:

1. Adjacency Matrix
An adjacency matrix is a 2D array of V x V vertices. Each row and column represent a vertex.

If the value of any element a[i][j] is 1, it represents that there is an edge connecting vertex i and vertex j.

The adjacency matrix for the graph we created above is

graph adjacency matrix for sample graph shows that the value of matrix element is 1 for the row and column that have an edge and 0 for row and column that don't have an edge
'Graph adjacency matrix
Since it is an undirected graph, for edge (0,2), we also need to mark edge (2,0); making the adjacency matrix symmetric about the diagonal.

Edge lookup(checking if an edge exists between vertex A and vertex B) is extremely fast in adjacency matrix representation but we have to reserve space for every possible link between all vertices(V x V), so it requires more space.

2. Adjacency List
An adjacency list represents a graph as an array of linked lists.

The index of the array represents a vertex and each element in its linked list represents the other vertices that form an edge with the vertex.

The adjacency list for the graph we made in the first example is as follows:

adjacency list representation represents graph as array of linked lists where index represents the vertex and each element in linked list represents the edges connected to that vertex
Adjacency list representation
An adjacency list is efficient in terms of storage because we only need to store the values for the edges. For a graph with millions of vertices, this can mean a lot of saved space.

Graph Operations
The most common graph operations are:

Check if the element is present in the graph
Graph Traversal
Add elements(vertex, edges) to graph
Finding the path from one vertex to another







Spanning Tree and Minimum Spanning Tree
In this tutorial, you will learn about spanning tree and minimum spanning tree with help of examples and figures.

Before we learn about spanning trees, we need to understand two graphs: undirected graphs and connected graphs.

An undirected graph is a graph in which the edges do not point in any direction (ie. the edges are bidirectional).

Undirected Graph
Undirected Graph
A connected graph is a graph in which there is always a path from a vertex to any other vertex.

Connected Graph
Connected Graph
Spanning tree
A spanning tree is a sub-graph of an undirected connected graph, which includes all the vertices of the graph with a minimum possible number of edges. If a vertex is missed, then it is not a spanning tree.

The edges may or may not have weights assigned to them.

The total number of spanning trees with n vertices that can be created from a complete graph is equal to n(n-2).

If we have n = 4, the maximum number of possible spanning trees is equal to 44-2 = 16. Thus, 16 spanning trees can be formed from a complete graph with 4 vertices.

Example of a Spanning Tree
Let''s understand the spanning tree with examples below:

Let the original graph be:

initial tree
Normal graph
Some of the possible spanning trees that can be created from the above graph are:

spanning tree
A spanning tree
spanning tree
A spanning tree
spanning tree
A spanning tree
spanning tree
A spanning tree
spanning tree
A spanning tree
spanning tree
A spanning tree
Minimum Spanning Tree
A minimum spanning tree is a spanning tree in which the sum of the weight of the edges is as minimum as possible.

Example of a Spanning Tree
Let''s understand the above definition with the help of the example below.

The initial graph is:

initial graph
Weighted graph
The possible spanning trees from the above graph are:

minimum spanning tree (mst)
Minimum spanning tree - 1
minimum spanning tree (mst)
Minimum spanning tree - 2
minimum spanning tree (mst)
Minimum spanning tree - 3
minimum spanning tree (mst)
Minimum spanning tree - 4
The minimum spanning tree from the above spanning trees is:

minimum spanning tree (mst)
Minimum spanning tree
The minimum spanning tree from a graph is found using the following algorithms:

Prim's Algorithm
Kruskal's Algorithm
Spanning Tree Applications
Computer Network Routing Protocol
Cluster Analysis
Civil Network Planning
Minimum Spanning tree Applications
To find paths in the map
To design networks like telecommunication networks, water supply networks, and electrical grids.










Strongly Connected Components
In this tutorial, you will learn how strongly connected components are formed. Also, you will find working examples of Kosaraju's algorithm in C, C++, Java and Python.

A strongly connected component is the portion of a directed graph in which there is a path from each vertex to another vertex. It is applicable only on a directed graph.

For example:

Let us take the graph below.

strongly connected components
Initial graph
The strongly connected components of the above graph are:

Strongly connected components
Strongly connected components
You can observe that in the first strongly connected component, every vertex can reach the other vertex through the directed path.

These components can be found using Kosaraju's Algorithm.

Kosaraju's Algorithm
Kosaraju's Algorithm is based on the depth-first search algorithm implemented twice.

Three steps are involved.

Perform a depth first search on the whole graph.

Let us start from vertex-0, visit all of its child vertices, and mark the visited vertices as done. If a vertex leads to an already visited vertex, then push this vertex to the stack.

For example: Starting from vertex-0, go to vertex-1, vertex-2, and then to vertex-3. Vertex-3 leads to already visited vertex-0, so push the source vertex (ie. vertex-3) into the stack.
strongly connected components
DFS on the graph

Go to the previous vertex (vertex-2) and visit its child vertices i.e. vertex-4, vertex-5, vertex-6 and vertex-7 sequentially. Since there is nowhere to go from vertex-7, push it into the stack.
strongly connected components
DFS on the graph

Go to the previous vertex (vertex-6) and visit its child vertices. But, all of its child vertices are visited, so push it into the stack.
strongly connected components
Stacking

Similarly, a final stack is created.
strongly connected components
Final Stack
Reverse the original graph.
reversed graph
DFS on reversed graph
Perform depth-first search on the reversed graph.

Start from the top vertex of the stack. Traverse through all of its child vertices. Once the already visited vertex is reached, one strongly connected component is formed.

For example: Pop vertex-0 from the stack. Starting from vertex-0, traverse through its child vertices (vertex-0, vertex-1, vertex-2, vertex-3 in sequence) and mark them as visited. The child of vertex-3 is already visited, so these visited vertices form one strongly connected component.
reversed graph - strongly connected components
Start from the top and traverse through all the vertices

Go to the stack and pop the top vertex if already visited. Otherwise, choose the top vertex from the stack and traverse through its child vertices as presented above.
strongly connected components
Pop the top vertex if already visited
 
reversed graph - strongly connected components
Strongly connected component
Thus, the strongly connected components are:
strongly connected components
All strongly connected components
Python, Java, C++ examples
Python
Java
C++
// Kosaraju's algorithm to find strongly connected components in Java

import java.util.*;
import java.util.LinkedList;

class Graph {
	private int V;
	private LinkedList<Integer> adj[];

	// Create a graph
	Graph(int s) {
		V = s;
		adj = new LinkedList[s];
		for (int i = 0; i < s; ++i)
			adj[i] = new LinkedList();
	}

  // Add edge
	void addEdge(int s, int d) {
		adj[s].add(d);
	}

	// DFS
	void DFSUtil(int s, boolean visitedVertices[]) {
		visitedVertices[s] = true;
		System.out.print(s + " ");
		int n;

		Iterator<Integer> i = adj[s].iterator();
		while (i.hasNext()) {
			n = i.next();
			if (!visitedVertices[n])
				DFSUtil(n, visitedVertices);
		}
	}

	// Transpose the graph
	Graph Transpose() {
		Graph g = new Graph(V);
		for (int s = 0; s < V; s++) {
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext())
				g.adj[i.next()].add(s);
		}
		return g;
	}

	void fillOrder(int s, boolean visitedVertices[], Stack stack) {
		visitedVertices[s] = true;

		Iterator<Integer> i = adj[s].iterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visitedVertices[n])
				fillOrder(n, visitedVertices, stack);
		}
		stack.push(new Integer(s));
	}

	// Print strongly connected component
	void printSCC() {
		Stack stack = new Stack();

		boolean visitedVertices[] = new boolean[V];
		for (int i = 0; i < V; i++)
			visitedVertices[i] = false;

		for (int i = 0; i < V; i++)
			if (visitedVertices[i] == false)
				fillOrder(i, visitedVertices, stack);

		Graph gr = Transpose();

		for (int i = 0; i < V; i++)
			visitedVertices[i] = false;

		while (stack.empty() == false) {
			int s = (int) stack.pop();

			if (visitedVertices[s] == false) {
				gr.DFSUtil(s, visitedVertices);
				System.out.println();
			}
		}
	}

	public static void main(String args[]) {
		Graph g = new Graph(8);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 0);
		g.addEdge(4, 5);
		g.addEdge(5, 6);
		g.addEdge(6, 4);
		g.addEdge(6, 7);

		System.out.println("Strongly Connected Components:");
		g.printSCC();
	}
}
Kosaraju's Algorithm Complexity
Kosaraju's algorithm runs in linear time i.e. O(V+E).

Strongly Connected Components Applications
Vehicle routing applications
Maps
Model-checking in formal verification







Adjacency Matrix
In this tutorial, you will learn what an adjacency matrix is. Also, you will find working examples of adjacency matrix in C, C++, Java and Python.

An adjacency matrix is a way of representing a graph as a matrix of booleans (0's and 1's). A finite graph can be represented in the form of a square matrix on a computer, where the boolean value of the matrix indicates if there is a direct path between two vertices.

For example, we have a graph below.

An undirected graph
An undirected graph
We can represent this graph in matrix form like below.

Matrix representation of the graph
Matrix representation of the graph
Each cell in the above table/matrix is represented as Aij, where i and j are vertices. The value of Aij is either 1 or 0 depending on whether there is an edge from vertex i to vertex j.

If there is a path from i to j, then the value of Aij is 1 otherwise its 0. For instance, there is a path from vertex 1 to vertex 2, so A12 is 1 and there is no path from vertex 1 to 3, so A13 is 0.

In case of undirected graphs, the matrix is symmetric about the diagonal because of every edge (i,j), there is also an edge (j,i).

Pros of Adjacency Matrix
The basic operations like adding an edge, removing an edge, and checking whether there is an edge from vertex i to vertex j are extremely time efficient, constant time operations.
If the graph is dense and the number of edges is large, an adjacency matrix should be the first choice. Even if the graph and the adjacency matrix is sparse, we can represent it using data structures for sparse matrices.
The biggest advantage, however, comes from the use of matrices. The recent advances in hardware enable us to perform even expensive matrix operations on the GPU.
By performing operations on the adjacent matrix, we can get important insights into the nature of the graph and the relationship between its vertices.
Cons of Adjacency Matrix
The VxV space requirement of the adjacency matrix makes it a memory hog. Graphs out in the wild usually don't have too many connections and this is the major reason why adjacency lists are the better choice for most tasks.
'While basic operations are easy, operations like inEdges and outEdges are expensive when using the adjacency matrix representation.
Adjacency Matrix Code in Python, Java, and C/C++
If you know how to create two-dimensional arrays, you also know how to create an adjacency matrix.

Python
Java
C
C++
// Adjacency Matrix representation in Java

public class Graph {
  private boolean adjMatrix[][];
  private int numVertices;

  // Initialize the matrix
  public Graph(int numVertices) {
    this.numVertices = numVertices;
    adjMatrix = new boolean[numVertices][numVertices];
  }

  // Add edges
  public void addEdge(int i, int j) {
    adjMatrix[i][j] = true;
    adjMatrix[j][i] = true;
  }

  // Remove edges
  public void removeEdge(int i, int j) {
    adjMatrix[i][j] = false;
    adjMatrix[j][i] = false;
  }

  // Print the matrix
  public String toString() {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < numVertices; i++) {
      s.append(i + ": ");
      for (boolean j : adjMatrix[i]) {
        s.append((j ? 1 : 0) + " ");
      }
      s.append("\n");
    }
    return s.toString();
  }

  public static void main(String args[]) {
    Graph g = new Graph(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);

    System.out.print(g.toString());
  }
}
Adjacency Matrix Applications
Creating routing table in networks
Navigation tasks








Adjacency List
In this tutorial, you will learn what an adjacency list is. Also, you will find working examples of adjacency list in C, C++, Java and Python.

An adjacency list represents a graph as an array of linked lists. The index of the array represents a vertex and each element in its linked list represents the other vertices that form an edge with the vertex.

For example, we have a graph below.

A graph
An undirected graph
We can represent this graph in the form of a linked list on a computer as shown below.

Linked list representation of the graph
Linked list representation of the graph
Here, 0, 1, 2, 3 are the vertices and each of them forms a linked list with all of its adjacent vertices. For instance, vertex 1 has two adjacent vertices 0 and 2. Therefore, 1 is linked with 0 and 2 in the figure above.

Pros of Adjacency List
An adjacency list is efficient in terms of storage because we only need to store the values for the edges. For a sparse graph with millions of vertices and edges, this can mean a lot of saved space.
It also helps to find all the vertices adjacent to a vertex easily.
Cons of Adjacency List
Finding the adjacent list is not quicker than the adjacency matrix because all the connected nodes must be first explored to find them.
Adjacency List Structure
The simplest adjacency list needs a node data structure to store a vertex and a graph data structure to organize the nodes.

We stay close to the basic definition of a graph - a collection of vertices and edges {V, E}. For simplicity, we use an unlabeled graph as opposed to a labeled one i.e. the vertices are identified by their indices 0,1,2,3.

Let''s dig into the data structures at play here.

struct node{
    int vertex;
    struct node* next;
};

struct Graph{
    int numVertices;
    struct node** adjLists;
};
Don''t let the struct node** adjLists overwhelm you.

All we are saying is we want to store a pointer to struct node*. This is because we don't know how many vertices the graph will have and so we cannot create an array of Linked Lists at compile time.

'Adjacency List C++
It is the same structure but by using the in-built list STL data structures of C++, we make the structure a bit cleaner. We are also able to abstract the details of the implementation.

class Graph{
    int numVertices;
    list<int> *adjLists;
    
  public:
    Graph(int V);
    void addEdge(int src, int dest);
};
Adjacency List Java
We use Java Collections to store the Array of Linked Lists.

class Graph{
    private int numVertices;
    private LinkedList<integer> adjLists[];
}
The type of LinkedList is determined by what data you want to store in it. For a labeled graph, you could store a dictionary instead of an Integer

Adjacency List Python
There is a reason Python gets so much love. A simple dictionary of vertices and its edges is a sufficient representation of a graph. You can make the vertex itself as complex as you want.

graph = {'A': set(['B', 'C']),
         'B': set(['A', 'D', 'E']),
         'C': set(['A', 'F']),
         'D': set(['B']),
         'E': set(['B', 'F']),
         'F': set(['C', 'E'])}
Adjacency List Code in Python, Java, and C/C++
Python
Java
C
C++
// Adjascency List representation in Java

import java.util.*;

class Graph {

  // Add edge
  static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
    am.get(s).add(d);
    am.get(d).add(s);
  }

  public static void main(String[] args) {

    // Create the graph
    int V = 5;
    ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

    for (int i = 0; i < V; i++)
      am.add(new ArrayList<Integer>());

    // Add edges
    addEdge(am, 0, 1);
    addEdge(am, 0, 2);
    addEdge(am, 0, 3);
    addEdge(am, 1, 2);

    printGraph(am);
  }

  // Print the graph
  static void printGraph(ArrayList<ArrayList<Integer>> am) {
    for (int i = 0; i < am.size(); i++) {
      System.out.println("\nVertex " + i + ":");
      for (int j = 0; j < am.get(i).size(); j++) {
        System.out.print(" -> " + am.get(i).get(j));
      }
      System.out.println();
    }
  }
}
Applications of Adjacency List
It is faster to use adjacency lists for graphs having less number of edges.







Depth First Search (DFS)
In this tutorial, you will learn about depth first search algorithm with examples and pseudocode. Also, you will learn to implement DFS in C, Java, Python, and C++.

Depth first Search or Depth first traversal is a recursive algorithm for searching all the vertices of a graph or tree data structure. Traversal means visiting all the nodes of a graph.

Depth First Search Algorithm
A standard DFS implementation puts each vertex of the graph into one of two categories:

Visited
Not Visited
The purpose of the algorithm is to mark each vertex as visited while avoiding cycles.

The DFS algorithm works as follows:

Start by putting any one of the graph's vertices on top of a stack.
Take the top item of the stack and add it to the visited list.
Create a list of that vertex's adjacent nodes. Add the ones which aren't in the visited list to the top of the stack.
Keep repeating steps 2 and 3 until the stack is empty.
Depth First Search Example
Let's see how the Depth First Search algorithm works with an example. We use an undirected graph with 5 vertices.

We start from vertex 0, the DFS algorithm starts by putting it in the Visited list and putting all its adjacent vertices in the stack.
Undirected graph with 5 vertices
We start from vertex 0, the DFS algorithm starts by putting it in the Visited list and putting all its adjacent vertices in the stack.

Start by putting it in the Visited list and putting all its adjacent vertices in the stack.
Visit the element and put it in the visited list
Next, we visit the element at the top of stack i.e. 1 and go to its adjacent nodes. Since 0 has already been visited, we visit 2 instead.

Next, we visit the element at the top of stack i.e. 1 and go to its adjacent nodes. Since 0 has already been visited, we visit 2 instead.
Visit the element at the top of stack
Vertex 2 has an unvisited adjacent vertex in 4, so we add that to the top of the stack and visit it.

Vertex 2 has an unvisited adjacent vertex in 4, so we add that to the top of the stack and visit it.
Vertex 2 has an unvisited adjacent vertex in 4, so we add that to the top of the stack and visit it.
Vertex 2 has an unvisited adjacent vertex in 4, so we add that to the top of the stack and visit it.
Vertex 2 has an unvisited adjacent vertex in 4, so we add that to the top of the stack and visit it.
After we visit the last element 3, it doesn't have any unvisited adjacent nodes, so we have completed the Depth First Traversal of the graph.

After we visit the last element 3, it doesn't have any unvisited adjacent nodes, so we have completed the Depth First Traversal of the graph.
After we visit the last element 3, it doesn't have any unvisited adjacent nodes, so we have completed the Depth First Traversal of the graph.
'DFS Pseudocode (recursive implementation)
The pseudocode for DFS is shown below. In the init() function, notice that we run the DFS function on every node. This is because the graph might have two different disconnected parts so to make sure that we cover every vertex, we can also run the DFS algorithm on every node.

DFS(G, u)
    u.visited = true
    for each v ∈ G.Adj[u]
        if v.visited == false
            DFS(G,v)
     
init() {
    For each u ∈ G
        u.visited = false
     For each u ∈ G
       DFS(G, u)
}
DFS Implementation in Python, Java and C/C++
The code for the Depth First Search Algorithm with an example is shown below. The code has been simplified so that we can focus on the algorithm rather than other details.

Python
Java
C
C++
// DFS algorithm in Java

import java.util.*;

class Graph {
  private LinkedList<Integer> adjLists[];
  private boolean visited[];

  // Graph creation
  Graph(int vertices) {
    adjLists = new LinkedList[vertices];
    visited = new boolean[vertices];

    for (int i = 0; i < vertices; i++)
      adjLists[i] = new LinkedList<Integer>();
  }

  // Add edges
  void addEdge(int src, int dest) {
    adjLists[src].add(dest);
  }

  // DFS algorithm
  void DFS(int vertex) {
    visited[vertex] = true;
    System.out.print(vertex + " ");

    Iterator<Integer> ite = adjLists[vertex].listIterator();
    while (ite.hasNext()) {
      int adj = ite.next();
      if (!visited[adj])
        DFS(adj);
    }
  }

  public static void main(String args[]) {
    Graph g = new Graph(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 3);

    System.out.println("Following is Depth First Traversal");

    g.DFS(2);
  }
}
Complexity of Depth First Search
The time complexity of the DFS algorithm is represented in the form of O(V + E), where V is the number of nodes and E is the number of edges.

The space complexity of the algorithm is O(V).

Application of DFS Algorithm
For finding the path
To test if the graph is bipartite
For finding the strongly connected components of a graph
For detecting cycles in a graph






Breadth first search
In this tutorial, you will learn about breadth first search algorithm. Also, you will find working examples of bfs algorithm in C, C++, Java and Python.

Traversal means visiting all the nodes of a graph. Breadth First Traversal or Breadth First Search is a recursive algorithm for searching all the vertices of a graph or tree data structure.

BFS algorithm
A standard BFS implementation puts each vertex of the graph into one of two categories:

Visited
Not Visited
The purpose of the algorithm is to mark each vertex as visited while avoiding cycles.

The algorithm works as follows:

Start by putting any one of the graph's vertices at the back of a queue.
Take the front item of the queue and add it to the visited list.
Create a list of that vertex's adjacent nodes. Add the ones which aren't in the visited list to the back of the queue.
Keep repeating steps 2 and 3 until the queue is empty.
The graph might have two different disconnected parts so to make sure that we cover every vertex, we can also run the BFS algorithm on every node

BFS example
Let's see how the Breadth First Search algorithm works with an example. We use an undirected graph with 5 vertices.

undirected graph with 5 vertices
Undirected graph with 5 vertices
We start from vertex 0, the BFS algorithm starts by putting it in the Visited list and putting all its adjacent vertices in the stack.

visit start vertex and add its adjacent vertices to queue
Visit start vertex and add its adjacent vertices to queue
Next, we visit the element at the front of queue i.e. 1 and go to its adjacent nodes. Since 0 has already been visited, we visit 2 instead.

visit the first neighbour of start node 0, which is 1
Visit the first neighbour of start node 0, which is 1
Vertex 2 has an unvisited adjacent vertex in 4, so we add that to the back of the queue and visit 3, which is at the front of the queue.

visit 2 which was added to queue earlier to add its neighbours
Visit 2 which was added to queue earlier to add its neighbours
visit 
4 remains in the queue
Only 4 remains in the queue since the only adjacent node of 3 i.e. 0 is already visited. We visit it.

visit last remaining item in queue to check if it has unvisited neighbours
Visit last remaining item in the queue to check if it has unvisited neighbors
Since the queue is empty, we have completed the Breadth First Traversal of the graph.

BFS pseudocode
create a queue Q 
mark v as visited and put v into Q 
while Q is non-empty 
    remove the head u of Q 
    mark and enqueue all (unvisited) neighbours of u
Python, Java and C/C++ Examples
The code for the Breadth First Search Algorithm with an example is shown below. The code has been simplified so that we can focus on the algorithm rather than other details.

Python
Java
C
C++
// BFS algorithm in Java

import java.util.*;

public class Graph {
  private int V;
  private LinkedList<Integer> adj[];

  // Create a graph
  Graph(int v) {
    V = v;
    adj = new LinkedList[v];
    for (int i = 0; i < v; ++i)
      adj[i] = new LinkedList();
  }

  // Add edges to the graph
  void addEdge(int v, int w) {
    adj[v].add(w);
  }

  // BFS algorithm
  void BFS(int s) {

    boolean visited[] = new boolean[V];

    LinkedList<Integer> queue = new LinkedList();

    visited[s] = true;
    queue.add(s);

    while (queue.size() != 0) {
      s = queue.poll();
      System.out.print(s + " ");

      Iterator<Integer> i = adj[s].listIterator();
      while (i.hasNext()) {
        int n = i.next();
        if (!visited[n]) {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }

  public static void main(String args[]) {
    Graph g = new Graph(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);

    System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

    g.BFS(2);
  }
}
BFS Algorithm Complexity
The time complexity of the BFS algorithm is represented in the form of O(V + E), where V is the number of nodes and E is the number of edges.

The space complexity of the algorithm is O(V).

BFS Algorithm Applications
To build index by search index
For GPS navigation
Path finding algorithms
In Ford-Fulkerson algorithm to find maximum flow in a network
Cycle detection in an undirected graph
In minimum spanning tree







Bellman Ford's Algorithm
Bellman Ford algorithm helps us find the shortest path from a vertex to all other vertices of a weighted graph.

It is similar to Dijkstra's algorithm but it can work with graphs in which edges can have negative weights.

Why would one ever have edges with negative weights in real life?
Negative weight edges might seem useless at first but they can explain a lot of phenomena like cashflow, the heat released/absorbed in a chemical reaction, etc.

For instance, if there are different ways to reach from one chemical A to another chemical B, each method will have sub-reactions involving both heat dissipation and absorption.

If we want to find the set of reactions where minimum energy is required, then we will need to be able to factor in the heat absorption as negative weights and heat dissipation as positive weights.

Why do we need to be careful with negative weights?
Negative weight edges can create negative weight cycles i.e. a cycle that will reduce the total path distance by coming back to the same point.

negative weight cycles can give an incorrect result when trying to find out the shortest path
Negative weight cycles can give an incorrect result when trying to find out the shortest path
Shortest path algorithms like Dijkstra's Algorithm that aren't able to detect such a cycle can give an incorrect result because they can go through a negative weight cycle and reduce the path length.

How Bellman Ford's algorithm works
Bellman Ford algorithm works by overestimating the length of the path from the starting vertex to all other vertices. Then it iteratively relaxes those estimates by finding new paths that are shorter than the previously overestimated paths.

By doing this repeatedly for all vertices, we can guarantee that the result is optimized.

steps for bellman ford algorithm
Step-1 for Bellman Ford's algorithm
steps for bellman ford algorithm
Step-2 for Bellman Ford's algorithm
steps for bellman ford algorithm
Step-3 for Bellman Ford's algorithm
steps for bellman ford algorithm
Step-4 for Bellman Ford's algorithm
steps for bellman ford algorithm
Step-5 for Bellman Ford's algorithm
steps for bellman ford algorithm
Step-6 for Bellman Ford's algorithm
'Bellman Ford Pseudocode
We need to maintain the path distance of every vertex. We can store that in an array of size v, where v is the number of vertices.

We also want to be able to get the shortest path, not only know the length of the shortest path. For this, we map each vertex to the vertex that last updated its path length.

Once the algorithm is over, we can backtrack from the destination vertex to the source vertex to find the path.

function bellmanFord(G, S)
  for each vertex V in G
    distance[V] <- infinite
      previous[V] <- NULL
  distance[S] <- 0

  for each vertex V in G				
    for each edge (U,V) in G
      tempDistance <- distance[U] + edge_weight(U, V)
      if tempDistance < distance[V]
        distance[V] <- tempDistance
        previous[V] <- U

  for each edge (U,V) in G
    If distance[U] + edge_weight(U, V) < distance[V}
      Error: Negative Cycle Exists

  return distance[], previous[]
Bellman Ford vs Dijkstra
Bellman Ford's algorithm and Dijkstra's algorithm are very similar in structure. While Dijkstra looks only to the immediate neighbors of a vertex, Bellman goes through each edge in every iteration.

Dijkstra's vs Bellman Ford's Algorithm
Bellman Ford's Algorithm vs Dijkstra's Algorithm
Python, Java and C/C++ Examples
Python
Java
C
C++
// Bellman Ford Algorithm in Java

class CreateGraph {

  // CreateGraph - it consists of edges
  class CreateEdge {
    int s, d, w;

    CreateEdge() {
      s = d = w = 0;
    }
  };

  int V, E;
  CreateEdge edge[];

  // Creates a graph with V vertices and E edges
  CreateGraph(int v, int e) {
    V = v;
    E = e;
    edge = new CreateEdge[e];
    for (int i = 0; i < e; ++i)
      edge[i] = new CreateEdge();
  }

  void BellmanFord(CreateGraph graph, int s) {
    int V = graph.V, E = graph.E;
    int dist[] = new int[V];

    // Step 1: fill the distance array and predecessor array
    for (int i = 0; i < V; ++i)
      dist[i] = Integer.MAX_VALUE;

    // Mark the source vertex
    dist[s] = 0;

    // Step 2: relax edges |V| - 1 times
    for (int i = 1; i < V; ++i) {
      for (int j = 0; j < E; ++j) {
        // Get the edge data
        int u = graph.edge[j].s;
        int v = graph.edge[j].d;
        int w = graph.edge[j].w;
        if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v])
          dist[v] = dist[u] + w;
      }
    }

    // Step 3: detect negative cycle
    // if value changes then we have a negative cycle in the graph
    // and we cannot find the shortest distances
    for (int j = 0; j < E; ++j) {
      int u = graph.edge[j].s;
      int v = graph.edge[j].d;
      int w = graph.edge[j].w;
      if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
        System.out.println("CreateGraph contains negative w cycle");
        return;
      }
    }

    // No negative w cycle found!
    // Print the distance and predecessor array
    printSolution(dist, V);
  }

  // Print the solution
  void printSolution(int dist[], int V) {
    System.out.println("Vertex Distance from Source");
    for (int i = 0; i < V; ++i)
      System.out.println(i + "\t\t" + dist[i]);
  }

  public static void main(String[] args) {
    int V = 5; // Total vertices
    int E = 8; // Total Edges

    CreateGraph graph = new CreateGraph(V, E);

    // edge 0 --> 1
    graph.edge[0].s = 0;
    graph.edge[0].d = 1;
    graph.edge[0].w = 5;

    // edge 0 --> 2
    graph.edge[1].s = 0;
    graph.edge[1].d = 2;
    graph.edge[1].w = 4;

    // edge 1 --> 3
    graph.edge[2].s = 1;
    graph.edge[2].d = 3;
    graph.edge[2].w = 3;

    // edge 2 --> 1
    graph.edge[3].s = 2;
    graph.edge[3].d = 1;
    graph.edge[3].w = 6;

    // edge 3 --> 2
    graph.edge[4].s = 3;
    graph.edge[4].d = 2;
    graph.edge[4].w = 2;

    graph.BellmanFord(graph, 0); // 0 is the source vertex
  }
}
Bellman Ford's Complexity
'Time Complexity
Best Case Complexity	O(E)
Average Case Complexity	O(VE)
Worst Case Complexity	O(VE)
Space Complexity
And, the space complexity is O(V).

Bellman Ford''s Algorithm Applications
For calculating shortest paths in routing algorithms
For finding the shortest path




