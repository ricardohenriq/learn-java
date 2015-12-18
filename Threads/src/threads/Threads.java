package threads;

public class Threads {

    public static void main(String[] args) {
        //iniciando a Thread
         Trabalhador severino = new Trabalhador("sapato",100);
         Trabalhador raimundo = new Trabalhador("bota",50);
         
         Thread joao = new Thread(new Operario("calca",75));
         Thread jose = new Thread(new Operario("camisa",45));
         
         severino.start();
         raimundo.start();
         joao.start();
         jose.start();
    }
    
}
