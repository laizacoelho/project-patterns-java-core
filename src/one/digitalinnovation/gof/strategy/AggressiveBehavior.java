package one.digitalinnovation.gof.strategy;

public class AggressiveBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("Robot is moving aggressively...");
    }
}
