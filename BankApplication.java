class BankApplication {

    static void process() throws Exception {
        throw new Exception("Error in transaction");
    }

    public static void main(String[] args) {
        try {
            process();
            System.out.println("Transaction processed");
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}