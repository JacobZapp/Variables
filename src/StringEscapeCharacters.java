public class StringEscapeCharacters {
    public static void main(String[] args) {
        // The backslash is how you put quotes into a string
        String message = "This class is \"Java Programming\"!";
        System.out.println(message);
        // This is breaking the line to another line below
        String anotherMesaage = "Welcome, everyone!\nI hope you enjoy the class!";
        System.out.println(anotherMesaage);
        // This is putting tabs into the string I need to
        String andAnotherMessage = "Videos\tLabs\tZoom";
        System.out.println(andAnotherMessage);
    }
}
