package Array;

import java.util.Scanner;

public class array_marks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Float marks[] = new Float[4];

        System.out.println("Enter the first number");
            marks[0]=sc.nextFloat();
        System.out.println("Enter the second number");
        marks[1]=sc.nextFloat();
        System.out.println("Enter the third number");
        marks[2]=sc.nextFloat();
        System.out.println("Enter the fourth number");
        marks[3]=sc.nextFloat();
//        System.out.println("Enter the fifth number");
//        marks[4]=sc.nextFloat();

        for (int i=0;i<marks.length;i++)
        {

            if  (marks[i]<30){
                System.out.println("your are fail in this");
            }
            System.out.println(marks[i]);
        }

    }
}
