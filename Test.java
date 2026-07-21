import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;

public class Test {


    public static void main(String[] args) {
        System.out.println("Hello, world! This is a test file.");
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        new ThreadPoolExecutor(0, 0, 0, null, null)
    }

}
