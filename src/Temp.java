public class Temp {
    public static void main(String[] args) {
        String currentMonth = "January";
        int dayOfMonth = 11;
        double forecastHigh = 19.4; // doubles have decimal places
        double forecastLow = -3.7;

        // basic math to find the difference
        double forecastDifference = forecastHigh - forecastLow;


        // printing without string formatting
        System.out.println("On " + currentMonth + " " + dayOfMonth
                + ", the difference between the high and low temps is " + forecastDifference);

        //printing with string formatting, do not forget f instead of ln, d is for integer, s is for string
        System.out.printf("On %s %d, the difference between high and low temps is %.2f",
                currentMonth, dayOfMonth, forecastDifference);

    }
}
