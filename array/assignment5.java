/*

Write a program to find duplicate numbers in array and their frequency. 
  e.g. [1,2,1,3,1,4,2]
  output: number 1   frequency 3                                                                                                                                 number 2   frequency 2
*/

public class assignment5 {  
          
    public static void main(String[] args) {   
        int [] arr = new int [] {21,11,21,30,30,40,11,30,27,33};
        int [] fr = new int [arr.length];
        System.out.println("INPUT DATA IS\n");
        for(int k:arr)
        {
            System.out.println(k);
        }
        System.out.println("\n");
        int visited = 1;  
        
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }       
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("Element:" + arr[i] + " Frequency:" + fr[i]);  
        }  
    }  
}