class DownloadManager implements Runnable {
    public void run() {
        System.out.println("Downloading: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new DownloadManager());
        Thread t2 = new Thread(new DownloadManager());

        t1.start();
        t2.start();
    }
}