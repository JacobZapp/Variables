public class Prices {
    public static void main(String[] args) {
        String productName = "Broccoli";
        double price = .99;
        int quantity = 10;

        double totalPrice = price * quantity;

        // without formatting that we want
        System.out.println(quantity + " of " + productName
                + " at $ " + price + " each costs a total of $" + totalPrice);

        // formatted to make sense in terms of currency
        System.out.printf("%d of %s at $%.2f each costs a total of $%.2f", quantity,
                productName, price, totalPrice);
    }
}
