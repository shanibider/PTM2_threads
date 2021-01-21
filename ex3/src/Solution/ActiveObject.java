package Solution;

public interface ActiveObject {

    public void execute(Runnable r);
    public void start();
    public void stop();

}