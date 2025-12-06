import java.util.Scanner;
public class UCAT2{
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
              int[] numbers = new int[10];
              int count = 0;
              
              for (int i = 0; i < 10; i++){
                  System.out.print("Enter number " + (i + 1)+": ");
                  numbers[i] = sc.nextInt();
                  
                  for(int num : numbers){
                      if(num == 7){
                        count++;
                      }
                  }
              }
              System.out.print("The number 7 appears " + count + "times. ");
       }
    }
