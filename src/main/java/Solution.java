public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        double average_score = (t1 + t2 + t3 + t4)/4;
        return average_score;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        if (average < 0) {
            return (int) (average - 0.5); 
        } 
        else {
            return (int) (average + 0.5); 
        }
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        boolean passing;
        if (roundedAverage >= 65) {
            passing = true;
        }
        else {
            passing = false;
        }
        return passing;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        double total = (shares * price);
        return total;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        if (totalStock < 0) {
            return (int) (totalStock - 0.5); 
        } 
        else {
            return (int) (totalStock + 0.5); 
        }
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        String original = String.format("%.2f", userDouble); 
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);

            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                int newDigit = (digit + 1) % 10; // Wraps 9 around to 0
                result.append(newDigit);
            } 
            else {
                result.append(ch);
            }
        }
        return Double.parseDouble(result.toString());
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(12.90));
        //23.01
    }

}
