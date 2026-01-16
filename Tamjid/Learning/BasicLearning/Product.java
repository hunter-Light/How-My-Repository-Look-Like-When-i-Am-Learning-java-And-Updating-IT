package BasicLearning;

import java.time.Duration;
 public class Product{



     public static void main(String[] args) {
         for (int i = 0; i <= 100; i++) {
             System.out.print("\rLoading: " + i + "%");
             System.out.flush(); // Force the console to update immediately

             try {
                 Thread.sleep(222); // 50ms delay
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
         System.out.println("\nDone!");
     }
 }