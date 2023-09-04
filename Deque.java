import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DegreeVerificationSystem {
    public static void main(String[] args) {
        Queue<Application> queue = new LinkedList<>();
        Deque<Application> deque = new ArrayDeque<>();
        Queue<Application> recordQueue = new LinkedList<>();

        // Simulate adding degree verification applications to the Queue
        for (int i = 1; i <= 10; i++) {
            Application application = new Application("App" + i);
            application.addDocument("Document1");
            application.addDocument("Document2");
            queue.offer(application);
        }

        // Step 3: Process applications in Queue
        while (!queue.isEmpty()) {
            Application currentApplication = queue.poll();
            deque.offerLast(currentApplication);

            if (!verifyDocuments(deque.getLast(), currentApplication)) {
                deque.pollLast();
            }
        }

        // Step 4: Verify degree in Deque and record verified applications
        while (!deque.isEmpty()) {
            Application currentApplication = deque.pollFirst();

            if (verifyDegree(currentApplication)) {
                recordQueue.offer(currentApplication);
            }
        }

        // Now, RecordQueue contains all the verified degree applications with certificates
    }

    private static boolean verifyDocuments(Application inDeque, Application currentApplication) {
        return inDeque != null && inDeque.getRequiredDocuments().containsAll(currentApplication.getRequiredDocuments());
    }

    private static boolean verifyDegree(Application application) {
        return true; // Example: Always returning true for demonstration
    }
}

class Application {
    private String name;
    private LinkedList<String> requiredDocuments;

    public Application(String name) {
        this.name = name;
        this.requiredDocuments = new LinkedList<>();
    }

    public void addDocument(String document) {
        requiredDocuments.add(document);
    }

    public LinkedList<String> getRequiredDocuments() {
        return requiredDocuments;
    }
}
