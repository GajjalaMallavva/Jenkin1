class CommandLineDemo2 {
    public static void main(String args[]) {
        // Get the string arguments
        String s1 = args[0];
        String s2 = args[1];

        // Concatenate the strings (addition in terms of strings)
        String r1 = s1 + s2;

        // Since subtraction, multiplication, and division don't make sense with strings,
        // we will just print those as an error message or as a custom behavior.
        String r2 = "Subtraction not possible with strings";
        String r3 = "Multiplication not possible with strings";
        String r4 = "Division not possible with strings";

        // Output the results
        System.out.println("Concatenation: " + r1);
        System.out.println("Subtraction: " + r2);
        System.out.println("Multiplication: " + r3);
        System.out.println("Division: " + r4);
    }
}

