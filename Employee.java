import java.util.Scanner;

class Employee {

    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        netpay = basic + hra + da;
        return netpay;
    }

    void havedata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter empno: ");
        empno = sc.nextInt();

        System.out.print("Enter name: ");
        ename = sc.next();

        System.out.print("Enter basic: ");
        basic = sc.nextFloat();

        System.out.print("Enter hra: ");
        hra = sc.nextFloat();

        System.out.print("Enter da: ");
        da = sc.nextFloat();

        Calculate();
    }

    void dispdata() {
        System.out.println("Empno: " + empno);
        System.out.println("Name: " + ename);
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.havedata();
        e.dispdata();
    }
}
