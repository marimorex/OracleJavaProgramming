package oracle_course_test;

import java.util.ArrayList;
import java.util.List;

class Shape { }
class Circle extends Shape { }
class Rectangle extends Shape { }
class Node <T> { }
public class test{
	/*public static void main(String[] args){
		Node <Circle>nc = new Node<>();
	//	Node <Shape>  ns = nc;
	}*/

	public static void main(String[] args){

		List<Integer> li=new ArrayList();
		li.add(1);
		li.add(2);
		print(li);
	}
	public static void print(List<? extends Number> list) {
		for (Number n : list)
			System.out.print(n + " ");
	}
}
