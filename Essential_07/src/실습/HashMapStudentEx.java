package 실습;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Student {
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
}

public class HashMapStudentEx {
	public static void main(String[] args) {
		HashMap<String,Student> map = new HashMap<String,Student>();
		
		map.put("황기태", new Student(1,"010-111-1111"));
		map.put("한원선", new Student(2,"010-222-2222"));
		map.put("한홍진", new Student(3,"010-333-3333"));
		map.put("이영희", new Student(4,"010-444-4444"));
		
		System.out.println("HashMap의 요소의 개수 " + map.size());
		
		Set<String> names = map.keySet();
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			Student student = map.get(name);
			System.out.println(name + " : " + student.id + " " + student.tel);
		}
	}
}
