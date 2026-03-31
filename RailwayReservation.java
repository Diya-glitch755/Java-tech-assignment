class RailwayReservation {
    int seats = 1;

    synchronized void bookTicket() {
        if (seats > 0) {
            System.out.println("Ticket booked successfully");
            seats--;
        } else {
            System.out.println("No tickets available");
        }
    }

    public static void main(String[] args) {
        RailwayReservation r = new RailwayReservation();

        new Thread(() -> r.bookTicket()).start();
        new Thread(() -> r.bookTicket()).start();
    }
}