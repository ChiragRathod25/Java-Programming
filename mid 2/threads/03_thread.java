class myThread extends Thread{
    @Override
    public void run() {
        // while(true)
        System.out.println("Ha ha i'm running " + this.threadId()) ;
        System.out.println("Heee !! Now go to sleep");
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("I waked up again !!" + this.threadId());
    }
}
class myThreadMain {
    public static void main(String[] args) {
        myThread th1=new myThread();
        myThread th2=new myThread();
       th1.start();
       th2.start();

    }
}