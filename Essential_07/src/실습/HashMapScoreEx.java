package 실습;

import java.util.*;

public class HashMapScoreEx {
	public static void main(String[] args) {
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		javaScore.put("한홍진", 97);
		javaScore.put("황기태", 93);
		javaScore.put("이영희", 34);
		javaScore.put("정원석", 70);
		javaScore.put("한원선", 99);
		
		System.out.println("HashMap요소의 개수 : " + javaScore.size());
		
		Set<String> keys = javaScore.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + " : " +score);
		}
	}
}
