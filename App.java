package com.te.projects;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String a1="What guarantees type-safety in a collection?\n (a)Generics\n (b)Abstract class\n (c)Interfaces\n (d)Collection";
		String a2="HashSet internally uses?\n (a)Set\n (b)HashMap\n (c)List\n (d)Collection";
		String a3="The most used interfaces from the collection framework are?\n (a)List\n (b)Map\n (c)Set\n (d)Queue";
		String a4="The root interface of Java collection framework hierarchy is –\n (a)Collection\n (b)Root\n (c)Collections\n (d)List/Set";
		String a5="Which of those is synchronized?\n (a)ArrayList\n (b)LinkedList\n (c)Vector\n (d)NOTA";
		String a6="ArrayList implements that of the following?\n (a)List\n (b)RandomAccess\n (c)Cloneable\n (d)AOTA";
		String a7="Which of those permits the storage of the many null values?\n (a)List\n (b)Set\n (c)NOTA\n (d)AOTA";
		String a8="Vector extends that of these?\n (a)ArrayList\n (b)LinkedList\n (c)AbstractList\n (d)None";
		String a9="LinkedList implements?\n (a)Deque\n (b)List\n (c)NOTA\n (d)Both of Above";
		String a10="In Iterator, nextElement() method of Enumeration has been changed to:\n (a)next()\n (b)genNext()\n (c)name remains same\n (d)returnNext()";

		
		Questions[] questions= {
				new Questions(a1,"a"),
				new Questions(a2,"b"),
				new Questions(a3,"b"),
				new Questions(a4,"d"),
				new Questions(a5,"c"),
				new Questions(a6,"d"),
				new Questions(a7,"d"),
				new Questions(a8,"c"),
				new Questions(a9,"d"),
				new Questions(a10,"c"),
		};
		takeTest(questions);
	}
	public static void takeTest(Questions [] questions){
		int score =0;
		Scanner keyboardInput=new Scanner(System.in);
		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer=keyboardInput.nextLine();
			if (answer.equals(questions[i].answer)) {
				score++;
			}
		}
		System.out.println("You got "+score+"/"+questions.length);
	}
}
