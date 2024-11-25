import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskMaker implements Runnable {

    private final List<Integer> finished = new ArrayList<>();
    private boolean waitingForInput = false;

    public void run() {
        Scanner scan = new Scanner(System.in);
        int NUMBER_OF_LOOPS = 10;
        for (int i = 0; i < NUMBER_OF_LOOPS; i++) {
            synchronized (this) {
                waitingForInput = true;
            }

            System.out.print("Enter the duration (in ms) of task " + i + ": ");
            int duration = scan.nextInt();

            synchronized (this) {
                waitingForInput = false;
                printFinishedTasks();
            }

            int taskId = i;
            Thread taskThread = new Thread(() -> task(duration, taskId));
            taskThread.start();
        }
    }

    private void task(int time, int num) {
        try {
            Thread.sleep(time);
            taskFinished(num);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private void taskFinished(int num) {
        synchronized (this) {
            finished.add(num);
            if (!waitingForInput) {
                printFinishedTasks();
            }
        }
    }

    private synchronized void printFinishedTasks() {
        if (!finished.isEmpty()) {
            System.out.print("Finished tasks: ");
            for (int taskId : finished) {
                System.out.print(taskId + " ");
            }
            System.out.println();
            finished.clear();
        }
    }
}