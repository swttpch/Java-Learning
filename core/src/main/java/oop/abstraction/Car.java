package oop.abstraction;

class Car extends Vehicle implements Runnable{


    @Override
    void go() {
        System.out.println("The car is driving.");
        for (int i=0; i<10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    void stop(){
        System.out.println("The car stopped.");
    }

    @Override
    public void run() {

    }
}
