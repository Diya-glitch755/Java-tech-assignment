public import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        // Case-sensitive
        if (name1.equals(name2))
            System.out.println("Names are same (case-sensitive)");
        else
            System.out.println("Names are different (case-sensitive)");

        // Case-insensitive
        if (name1.equalsIgnoreCase(name2))
            System.out.println("Names are same (case-insensitive)");
        else
            System.out.println("Names are different (case-insensitive)");
    }
}