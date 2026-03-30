class Employee {
    String name;
    int id;
    static int count = 0;

    Employee(String n, int i) {
        name = n;
        id = i;
        count++;
    }

    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }

    public static void main(String[] args) {
        new Employee("A", 1);
        new Employee("B", 2);

        Employee.displayCount();
    }
}