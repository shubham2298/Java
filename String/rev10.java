import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class rev10 {

 public static void main(String[] args) {
  BufferedReader objReader = null;
  String[] words=null;
  
  int wc=0;
  try {
   String strCurrentLine;

   objReader = new BufferedReader(new FileReader("/home/gslab/Desktop/java/Assignment/String/sample.txt"));
    int c=1;
   while ((strCurrentLine = objReader.readLine()) != null) {

    words=strCurrentLine.split(" ");
    String l1="";
    String l2="";
    for(String w:words)
    { 
        c=c+1;
        //System.out.println(c);
        StringBuffer sb=new StringBuffer(w);
        sb.reverse();
        if(c==10)
        {
           l1+= sb.toString()+"#10";
          // System.out.println(l2);
           //System.out.println("3333333333333333333333333");
           c=0;
        }
        
        l1+=sb.toString()+" ";
        
    }
    System.out.println(l1);//.trim());
    wc=wc+words.length;
    //System.out.println(strCurrentLine);
    
   }
   System.out.println("COUNT "+wc);
  } catch (IOException e) {

   e.printStackTrace();

  } finally {

   try {
    if (objReader != null)
     objReader.close();
   } catch (IOException ex) {
    ex.printStackTrace();
   }
  }
 }
}
