package Infrastructure.logger;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTestLogger implements TestLogger {
    private int counter = 1;


    @Override
    public void log(String str) {
        SimpleDateFormat sim = new SimpleDateFormat("HH:mm:ss.SSS");
        String currentTime = sim.format(new Date());
        String methodName = Thread.currentThread().getName();

        String result = counter + ") " + currentTime + " [" + methodName + "] : " + str + " \n";
        counter++;
        try {
            FileWriter fw = new FileWriter("log.txt", true);
            fw.write(result);
            fw.close();
        }
        catch (Exception ex) {
        }
    }
}
