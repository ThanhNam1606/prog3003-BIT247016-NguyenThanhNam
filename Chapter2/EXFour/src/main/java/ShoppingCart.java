
import Implemen.PaymentStrategy;

 public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Chưa chọn phương thức thanh toán!");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
