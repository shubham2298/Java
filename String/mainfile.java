import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;

 class mainfile {

    void CountArticle()
    {
        
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

    void count()
    {
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



    //-----------------------------------------

    void unique(BufferedReader reader) throws  Exception
    {
        //Path path = Paths.get(System.getProperty("user.dir"))
		//		.resolve("article.txt");
		
///BufferedReader reader = new BufferedReader(new FileReader("/home/gslab/Desktop/java/Assignment/String/sample.txt"));
		
		Set<String> wordsOfArticle = new HashSet<>();
		
		String line = reader.readLine();
		int totalLines = 0;
		int totalWords = 0;
		
		while(line != null) {
			System.out.println("Processing line: " + line);
			
			// if there is actual content in the line...
			if(!line.trim().equals("")) {
				String [] words = line.split(" ");
				totalWords += words.length;
				
				for(String word : words) {
					String cleanedUpWord = word.toLowerCase() 
							.replace(",", "") 
							.replace(":", "") 
							.replace(".", "")
							.replace("\"", "");
					
					wordsOfArticle.add(cleanedUpWord);
				}	
			}
			totalLines++;
			line = reader.readLine();
		}
		
		System.out.println(wordsOfArticle);
		
		System.out.println();
		System.out.println("How many unique words were in the article?");
		System.out.println(wordsOfArticle.size());
		System.out.println();
		System.out.println("Total lines:");
		System.out.println(totalLines);
		System.out.println("Total Words: ");
        System.out.println(totalWords);
        reader.close();
    }


    String reverse1()
    {
        // List<String> strLines;
        // String eachWord = null;
        // strLines = Collections.singletonList("/home/gslab/Desktop/java/Assignment/String/sample.txt");
        // for (int i = strLines.size() - 1; i >= 0; i--) {
        //     String strLin = strLines.get(i).trim();
        //     if (strLin.equals("")) {
        //         System.out.println();
        //     } else {
        //         String[] wordArr = strLin.split(" ");
        //         for (int j = wordArr.length - 1; j >= 0; j--) {
        //             eachWord = wordArr[j];
        //             if (eachWord.length() > 1) {
        //                 if (eachWord.charAt(eachWord.length() - 1) == '.'
        //                         || eachWord.charAt(eachWord.length() - 1) == ':'
        //                         || eachWord.charAt(eachWord.length() - 1) == ',') {
        //                     StringBuffer sb = new StringBuffer("");
        //                     sb.append(eachWord.charAt(eachWord.length() - 1));
        //                     for (int k = 0; k < eachWord.length() - 1; k++) {
        //                         sb.append(eachWord.charAt(k));
        //                     }
        //                     System.out.print(sb);
        //                 } else {
        //                     System.out.print(eachWord);
        //                 }
        //             }
        //             if (j != 0) {
        //                 System.out.print(" ");
        //             }
        //         }
        //         System.out.println();
        //     }

        // }
        // return eachWord;
        //System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        String eachWord=null;
        try {
            List<String> strLines = Collections.emptyList();
            
            strLines = Files.readAllLines(Paths.get("/home/gslab/Desktop/java/Assignment/String/sample.txt"));//, StandardCharsets.UTF_8);
            for (int i = strLines.size() - 1; i >= 0; i--) {
                String strLin = strLines.get(i).trim();
                if (strLin.equals("")) {
                    System.out.println();
                } else {
                    String[] wordArr = strLin.split(" ");
                    for (int j = wordArr.length - 1; j >= 0; j--) {
                       eachWord = wordArr[j];
                        if (eachWord.length() > 1) {
                            if (eachWord.charAt(eachWord.length() - 1) == '.'
                                    || eachWord.charAt(eachWord.length() - 1) == ':'
                                    || eachWord.charAt(eachWord.length() - 1) == ',') {
                                StringBuffer sb = new StringBuffer("");
                                sb.append(eachWord.charAt(eachWord.length() - 1));
                                for (int k = 0; k < eachWord.length() - 1; k++) {
                                    sb.append(eachWord.charAt(k));
                                }
                                System.out.print(sb);
                            } else {
                                System.out.print(eachWord);
                                //return eachWord;
                            }
                            
                        }
                        if (j != 0) {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
        
            }
        } catch (FileNotFoundException fnf) {
            System.out.println(fnf);
        } catch (Exception e) {
            System.out.println(e);
        }return eachWord;
        
    }

 

     void revarticle()
     {
        String eachWord=null;
        try {
            List<String> strLines = Collections.emptyList();
            
            strLines = Files.readAllLines(Paths.get("/home/gslab/Desktop/java/Assignment/String/sample.txt"));//, StandardCharsets.UTF_8);
            for (int i = strLines.size() - 1; i >= 0; i--) {
                String strLin = strLines.get(i).trim();
                if (strLin.equals("")) {
                    System.out.println();
                } else {
                    String[] wordArr = strLin.split(" ");
                    for (int j = wordArr.length - 1; j >= 0; j--) {
                       eachWord = wordArr[j];
                        if(eachWord.equals("a")||eachWord.equals("an")||eachWord.equals("the"))
                        {
                            eachWord=" "+" ";
                        }
                       //--------------------------------
                        if (eachWord.length() > 1) {
                            if (eachWord.charAt(eachWord.length() - 1) == '.'
                                    || eachWord.charAt(eachWord.length() - 1) == ':'
                                    || eachWord.charAt(eachWord.length() - 1) == ',') {
                                StringBuffer sb = new StringBuffer("");
                                sb.append(eachWord.charAt(eachWord.length() - 1));
                                for (int k = 0; k < eachWord.length() - 1; k++) {
                                    sb.append(eachWord.charAt(k));
                                }
                                System.out.print(sb);
                            } else {
                                System.out.print(eachWord);
                                //return eachWord;
                            }
                            
                        }
                        if (j != 0) {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
        
            }
        } catch (FileNotFoundException fnf) {
            System.out.println(fnf);
        } catch (Exception e) {
            System.out.println(e);
        }


        

    //     BufferedReader objReader = null;
    //     String[] words=null;
    //     int wc=0;
    //     try {
    //         words=
    //      String strCurrentLine;
      
    //     //  objReader = new BufferedReader(new FileReader("/home/gslab/Desktop/java/Assignment/String/sample.txt"));
      
    //     //  while ((strCurrentLine = objReader.readLine()) != null) {
      
    //     //   words=strCurrentLine.split(" ");
    //     //   String l1="";
    //       for(String w:words)
    //       {
      
    //           /*
              
    //           for(String word : words)
    //       {
    //           if(word.equals("the")||word.equals("a")||word.equals("an"))
    //           {
    //               count=count+1;
    //           }
              
    //       }
    //           */
    //           if(w.equals("the")||w.equals("a")||w.equals("na"))
    //           {
    //               w=" "+" ";
    //           }
    //           StringBuffer sb=new StringBuffer(w);
    //           sb.reverse();
    //           l1+=sb.toString()+" ";
              
    //       }
    //       System.out.println(l1);//.trim());
    //       wc=wc+words.length;
    //       //System.out.println(strCurrentLine);
          
    //      }
    //      System.out.println("COUNT "+wc);
    //     } catch (IOException e) {
      
    //      e.printStackTrace();
      
    //     } finally {
      
    //      try {
    //       if (objReader != null)
    //        objReader.close();
    //      } catch (IOException ex) {
    //       ex.printStackTrace();
    //      }
    //     }
     }



     public  void palindromeCount() throws FileNotFoundException,IOException
     {
         // File f1= new File("string_file.txt");
          BufferedReader br= new BufferedReader(new FileReader("/home/gslab/Desktop/java/Assignment/String/sample.txt"));
         String s2;
         Set<String> PalindromSet= new HashSet<String>();
         while((s2=br.readLine()) != null)
         {
             String[] palindrom_words=s2.split("[-!~.,:;()\\s]+");
             for(int i=0; i<palindrom_words.length;i++)
             {
                 String check= palindrom_words[i];
                 String rev="";
                 for(int j=check.length()-1;j>=0;j--)
                 {
                     rev=rev+check.charAt(j);
                 }
                 if(rev.equalsIgnoreCase(check))
                 {
                     if(check.length()>1)
                     {
                         PalindromSet.add(check);
                     }                
                 }
                 else
                 {
                     continue;
                 }
             }
                         
         }
         br.close();
         System.out.println("Total palindrom :"+PalindromSet.size());
         for(String val:PalindromSet)
         {
             System.out.println(val);
         }
     }




    void addspecialchar()
    {
         

        // String eachWord=null;
        // try {
        //     List<String> strLines = Collections.emptyList();
            
        //     strLines = Files.readAllLines(Paths.get("/home/gslab/Desktop/java/Assignment/String/sample.txt"));//, StandardCharsets.UTF_8);
        //     for (int i = strLines.size() - 1; i >= 0; i--) {
        //         String strLin = strLines.get(i).trim();
        //         if (strLin.equals("")) {
        //             System.out.println();
        //         } else {
        //             String[] wordArr = strLin.split(" ");
        //             for (int j = wordArr.length - 1; j >= 0; j--) {
        //                eachWord = wordArr[j];
        //                 if (eachWord.length() > 1) {
        //                     if (eachWord.charAt(eachWord.length() - 1) == '.'
        //                             || eachWord.charAt(eachWord.length() - 1) == ':'
        //                             || eachWord.charAt(eachWord.length() - 1) == ',') {
        //                         StringBuffer sb = new StringBuffer("");
        //                         sb.append(eachWord.charAt(eachWord.length() - 1));
        //                         for (int k = 0; k < eachWord.length() - 1; k++) {
        //                             sb.append(eachWord.charAt(k));
        //                         }
        //                         System.out.print(sb);
        //                     } else {
        //                         System.out.print(eachWord);
        //                         //return eachWord;
        //                     }
                            
        //                 }
        //                 if (j != 0) {
        //                     System.out.print(" ");
        //                 }
        //             }
        //             System.out.println();
        //         }
        
        //     }
        // } catch (FileNotFoundException fnf) {
        //     System.out.println(fnf);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }



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
 public static void main(String[] args)throws Exception {
     BufferedReader reader = new BufferedReader(new FileReader("/home/gslab/Desktop/java/Assignment/String/sample.txt"));
     int choice;
  mainfile m1=new mainfile();
do{
 System.out.println("\n1\tCount Words\n2\tUnique Words\n3\tReverse\n4\tRemove Article\n5\tAdd Special Character\n6\tCount Article and Vowel\n7\tPalindrome\n9\tExit\n");
 Scanner input = new Scanner(System.in);
    	
 System.out.print("Enter Case Which You Want: ");
 choice = input.nextInt();
 
 switch(choice)
 {
     case 1:
            m1.count();
            break;
    case 2:
            m1.unique(reader);

            break;

    case 3://m1.reverse();
            System.out.println("11111111111111111111111111111111111111");
            System.out.println(m1.reverse1());
            break;

    case 4:m1.revarticle();
            // String words=m1.reverse1();
            // System.out.println("222222222222222222222222222222222222222222222222222222");
            // System.out.println(words);
            break;

    case 5:m1.addspecialchar();
            break;

    case 6:m1.CountArticle();
            break;
    case 7:m1.palindromeCount();
            break;
 }
}while(choice!=9);
 
 }
}
