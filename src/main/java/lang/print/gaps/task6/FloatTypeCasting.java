package lang.print.gaps.task6;

import java.util.Scanner;

public class FloatTypeCasting {
    int number;
    public void roundNumber(float numberToBeRounded) {
        number=(int)numberToBeRounded;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter float number ");
        float floatNumber=input.nextFloat();

        FloatTypeCasting floatTypeCasting=new FloatTypeCasting();
        floatTypeCasting.roundNumber(floatNumber);
        System.out.println("Rounded number is "+floatTypeCasting.number);
    }
}
