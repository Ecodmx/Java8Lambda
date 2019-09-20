/**
 * @author machangxu
 * @data 2019-09-20 下午7:58
 **/
public class ThreadLambda {
    public static void main(String[] args) {

        //before 1.8
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread run");
            }
        }).start();

        //1.8
        new Thread(() -> System.out.println("1.8 Thred run")).start();

    }
}
