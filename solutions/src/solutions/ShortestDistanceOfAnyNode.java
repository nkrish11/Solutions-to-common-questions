package solutions;

//Algorithm 

public class ShortestDistanceOfAnyNode {
	
	public static void main(String[] args){
		int[][] admat=new int[N][N];
		
		int[] spdy=new int[N];
		
		for(node currnode : all nodes in the graph){
			findshortestpath(currnode,admat,spdy);
		}
	}
	
	public static int findshortestpath(node currnode,int[][] admat,int[] spdy){
		int sp;
		int shortestpath=0;
		
		if(currnode == S){
			return 0;
		}
		
		if(spdy[currnode] != 0){
			return spdy[currnode];
			
		}
		
		for (node n : neighbours of currnode){
			
				sp=sp+findshortestpath(n);
			
			if(sp<shortestpath){
				shortestpath=sp;
			}
		}
		spdy[currnode]=shortestpath;
		return shortestpath;
		
	}

}
