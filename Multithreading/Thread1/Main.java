package Thread1;

public class Main {

    public static void main(String[] args)  {

//        Thread1.World world = new Thread1.World();
//        world.start();

//        for (int i = 0; i < 1000000; i++) {
//            System.out.println(Thread.currentThread().getName());
//        }

//        Thread1.World2 world2 = new Thread1.World2();
//        Thread t2 = new Thread(world2);
//        t2.start();
//        t2.setName("Thread-69420");
//        System.out.println(t2.getState());

        World world3 = new World();
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getName());
        System.out.println(world3.getState());
        System.out.println(world3.isVirtual());


    }
}
