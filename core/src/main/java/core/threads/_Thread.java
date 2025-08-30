package core.threads;

public class _Thread {

    public void execute() throws InterruptedException {

        //             Ways to create a thread
        MyThread thread1 = new MyThread();

        // better in this way
        MyRunnable runnable1 = new MyRunnable();
        java.lang.Thread thread2 = new java.lang.Thread(runnable1);

        thread1.setDaemon(true);
        thread2.setDaemon(true);


        //thread1.join();


        do {
            thread1.run();
            thread2.run();
        }while ((thread1.isAlive()) & (thread2.isAlive()));





        //System.out.println(Thread.activeCount());

        //Thread.currentThread().setName("MaiN");
        //System.out.println(Thread.currentThread().getName());

        //Thread.currentThread().setPriority(1);
        //System.out.println(Thread.currentThread().getPriority());

        //System.out.println(Thread.currentThread().isAlive());

        /*for (int i = 3; i>0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Your are done");*/

        //MyThread threadtwo = new MyThread();

        //threadtwo.setDaemon(false);
        //System.out.println(threadtwo.isDaemon());

        //threadtwo.start();

        //System.out.println(threadtwo.isAlive());

        //threadtwo.setName("second thread");
        //System.out.println(threadtwo.getName());

        //threadtwo.setPriority(10);
        //System.out.println(threadtwo.getPriority());

        //System.out.println(Thread.activeCount());
    }
}
