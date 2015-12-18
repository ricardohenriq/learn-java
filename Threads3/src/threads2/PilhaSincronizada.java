package threads2;

public class PilhaSincronizada {
    private int index = 0;
    private int[] buffer = new int[10];
    
    public synchronized int pop(){
        while(index == 0){
            try{
                this.wait();
            }catch(Exception e){}
        }
        this.notify();
        index--;
        return buffer[index];
    }
    
    public synchronized void push(int i){
        while(index == buffer.length){
            try{
                this.wait();
            }catch(Exception e){}
        }
        buffer[index] = i;
        index++;
    }
}
