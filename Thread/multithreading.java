class multithreading extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args)
    {
        multithreading t1 =new multithreading();
        t1.start();
    }
}
