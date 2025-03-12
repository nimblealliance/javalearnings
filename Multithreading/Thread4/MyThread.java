package Thread4;

public class MyThread {

    public static void main(String[] args) {
        BackAccount backAccount = new BackAccount();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                backAccount.withdraw(20);
            }

        };

        Thread t1 = new Thread(task , "t1");
        Thread t2 = new Thread(task , "t2");
        t1.start();
        t2.start();

    }
}
