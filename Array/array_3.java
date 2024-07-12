package Array;

public class array_3 {

    public static void main(String[] args) {
        int array_1[] ={1,2,3,6};
        int array_2[]={6,3,4};
        System.out.println(array_1==array_2);

        int array_3[]=array_1;
        System.out.println(array_3 == array_1);

        array_3[0] =60;
        System.out.println(array_1[0]);


        }
    }

