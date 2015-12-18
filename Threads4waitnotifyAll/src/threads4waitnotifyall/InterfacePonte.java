package threads4waitnotifyall;

public interface InterfacePonte {
    
    public void set(int valor) throws InterruptedException;
    public int get() throws InterruptedException;
}
