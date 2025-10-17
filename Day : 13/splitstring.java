// Program to split a String into multiple parts
public class StringExample5 {
    public static void main(String[] args) {
        // Input string
        String data = "Apple,Banana,Mango,Orange";

        // Split the string by comma
        String[] fruits = data.split(",");

        // Print each fruit
        System.out.println("List of fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}