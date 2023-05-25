public class App {
    public static void main(String[] args) throws Exception {
        semaforo s = new semaforo();
        autovettura v1 = new autovettura(1, "ferrari", "Leclerc",s);
        autovettura v2 = new autovettura(2, "mercedes", "Hamilton",s);

        


        v1.start();v2.start();


        v1.join();v2.join();

        System.out.println("gara finita");


        
    }
}
