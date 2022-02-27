package com.bridgelabz;

public class LengthCalculatorImpl implements LengthCalculator {
    @Override
    public Double calLengthOfLine(Line firstLine) {
        return Math.sqrt((firstLine.getEndOfX() - firstLine.getStartOfX()) *
                         (firstLine.getEndOfX() - firstLine.getStartOfX()) +
                         (firstLine.getEndOfY() - firstLine.getStartOfX()) *
                         (firstLine.getEndOfY() - firstLine.getStartOfY())

        );
    }
}
