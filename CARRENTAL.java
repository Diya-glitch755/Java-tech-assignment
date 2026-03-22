int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    void GetRent() {
        if (CarType.equals("Small"))
            Rent = 1000;
        else if (CarType.equals("Van"))
            Rent = 800;
        else if (CarType.equals("SUV"))
            Rent = 2500;
    }

    void ShowCar() {
        System.out.println("Car Id: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }

    public static void main(String[] args) {
        CARRENTAL c = new CARRENTAL();

        c.GetCar(1, "SUV");
        c.GetRent();
        c.ShowCar();
    }
}
