import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Timer chrono = new Timer();
        chrono.schedule(new TimerTask() {
            int time =5;

            @Override
            public void run() {
                System.out.println("time: " + time + "s");
                if (time == 0) {
                    Random random = new Random();
                    int randomInt = random.nextInt(6 - 1) + 1;
                    System.out.println("value of dice: " + randomInt);
                    chrono.cancel();
                }
                time--;
            }},1000,1000);
        }
    }
