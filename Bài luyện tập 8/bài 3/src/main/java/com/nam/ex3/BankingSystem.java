package com.nam.ex3;
import java.util.concurrent.*;

public class BankingSystem {

    static CompletableFuture<Boolean> authenticate() {
        return CompletableFuture.supplyAsync(() -> {
            sleep(2);
            System.out.println("Xác thực...");
            return true; // đổi false để test lỗi
        });
    }

    static CompletableFuture<Boolean> checkBalance() {
        return CompletableFuture.supplyAsync(() -> {
            sleep(3);
            System.out.println("Kiểm tra số dư...");
            return true; // đổi false để test lỗi
        });
    }

    static CompletableFuture<Void> transfer() {
        return CompletableFuture.runAsync(() -> {
            sleep(2);
            System.out.println("Chuyển tiền thành công!");
        });
    }

    public static void main(String[] args) {
        authenticate()
            .thenCompose(auth -> {
                if (!auth) throw new RuntimeException("Xác thực thất bại!");
                return checkBalance();
            })
            .thenCompose(balance -> {
                if (!balance) throw new RuntimeException("Không đủ tiền!");
                return transfer();
            })
            .thenRun(() -> System.out.println("Giao dịch hoàn tất!"))
            .exceptionally(ex -> {
                System.out.println("Lỗi: " + ex.getMessage());
                return null;
            });

        sleep(10); // giữ main thread
    }

    static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}