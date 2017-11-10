package Infrastructure.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StdTestLogger implements TestLogger {
    private int counter = 1;

    @Override
    public void log(String str) {
        SimpleDateFormat sim = new SimpleDateFormat("HH:mm:ss.SSS");
        String currentTime = sim.format(new Date());
        String methodName = Thread.currentThread().getName();

        String result = counter + ") " + currentTime + " [" + methodName + "] : " + str;
        counter++;
        System.out.println(result);
    }
}
