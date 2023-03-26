import java.util.ArrayList;
//used to help sort
import java.util.Comparator;

import org.hamcrest.core.AllOf;

class Main{
	public static void main(String[]args){
		ArrayList<Integer> numbers=new ArrayList<Integer>();

		numbers.add(5);//0
		numbers.add(2);//1
		numbers.add(3);//2
		numbers.add(4);//3
		//we can also sort our numbers
		numbers.add(1);//4
		
		//Sorts our ArrayList in it's natural order.1-5"included the value change aswell.
		numbers.sort(Comparator.naturalOrder());
		//we can reverse it aswell
		numbers.sort(Comparator.reverseOrder());
		//set method. We can replace a index with a different value
		numbers.set(2,Integer.valueOf(30));

		//ForEach loops. We can set a certain actions for each Array in our list.print on line 27.For each number in our Array List we want it to perform the Multiplication of 2.
		numbers.forEach(number -> {
			System.out.println(number*2);
		});
		//We can replace each Array with the multiplied answer.
		System.out.println(numbers.toString());
		//check our Size
		System.out.println(numbers.size());
		//check to see if a certain value is within our Array or not. 
		System.out.println(numbers.contains(Integer.valueOf(10)));
		//Check if anything is contained at All.To make this True we can insert "numbers.clear();" after our ArrayList.
		System.out.println(numbers.isEmpty());
	}
}
	