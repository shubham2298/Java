import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class revarticle {

 public static void main(String[] args) {
  BufferedReader objReader = null;
  String[] words=null;
  int wc=0;
  try {
   String strCurrentLine;

   objReader = new BufferedReader(new FileReader("/home/gslab/Desktop/java/Assignment/String/sample.txt"));

   while ((strCurrentLine = objReader.readLine()) != null) {

    words=strCurrentLine.split(" ");
    String l1="";
    for(String w:words)
    {

        /*
        
        for(String word : words)
    {
        if(word.equals("the")||word.equals("a")||word.equals("an"))
        {
            count=count+1;
        }
        
    }
        */
        if(w.equals("the")||w.equals("a")||w.equals("na"))
        {
            w=" "+" ";
        }
        StringBuffer sb=new StringBuffer(w);
        sb.reverse();
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
