package Array;

public class Array_2d {

    public static void main(String[] args) {
        int array1[][] = new int[2][2];

        array1[0][0]=2;
        array1[0][1]=6;
        array1[1][0]=3;

        for(int i=0;i<array1.length;i++)
        {
            for (int j=0;j<array1[i].length;j++)
            {
                System.out.print(array1[i][j]+"\t");
            }

            System.out.println("");
            }


    }
}
