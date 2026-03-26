class Resort {
    int Rno, Days;
    String Name;
    float Charges;

    float compute() {
        float amount = Days * Charges;
        if (amount > 11000)
            amount = 1.02f * amount;
        return amount;
    }

    void getInfo(int r, String n, float c, int d) {
        Rno = r;
        Name = n;
        Charges = c;
        Days = d;
    }

    void dispInfo() {
        System.out.println(Rno + " " + Name + " " + Charges + " " + Days);
        System.out.println("Amount: " + compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.getInfo(101, "Diya", 2000, 6);
        r.dispInfo();
    }
}
