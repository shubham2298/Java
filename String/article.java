import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class article {

 public static void main(String[] args) {
  BufferedReader objReader = null;
  String[] words=null;
  int wc=0;
  int count=0;
  int v1=0;
  try {
   String strCurrentLine;

   objReader = new BufferedReader(new FileReader("/home/gslab/Desktop/java/Assignment/String/sample.txt"));

   while ((strCurrentLine = objReader.readLine()) != null) {

    
//----------------------------

//--------------------------

    words=strCurrentLine.split(" ");
    for(int i=0;i<words.length;i++)
    {
        for(int j=0;j<words[i].length();j++)
        {
            char ch=words[i].charAt(j);
            if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i')
       {
            v1=v1+1;
        }
            
        }
    }
    for(String word : words)
    {
        if(word.equals("the")||word.equals("a")||word.equals("an"))
        {
            count=count+1;
        }
        
    }
 //   char s1[]=words.toString().toCharArray();
   //int l=s1.length;
//    for(char c:s1)
//    {
//        if(c=='a'||c=='e'||c=='o'||c=='u'||c=='i')
//        {
//            v1=v1+1;
//        }

//        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
//        {
//            v1=v1+1;
//        }
       
//    }
  
    
   }
    
   System.out.println("COUNT a an the "+count);
   System.out.println("VOVLE "+v1);
  // System.out.println("COUNT "+wc);
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
