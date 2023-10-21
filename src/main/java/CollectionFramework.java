import java.sql.Array;
import java.util.*;

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

       //stores multiple data in the stack we use Iterator object to store they we iterate throught it
       Iterator<String> stackD = name.iterator();
       while(stackD.hasNext()){
           System.out.println(stackD.next());
       }
   }


   public void linkedList(){
       //this implement collection interface couse doubly LinkedList
       LinkedList<String> names = new LinkedList();
       names.add("Kevine");
       names.add("Divine");

       //Iteration throught the LinkedList we use
       Iterator<String> itr = names.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
   }



   public void vector(){
       Vector<String> name = new Vector();
       name.add("kEVINE");
       name.add("Ok feel bad know");

       Iterator<String> itr = name.iterator();
       while (itr.hasNext()){
           System.out.println(itr.next());
       }
   }


   public void map(){
       Map map = new HashMap();
       map.put(1,"kevine");
       map.put(2,"Divine");

       //Traversing we convert into the set
       Set set = map.entrySet(); //entry set to  insert into the set
       Iterator itr = set.iterator();
       while(itr.hasNext()){
           //Map.Entity tp convert into the entry map
           Map.Entry entry = (Map.Entry)itr.next();
           System.out.println(entry.getKey() + "" + entry.getValue());
//           System.out.println(itr.next());  // this give me the last element
       }
   }
}
