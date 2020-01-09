
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
class ramdom
{
    public static void main(String args[]) throws IOException
    {
        FileReader f1=new FileReader("/home/gslab/Desktop/java/Assignment/file-handling/input.txt");
        BufferedReader br=new BufferedReader(f1);
        String s=null;
        int cnt=0;
        while((s=br.readLine())!=null)
        {
            if(cnt%2==0)
            {
             System.out.println(s);
            }
             cnt=cnt+1;
        }

        f1.close();
    }
}