import java.util.*;
public class Main
{
public static void main (String[] args) {
Queue<Integer> q=new LinkedList<>();
q.add(2); 
q.add(4);
System.out.print(q);
System.out.print(q.remove());
System.out.print(q);
}
}