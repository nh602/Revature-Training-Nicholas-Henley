import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class BuilderVsBuffer {

    /** append "item" + i for i in 0..n-1 to a StringBuilder, return toString() */
    public static String buildWithBuilder(int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            sb.append("item%d".formatted(i));
        }

        return sb.toString();
    }

    /** same, with a StringBuffer */
    public static String buildWithBuffer(int n) {
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < n; i++) {
            sb.append("item%d".formatted(i));
        }

        return sb.toString();
    }

    public static int twoThreadsBuilder(int perThread) throws InterruptedException {
        StringBuilder sb = new StringBuilder();

        try (ExecutorService executor = Executors.newFixedThreadPool(2)) {
            executor.submit(() -> {
                for(int i = 0; i < perThread; i++) {
                    sb.append("x");
                }
            });
            executor.submit(() -> {
                for(int i = 0; i < perThread; i++) {
                    sb.append("x");
                }
            });
        }

        return sb.length();
    }

    public static int twoThreadsBuffer(int perThread) throws InterruptedException {
        StringBuffer sb = new StringBuffer();

        try (ExecutorService executor = Executors.newFixedThreadPool(2)) {
            executor.submit(() -> {
                for(int i = 0; i < perThread; i++) {
                    sb.append("x");
                }
            });
            executor.submit(() -> {
                for(int i = 0; i < perThread; i++) {
                    sb.append("x");
                }
            });
        }

        return sb.length();
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO
    }
}
