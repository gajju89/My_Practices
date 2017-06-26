package com.gajju.ds.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
	
	int V; //number of vertices
	LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	public BFS(int s)
	{
		this.V=s;
		adj=new LinkedList[s];
		for(int i=0;i<s;i++)
		{
			adj[i]=new LinkedList();
		}
	}
	
	public void addEdge(int v,int w)
	{
		adj[v].add(w);
	}
	
	public void BFSSearch(int source)
	{
		boolean[] visited=new boolean[V];
		
		LinkedList<Integer> queue=new LinkedList<Integer>();
		visited[source]=true;
		queue.add(source);
		while(queue.size()!=0)
		{
			//int n=queue.poll();
			 source=queue.pollFirst();
			System.out.println(source+" ");
			
			Iterator<Integer> j=adj[source].listIterator();
			while(j.hasNext())
			{
				int it=j.next();
				if(!visited[it])
				{
					visited[it]=true;
					queue.add(it);
				}
			}
		}
		
	}
	
	public static void main(String args[])
	{
		BFS bs=new BFS(4);
		bs.addEdge(0, 1);
		bs.addEdge(0, 2);
		bs.addEdge(1, 2);
		bs.addEdge(1, 5);
		bs.addEdge(1, 7);
		bs.addEdge(2, 0);
		bs.addEdge(2, 3);
		bs.addEdge(3, 3);
		//bs.addEdge(2, 1);
		System.out.println("BFS Search:");
		bs.BFSSearch(2);
	 
	}

}
