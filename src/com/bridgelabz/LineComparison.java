package com.bridgelabz;
class Points {
        int x1;
        int y1;
        int x2;
        int y2;

        public Points(int x1, int y1, int x2, int y2) {
            super();
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

public class LineComparison {
        public static void main(String[] args) {
            System.out.println("Welcome to Line Comparison Computation Program");
            Points point1 = new Points(1, 1, 4, 4);
            Points point2 = new Points(1, 1, 2, 8);
            LineComparison line = new LineComparison();
            double length1 = line.lineLengthCalculate(point1.x1, point1.x2, point1.y1, point1.y2);
            double length2 = line.lineLengthCalculate(point2.x1, point2.x2, point2.y1, point2.y2);
            compareTwoLines(length1, length2);
            checkLineEquality(length1, length2);
        }

        public int lineLengthCalculate(int x1, int y1, int x2, int y2) {
            int lineLength = (int) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
            return lineLength;
        }

        private static void checkLineEquality(Double length, Double length2) {
            boolean x = (length.equals(length2));
            if (x)
            {
                System.out.println("Length of two lines are equal");
            }
            else
            {
                System.out.println("Length of two lines aren't equal");
            }
        }

        private static void compareTwoLines(Double length, Double length2) {
            int x = (length.compareTo(length2));
            if (x > 0)
            {
                System.out.println("length of Line 1 is greater than line2");
            }
            else if (x < 0)
            {
                System.out.println("length of line 2 is greater than line1");
            }
            else
            {
                System.out.println("length of two lines are equal");
            }
        }


}


