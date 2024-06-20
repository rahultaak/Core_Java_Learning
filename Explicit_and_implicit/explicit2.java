package Explicit_and_implicit;

import java.sql.SQLOutput;

public class explicit2 {
    public static void main(String[] args) {

        int COURSE=400;
        float GST = 0.1834f;
        double total = COURSE + GST*COURSE;
        System.out.println(total);

    }
}
