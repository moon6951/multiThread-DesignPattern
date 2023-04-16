package init;

public class Init {
    public static void main(String[] args) {
        for (int i =0;i<=10;i++){
            System.out.println("Good!");
            try {
                Thread.sleep(1000);
                Thread.interrupted();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
