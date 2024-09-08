public class PizzaRolls {
    public static void main(String[] args) {
        // Sharing pizza rolls between people
        double pizzaRolls = 16;
        int people = 3;

        // Math to figure out how many rolls each person gets
        double rollsPerPerson = pizzaRolls / people;
        // Printing out the value in a concatenated string
        // System.out.println("Each person gets " + rollsPerPerson + " pizza rolls");
        // f by print is different from println, short for print formatted
        System.out.printf("Each person gets %.1f pizza rolls", rollsPerPerson);

    }
}
