class TestsleepMethod1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        TestsleepMethod1 t1 = new TestsleepMethod1();
        TestsleepMethod1 t2 = new TestsleepMethod1();
        t1.start();
        t2.start();
    }
}