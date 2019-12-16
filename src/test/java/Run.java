import org.junit.Test;

import java.io.FileInputStream;
import java.util.Properties;

public class Run {
    @Test
    public static void main(String[] args) throws Exception {
        Properties property = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        property.load(fis);

        TestTaskOne run = new TestTaskOne();
        run.testSber();
        run.testInsurance();
    }
}
