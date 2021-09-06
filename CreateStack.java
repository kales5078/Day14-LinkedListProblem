package MyLinkedListExample;
import java.util.LinkedList;
//Create the class
public class CreateStack {

	public static void main(String[] args) {
	  LinkedList<Integer> Value=new LinkedList<Integer>(); //define linked list
	 
	  //push() method is used to add element into LinkList
             Value.push(70);
             Value.push(30);
             Value.push(56);
             
             //Display element of LinkList using for each loop 
             for(int print:Value)
            	 System.out.println(print);
      }
}
