package hash;

import java.util.HashMap;

public class Hashing {
	private String name;
	private int age;
	
	
	public Hashing(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public static void main(String[] args) {
		Hashing h1 = new Hashing("durai", 15);
		Hashing h2 = new Hashing("kutty", 20);
		
		HashMap<Hashing, String> hm = new HashMap<>();
		hm.put(h1, "qwert");
		hm.put(h2, "asdfg");
		h1.age = 10;
		
		//System.out.println(hm.get(h1));
		
		//System.out.println(h1.age);
		
		
		HashMap<String, HashMap<String, String>> hm1 = new HashMap<>();
		HashMap<String, String> m1 = new HashMap<>();
		HashMap<String, String> m2 = new HashMap<>();
		
		hm1.put("one", m1);
		hm1.put("two",m2);
		
		m1.put("a", "A");
		m2.put("b", "B");
		m1.put("c", "C");
		m2.put("d", "D");
		
		System.out.println(hm1);
		

	}

}
