3import java.util.Scanner;

public class GradeCalculator {
   public GradeCalculator() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the number of subjects: ");
      int var2 = var1.nextInt();
      int var3 = 0;

      for(int var4 = 1; var4 <= var2; ++var4) {
         System.out.print("Enter marks obtained in subject " + var4 + " (out of 100): ");
         int var5 = var1.nextInt();
         if (var5 < 0 || var5 > 100) {
            System.out.println("Invalid entered marks. Marks should be between 0 and 100.");
            return;
         }

         var3 += var5;
      }

      double var7 = (double)var3 / (double)var2;
      char var6;
      if (var7 >= 90.0) {
         var6 = 'A';
      } else if (var7 >= 80.0) {
         var6 = 'B';
      } else if (var7 >= 70.0) {
         var6 = 'C';
      } else if (var7 >= 60.0) {
         var6 = 'D';
      } else {
         var6 = 'E';
      }

      System.out.println("Total Marks: " + var3);
      System.out.println("Average Percentage: " + var7 + "%");
      System.out.println("Grade: " + var6);
   }
}

