import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
public class arraylist
{
    public static void main(String args[]) 
    {
        
        ArrayList<String> l1=new ArrayList<String>();
        l1.add("shubham");
        l1.add("123");
        l1.add("12.3");
        l1.set(2, null);
        System.out.println(l1);
        System.out.println("ElEMENT     "+l1.get(2));
        Iterator i=l1.iterator();
        while(i.hasNext())
        {
            String s=(String)i.next();
            System.out.println(s);
        }
    }
}