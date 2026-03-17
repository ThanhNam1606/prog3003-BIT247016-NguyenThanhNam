
package com.nam.mavenproject2;
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Thanh toán bằng Credit Card: $" + amount);
    }
}

class PayPalPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Thanh toán bằng PayPal: $" + amount);
    }
}

class CashPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Thanh toán bằng Tiền mặt: $" + amount);
    }
}

class PaymentFactory {
    public static Payment createPayment(String type) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalPayment();
            case "cash":
                return new CashPayment();
            default:
                throw new IllegalArgumentException("Phương thức không hợp lệ");
        }
    }
}

public class MainPayment {
    public static void main(String[] args) {
        Payment p1 = PaymentFactory.createPayment("creditcard");
        p1.pay(100);

        Payment p2 = PaymentFactory.createPayment("paypal");
        p2.pay(200);

        Payment p3 = PaymentFactory.createPayment("cash");
        p3.pay(50);
    }
}