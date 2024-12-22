import java.util.Scanner;
import java.text.DecimalFormat;

public class MaleFemalePercentage {
 public static void main(String args[]) {
   
Scanner in = new Scanner(System.in);
Scanner input = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("#.##");
   
   double Male;
   double Female;
   double total;
   double MP, FP;
   
   System.out.print("Enter the number of males: ");
   Male = input.nextInt();
   
   System.out.print("Enter the number of females: ");
   Female = input.nextInt();
   
   total = Male + Female;
   MP = ((Male / total) * 100);
   FP = ((Female / total) * 100);
   
   System.out.println("Number of students = " + df.format(total));
   System.out.println("Male = " + df.format(MP) + "%");
   System.out.println("Female = " + df.format(FP) + "%");
 }
}
