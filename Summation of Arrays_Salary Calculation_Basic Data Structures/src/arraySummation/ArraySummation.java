//summation of n number and salary calculation

package arraySummation;
import java.util.Scanner;

public class ArraySummation {
    public static void main(String[] args) {
        //variable initialization
                int i, n;
                double avg,sum=0.0;
                //taking input from user
                Scanner in = new Scanner(System.in);
                //taking input of n
                System.out.println("Inter the value of n: ");
                n = in.nextInt();
                //way of taking an array in java
                double[] x=new double[n];

                //store input from the user
                for(i=0; i<n; i++) {
                    System.out.println("Enter the salary: ");
                    x[i] = in.nextDouble();

                }
                //using for loop to storing 1 year salary in sum
                for(i=0; i<n; i++){
                    sum+=x[i];
                }

                //getting average
                avg=sum/12;

                System.out.printf("The average salary is:\n$%.2f", avg);

    }
}
