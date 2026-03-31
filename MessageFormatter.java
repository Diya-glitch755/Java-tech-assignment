import java.util.Scanner;

class MessageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String last = sc.nextLine();

        String fullName = first + " " + last;
        System.out.println("Full Name: " + fullName);
    }
}