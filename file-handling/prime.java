import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;
import java.io.IOException;
class prime
{
    public static void main(String args[]) throws IOException,FileNotFoundException
    {
        
        FileReader f1=new FileReader("/home/gslab/Desktop/java/Assignment/file-handling/number.txt");
        FileWriter fout=new FileWriter("/home/gslab/Desktop/java/Assignment/file-handling/output.txt");
        BufferedReader br=new BufferedReader(f1);
        BufferedWriter bo=new BufferedWriter(fout);
        String n[];
        ArrayList<String> num=new ArrayList<>();
        
        while(br.ready())
        {
            
            num.add(br.readLine());
            
        }
        int flag=1;
        Iterator i1=num.iterator();
        while(i1.hasNext())
        {
            String temp=(String)i1.next();
            n=temp.split(" ");
            for(int i=0;i<10;i++)
            {
                flag=1;
                int l=Integer.parseInt(n[i]);

                
                //int l=Integer.parseIntn(n[i]);
                for(int j=2;j<=(Integer.parseInt(n[i])/2);++j)
                {

                    if((Integer.parseInt(n[i])==1)||(Integer.parseInt(n[i])==2))
                    {
                        break;
                    }
                    
                    if(l%j==0)
                    {
                        flag=0;
                    }
                    
                    
                }
                if(flag==1)
                {
                    bo.write(n[i]);
                    bo.write("\n");
                    System.out.println(Integer.parseInt(n[i]));

                }
            }
            //System.out.println(Integer.parseInt(n[1]));
        }
        //System.out.println(num);
        br.close();
        bo.close();
    }

}