import java.sql.Array;
import java.util.ArrayList;
import java.util.Stack;

public class CollectionFramework {

   public void LinkedList(){
       //creating alist
       ArrayList<Integer> number = new ArrayList();
       //adding number
       for(int i=0 ; i<5 ; i++){
           number.add(i);
       }
       //printing data
       System.out.println(number);
       //removing elemt
       int da = number.remove(3);
       System.out.println("deleted element :"+da);

       //Print one by one
       
   }

   public void Stack(){
       //first in last out we push

       Stack<String> name = new Stack();
       name.push("kevine");
       name.push("Divine");

   }


}
