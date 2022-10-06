public class CarreraMain {
    static Tortuga tortu = new Tortuga(1);
    static Liebre lieb = new Liebre(1);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Inicio de la carrera");

        boolean fin = false;
        while(!fin){
            int turno1 = (int) Math.floor(Math.random()*(100)+1);
            int turno2 = (int) Math.floor(Math.random()*(100)+1);
            liebreTurno(turno1);
            tortugaTurno(turno2);
            int p1 = (int) lieb.get();
            int p2 = (int) tortu.get();

            for(int i = 0; i < p1; i++){
                System.out.print(" ");
            }
            System.out.println("L");
            for(int i = 0; i < p2; i++){
                System.out.print(" ");
            }
            System.out.println("T");

            boolean ganador1 = (boolean)lieb.getWinner();
            boolean ganador2 = (boolean)tortu.getWinner();
            if(ganador1 && ganador2){
                System.out.println("Empate");
                fin = true;
            }
            else if(ganador1){
                System.out.println("La Liebre Ha Ganado");
                fin = true;
            }
            else if(ganador2){
                System.out.println("La Tortuga Ha Ganado");
                fin = true;
            }
        }
    }

    public static void liebreTurno(int valor) throws InterruptedException {
        if(0 < valor && valor < 21){
            lieb.duerme();
        }
        else if(21 < valor && valor < 41){
            lieb.granSalto();
        }
        else if(41 < valor && valor < 51){
            lieb.resbalonGrande();
        }
        else if(51 < valor && valor < 81){
            lieb.saltoChico();
        }
        else{
            lieb.resbalonChico();
        }
    }
    public static void tortugaTurno(int valor) throws InterruptedException{
        if(0 < valor && valor < 51){
            tortu.avanceRapido();
        }
        else if(51 < valor && valor < 71) {
            tortu.resbalon();
        }
        else{
            tortu.avanceLento();
        }
    }
}
