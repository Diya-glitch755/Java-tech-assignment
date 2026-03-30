public import java.util.Scanner;

class EmailChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        if (email.contains("@gmail.com"))
            System.out.println("Valid Gmail Address");
        else
            System.out.println("Invalid Email");
    }
} {
    
}
