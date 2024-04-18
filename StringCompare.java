public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";

        // Using equals() method for case-sensitive comparison
        System.out.println("Using equals() method:");
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals str3: " + str1.equals(str3));

        // Using equalsIgnoreCase() method for case-insensitive comparison
        System.out.println("\nUsing equalsIgnoreCase() method:");
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        // Using compareTo() method for lexicographical comparison
        System.out.println("\nUsing compareTo() method:");
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));

        // Using compareToIgnoreCase() method for case-insensitive lexicographical
        // comparison
        System.out.println("\nUsing compareToIgnoreCase() method:");
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2));
        System.out.println("str1 compareToIgnoreCase str3: " + str1.compareToIgnoreCase(str3));
    }
}
