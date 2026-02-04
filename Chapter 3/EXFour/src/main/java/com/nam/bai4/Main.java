package com.nam.bai4;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {

        CompletableFuture<Void> checkProduct = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("✔ Kiểm tra sản phẩm hoàn thành");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        CompletableFuture<Void> payment = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(3000);
                System.out.println("✔ Thanh toán hoàn thành");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        CompletableFuture<Void> shipping = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(2500);
                System.out.println("✔ Vận chuyển đơn hàng hoàn thành");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        CompletableFuture.allOf(checkProduct, payment, shipping)
                .thenRun(() -> System.out.println("🎉 Đơn hàng đã được xử lý hoàn tất!"))
                .join();
    }
}
