package Implemen;
public class CreditCardPayment implements PaymentStrategy {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Thanh toán " + amount + " VNĐ bằng thẻ Credit Card: " + cardNumber);
    }
}
