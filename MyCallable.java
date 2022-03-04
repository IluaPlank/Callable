import java.util.concurrent.Callable;

public class MyCallable implements Callable <Integer>  {
    @Override
    public Integer call() throws Exception{
        String nameThread = Thread.currentThread().getName();
        int count = 0;
        for (int i =0;i<(int) (5 + Math.random() * 10);i++,count++){
            System.out.println("Я " + nameThread + " говорю: 'Привет нарооод' ");
            Thread.sleep(300);
        }
        return count;
    }
}
