class Restaurant {
    boolean foodReady = false;

    synchronized void prepare() throws Exception {
        while (foodReady) wait();
        System.out.println("Chef prepared food");
        foodReady = true;
        notify();
    }

    synchronized void serve() throws Exception {
        while (!foodReady) wait();
        System.out.println("Waiter served food");
        foodReady = false;
        notify();
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        new Thread(() -> {
            try { r.prepare(); } catch (Exception e) {}
        }).start();

        new Thread(() -> {
            try { r.serve(); } catch (Exception e) {}
        }).start();
    }
}