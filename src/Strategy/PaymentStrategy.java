package Strategy;

public interface PaymentStrategy {
    default boolean pay() {
        return false;
    }
}
