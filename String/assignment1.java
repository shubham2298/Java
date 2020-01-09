import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class ReadFileExample {

 public static void main(String[] args) {
  BufferedReader objReader = null;
  String[] words=null;
  int wc=0;
  try {
   String strCurrentLine;

   objReader = new BufferedReader(new FileReader("/home/gslab/Desktop/java/Assignment/String/sample.txt"));

   while ((strCurrentLine = objReader.readLine()) != null) {

    words=strCurrentLine.split(" ");
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
