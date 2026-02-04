
public class Main {
    public static void main(String[] args) {

        // Chạy WorkerThread
        WorkerThread thread = new WorkerThread();
        thread.start();

        // Chạy WorkerRunnable
        WorkerRunnable runnable = new WorkerRunnable();
        Thread t = new Thread(runnable);
        t.start();
    }
}
