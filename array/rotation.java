//Write a program to rotate array by n numbers  
class rotation { 
     void rotate(int[] arr, int order) {
        if (arr == null || order<1) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        for (int i = 0; i < order; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    } 
  
    // Driver program to test above functions 
    public static void main(String[] args) 
    { 
        rotation rotate = new rotation(); 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        rotate.rotate(arr, 2);
    } 
} 
  
// This code has been contributed by Mayank Jaiswal 
