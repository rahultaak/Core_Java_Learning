package Loops;

public class odd_even_number_loop {
    public static void main(String[] args) {
        for (int i=0;i<=50;i++)
        {
            if (i%2==1)
            {
                System.out.println("The odd number --" + i);
            }
            else {
                System.out.println("The even numbers--" + i);
            }
        }
    }
}
