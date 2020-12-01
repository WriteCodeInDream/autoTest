package utils;

/**
 * 时间等待
 */
public class TimeWaitingMethod {
    private final  static long defaultWaitingTime = 5000;
    public static void TimeWaiting(){
        try {
            Thread.sleep(defaultWaitingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void TimeWaiting(long waitingTime){
        try {
            Thread.sleep(waitingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
