import java.util.*;

public class StackSoltions{
    public static void main(String[] args){
        Stack<Integer> s1 = new Stack<>();
        s1.push(4);
        s1.push(599);
        s1.push(344);
        s1.push(65);
       
        int indexFound = s1.search(5);
        System.out.println(indexFound+"\n");
       
        System.out.print(s1);
        System.out.println("\n");

        Iterator it = s1.iterator();
        while(it.hasNext()){
            Object s2 = it.next();
            System.out.println(" "+s2);
        }

        System.out.println("\n Size:"+s1.size()+"\n");
        
        s1.sort(null);
        System.out.print(s1);

        s1.pop();
        s1.pop();
        int k= s1.peek();
        System.out.println("\npeeking after 2 pops gets you:"+k);
        
        System.out.println("\n is the stack empty? -->"+s1.isEmpty());

        s1.pop();
        s1.pop();
        
        System.out.println("\n is the stack empty after 2 more pops s? -->"+s1.isEmpty());
    }
}