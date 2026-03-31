class MusicPlayer extends Thread {
    public void run() {
        System.out.println("Playing song...");
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Progress " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        new MusicPlayer().start();
    }
}