package com.gajju.ds.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
	
	private int V;
	LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	public DFS(int v)
	{
		this.V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i]=new LinkedList<Integer>();
		}
		
	}
	public void addEdge(int v,int w)
	{
		adj[v].add(w);
	}
	
	public void DFSUtil(int v)
	{
		boolean [] visited=new boolean[V];
		DFSSearch(v,visited);
	}
	private void DFSSearch(int v2, boolean[] visited) {
		// TODO Auto-generated method stub
		visited[v2]=true;
		System.out.print(" "+v2);
		
		Iterator<Integer> itr=adj[v2].iterator();
		while(itr.hasNext())
		{
			int n = itr.next();
            if (!visited[n])
            	DFSSearch(n, visited);
		}
		
	}
	
	public static void main (String args[])
	{
		DFS dfs=new DFS(4);
		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 2);
		dfs.addEdge(2, 0);
		dfs.addEdge(2, 3);
		dfs.addEdge(3, 3);
		System.out.println("After search:--------");
		dfs.DFSUtil(2);
	}

}
