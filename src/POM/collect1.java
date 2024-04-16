package POM;

import java.util.ArrayList;

public class collect1 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList<>();
		l.add("hi");
		l.add(10);
		l.add(1.2);
		l.add(true);
		l.add("hi");
		l.add('a');
		l.add(" ");
		l.get(1);
		l.add(1,"byebye");
		l.remove(1);
		l.remove("hi");
		if(l.contains("hi"))
		{
			System.out.println("itsthere");
		}
		else
		{
			System.out.println("its not there");
		}
		System.out.println(l);
		System.out.println(l.get(1));
		System.out.println(l.size());

	}

}
