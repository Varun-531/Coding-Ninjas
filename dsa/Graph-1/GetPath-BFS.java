import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Solution {
	
	public static void getPathBFS(int edges[][], int start,int end) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		int n = edges[0].length;
		boolean visited[] = new boolean[n];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		boolean flg = false;
		visited[start]=true;
		while (q.size() != 0) {
			int firstelem = q.remove();
			if(firstelem==end){
				flg=true;
				break;
			}
		//	System.out.print(firstelem + " ");
			visited[start] = true;
			for (int i = 0; i < n; i++) {
				if (edges[firstelem][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
					hm.put(i, firstelem);
				}
			}
		}
		if (flg == true) {
			int temp = end;
			while (temp != start) {

				System.out.print(temp + " ");
				temp = hm.get(temp);
			}
			System.out.print(start + " ");

		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		int graph[][] = new int[v][v];
		while (e > 0) {
			e--;
			int t1 = sc.nextInt();
			int t2 = sc.nextInt();
			graph[t1][t2] = 1;
			graph[t2][t1] = 1;
		}
		int start = sc.nextInt();
		int end = sc.nextInt();

		getPathBFS(graph, start, end);
	}
}