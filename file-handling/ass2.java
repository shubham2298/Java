import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.*;


class ass2
{
    public static void main(String args[]) throws IOException
    {
        ArrayList<String> r1=new ArrayList<>();
        FileReader f1=new FileReader("/home/gslab/Desktop/java/Assignment/file-handling/input.txt");
        BufferedReader br=new BufferedReader(f1);
        String s=null;
        int cnt=0;
     ;
       
       
        //System.out.println(lines);
        //String list="you";
        while(br.ready())
        {
            
            r1.add(br.readLine());
            cnt=cnt+1;
        }
        Iterator i1=r1.iterator();
        String word[];
        while(i1.hasNext())
        {
            String obj=(String)i1.next();
            word=obj.split(" ");
            if(word[0].equals("I")||word[0].equals("you"))
            {
            System.out.println(obj);
            }
        }
        
        //System.out.println(r1);
        System.out.println(cnt);
        br.close();
    }
}