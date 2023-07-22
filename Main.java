import java.util.UUID;

public class Main {
    private static final String VERSION = "0.0.1";
    private static final long MAX_RUN_MILLIS = 3_600_000;
    private static final long SLEEP_TIME_MILLIS = 3_000;

    public static void main(String[] args) throws InterruptedException {
        final String uuid = UUID.randomUUID().toString();

        final long startTimeMillis = System.currentTimeMillis();

        while (startTimeMillis + MAX_RUN_MILLIS >= System.currentTimeMillis()) {
            System.out.println("Version: " + VERSION + ",  I'm: [" + uuid + "]");
            Thread.sleep(SLEEP_TIME_MILLIS);
        }
        System.out.println("Done from [" + uuid + "]");
    }
}
