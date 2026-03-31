import java.util.Scanner;

class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();

        int index = file.lastIndexOf(".");
        String ext = file.substring(index + 1);

        System.out.println("Extension: " + ext);
    }
}