package bendijo_quiz1;

import java.util.Arrays;
import java.util.Scanner;


public class Bendijo_Quiz1 {

    
    public static void main(String[] args) { 
        
        Scanner scan = new Scanner(System.in);
         while(true){
             System.out.println("number");
             int input = scan.nextInt();
             if (input ==1 ){
             System.out.println(number1(1));
         }else{
                 System.out.println(number2(1));
             }}}
        
      

    
    
    
        private static int number1(int quiz){
            

        int [] arr = {82,44,96,7,13,56,74,14,98,36};
        
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
            
        }
        return 0;

    }
        private static int number2(int code){
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Enter the size of your array:");
            
            int size = scan.nextInt();
            int [] arr = new int [size];
            
            System.out.println("Enter your " + size + " element");
            for (int i = 0; i < size; i++) {
                System.out.println("Your elements are " + (arr[size]));
//                arr[i] = scan.nextInt();
            }
//                System.out.println(arr[i]);
         scan.close();
        return 0;
       
                
            
           
            
        }
}

//    private static int number3(int lo){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the size of your array");
//        int size = scan.nextInt();
//        int [] arr = new int [size];
//        
//        System.out.println("Enter your element");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scan.nextInt();
//            
//        }
//        System.out.println("Your elements are" + Arrays.toString(arr));
//        
//        for (int i = 0; i < size; i++) {
//            
//         int n = new int [arr];
//        for (int i = 0; i <  n - 1; i++) {
//            int minIndex = i; 
//            for (int j = i + 1; j < n; j++) {
//                if(arr[j] < arr[minIndex]){
//                    minIndex = j;
//                }
//            }
//            int m = arr[i];
//            arr[i] = arr [minIndex];
//            arr[minIndex] = m;
//
//            
//        System.out.println("Your arrays are : " +  );
//        
//        return 0;
//        
//}
