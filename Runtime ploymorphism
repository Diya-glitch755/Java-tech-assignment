abstract class Ride {
    double distance;

    Ride(double d) {
        distance = d;
    }

    abstract double calculateFare();
}

class BikeRide extends Ride {
    BikeRide(double d) { super(d); }
    double calculateFare() { return distance * 5; }
}

class AutoRide extends Ride {
    AutoRide(double d) { super(d); }
    double calculateFare() { return distance * 8; }
}

class CarRide extends Ride {
    CarRide(double d) { super(d); }
    double calculateFare() { return distance * 12; }

    public static void main(String[] args) {
        Ride[] rides = {
            new BikeRide(10),
            new AutoRide(10),
            new CarRide(10)
        };

        for (Ride r : rides) {
            System.out.println("Fare: " + r.calculateFare());
        }
    }
}
