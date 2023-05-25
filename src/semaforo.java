public class semaforo {
    private int valore;

    public semaforo(){
        valore = 1;
    }

    public synchronized void P(){
        
        while(valore == 0){
            try{
                System.out.println(Thread.currentThread().getName()+" e' in attesa");
                wait();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        valore--;
    }

    public synchronized void V(){
        valore++;
        notify();
    }
}
