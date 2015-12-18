package threads4waitnotifyall;

import java.util.Random;

public class ClasseConsumidor implements Runnable{

    private InterfacePonte ponte;
    public ClasseConsumidor(InterfacePonte ponte){
        this.ponte = ponte;
    }

    private Random r = new Random();

    @Override
    public void run() {
        int total = 0;
        for(int i = 0;i < 5;i++){
            try{
                Thread.sleep(r.nextInt(3000));
                total += ponte.get();
                System.err.println("\t"+total);
            }catch(InterruptedException e){
                //VAZIO
            }
        }
    } 
}
