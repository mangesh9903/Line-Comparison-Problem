package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonMain {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LengthCalculator lengthCalculator=new LengthCalculatorImpl();

        System.out.println(" Enter the value of First Line X1 , X2 , Y1 , Y2");
        Line firstLine=new Line(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        Double firstLinecal=lengthCalculator.calLengthOfLine(firstLine);
        System.out.println("Length Of Line  : "+firstLinecal);

        System.out.println(" Enter the value of Second Line X1 , X2 , Y1 ,Y2");
        Line secondLine=new Line(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        Double secondLineCal=lengthCalculator.calLengthOfLine(secondLine);
        System.out.println("Length Of Line  : "+secondLineCal);

        LengthComparator lengthComparator=new LengthComparatorImp();
        lengthComparator.compareUsingEquals(firstLine,secondLine);
        lengthComparator.compareUsingCompareTo(firstLine,secondLine);

    }
}
