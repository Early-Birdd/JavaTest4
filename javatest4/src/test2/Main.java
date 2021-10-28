package test2;

import java.util.*;
public class Main {

	public String solution(String str, String strr) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(char a : strr.toCharArray()) {
			if(!map.containsKey(a) || map.get(a)==0) {
				return "NO";	
			}
			map.put(a, map.getOrDefault(a,0)-1);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String strr = in.next();
		System.out.print(T.solution(str, strr));
	}

}
