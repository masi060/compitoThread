public class autovettura extends Thread{
    private int id;
    private String scuderia;
    private String pilota;

    private semaforo s;


    public autovettura(int id, String scuderia,String pilota,semaforo s){
        this.id = id;
        this.scuderia = scuderia;
        this.pilota = pilota;
        super.setName(pilota);
        this.s = s;
    }

    @Override
    public void run(){
        for(int i = 1; i<11 ;i++){
            int giro = (int)(Math.random()*4000+1000);
            try{
                sleep(giro);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("Giro "+i+" completato "+pilota);

            if(i%3 == 0){
                s.P();
                System.out.println(Thread.currentThread().getName()+" sta entrando nel box ");
                int cambiogomme = (int)(Math.random()*5000+1000);
                try{
                    sleep(cambiogomme);
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
                System.out.println(Thread.currentThread().getName()+" esce dal box");
                s.V();
            }
        }
        
    }
}
