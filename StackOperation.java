package MyLinkedListExample;
import java.util.LinkedList;

public class StackOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> Value=new LinkedList<Integer>(); //define linked list
		 
		  //push() method is used to add element into LinkList
	             Value.push(70);
	             Value.push(30);
	             Value.push(56);
	             
	             //Display element of LinkList using for each loop 
	             for(int print:Value)
	            	 System.out.println(print);
	             
	               // print Top element of Stack
	         System.out.println("Top element is : " +Value.peek());
               
	         // Delete top element of Stack
	                  Value.pop();
	                  
	                  
	 	     //Display element of LinkList using for each loop 
	 	             for(int print:Value)
	 	            	 System.out.println(print);
	 	         // Delete top element of Stack
	                  Value.pop();
	                  Value.pop();
	           System.out.println("Display element of LinkList after pop opration"+Value);
	                  
	}

}
