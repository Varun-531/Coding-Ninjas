import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {

	public static boolean printHelper(int edges[][], int v1, int v2,boolean visited[]) {

		/*
		 * Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */

		Queue<Integer> q = new LinkedList<>();
		q.add(v1);
		boolean ans = false;
		while (q.size() != 0) {
			int firstelem = q.remove();
			if (firstelem == v2) {
				return true;
			}
			// System.out.print(firstelem + " ");
			visited[firstelem] = true;
			for (int i = 0; i < edges.length; i++) {
				if (edges[firstelem][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		int edges[][] = new int[V][V];
		for (int i = 0; i < E; i++) {
			int fv = s.nextInt();
			int sv = s.nextInt();
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}
		int v1 = s.nextInt();
		int v2 = s.nextInt();
		boolean visited[] = new boolean[edges[0].length];
		System.out.println(printHelper(edges, v1, v2,visited));
	}

}