package test4;

import java.util.*;
public class Main {

	public int solution(String stra, String strb) {
		int answer = 0;
		HashMap<Character, Integer> a = new HashMap<>();
		HashMap<Character, Integer> b = new HashMap<>();
		for(char x : strb.toCharArray()) {
			b.put(x, b.getOrDefault(x, 0)+1);
		}
		int len = strb.length()-1;
		for(int i=0; i<len; i++) {
			a.put(stra.charAt(i), a.getOrDefault(stra.charAt(i), 0)+1);
		}
		int lt=0;
		for(int rt=len; rt<stra.length(); rt++) {
			a.put(stra.charAt(rt), a.getOrDefault(stra.charAt(rt), 0)+1);
			if(b.equals(a)) {
				answer++;
			}
			a.put(stra.charAt(lt), a.getOrDefault(stra.charAt(lt), 0)-1);
			if(a.get(stra.charAt(lt))==0) {
				a.remove(stra.charAt(lt));
			}
			lt++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		String stra = in.next();
		String strb = in.next();
		System.out.print(T.solution(stra, strb));
	}

}
