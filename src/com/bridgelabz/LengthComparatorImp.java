package com.bridgelabz;

public class LengthComparatorImp implements LengthComparator{

    LengthCalculator lengthCalculator=new LengthCalculatorImpl();

    @Override
    public void compareUsingEquals(Line firstLineComp, Line secondLineComp) {
                    Double firstLine=lengthCalculator.calLengthOfLine(firstLineComp);
                    Double secondLine=lengthCalculator.calLengthOfLine(secondLineComp);

                    if (firstLine.equals(secondLine))
                    {
                        System.out.println(" Line1 is Equal to Line2 ");
                    }else {
                        System.out.println(" Line1 is not Equal to Line2 ");
                    }

    }

    @Override
    public void compareUsingCompareTo(Line firstLineComp, Line secondLineComp) {
        Double firstLine=lengthCalculator.calLengthOfLine(firstLineComp);
        Double secondLine=lengthCalculator.calLengthOfLine(secondLineComp);
        int comparevalue = firstLine.compareTo(secondLine);
        if(comparevalue==0)
        {
            System.out.println(" Both Lines are Equals ");
        }else if(comparevalue < 0)
        {
            System.out.println(" Line1 is less than Line2 ");
        }else {
            System.out.println(" Line1 is greater than Line2 ");
        }
    }
}
