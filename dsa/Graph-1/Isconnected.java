import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class Solution {

	public static boolean[] DF(int graph[][],int index,boolean visited[]){
		visited[index]=true;
		for(int i=0;i<graph.length;i++){
			if(graph[index][i]==1&&visited[i]==false){
				DF(graph,i,visited);
			}
		}
		return visited;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
       	Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		if(v==0){
			System.out.print(true);
			return;
		}
		if (e == 0&&v>1) {
			System.out.print(false);
			return;
		}
		int graph[][] = new int[v][v];
		while (e > 0) {
			e--;
			int t1 = sc.nextInt();
			int t2 = sc.nextInt();
			graph[t1][t2] = 1;
			graph[t2][t1] = 1;
		}
		boolean visited[] = new boolean[graph[0].length];
		visited=DF(graph,0,visited);
		for(int i=0;i<visited.length;i++){
			if(visited[i]==false){
				System.out.println(false);
				return;
			}
		}
		System.out.print(true);
	}

}