package test5;

import java.util.*;
public class Main {

	public int solution(int n, int m, int[] arr) {
		int answer = -1;
		TreeSet<Integer> a = new TreeSet<>(Collections.reverseOrder());
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					a.add(arr[i] + arr[j] + arr[k]);
				}
			}
		}
		int cnt = 0;
		for(int x : a) {
			cnt++;
			if(cnt==m) {
				answer = x;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.print(T.solution(n, m, arr));
	}

}
