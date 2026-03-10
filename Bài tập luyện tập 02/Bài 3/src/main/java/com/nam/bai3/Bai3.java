 
package com.nam.bai3;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Bai3 {

    static CompletableFuture<String> validateCustomer(String customerName) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("[" + Thread.currentThread().getName() + "]"
                    + " Dang xac thuc khach hang: " + customerName + "...");
            try {
                TimeUnit.SECONDS.sleep(2); // Giả lập mất 2 giây
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            String result = "Khach hang [" + customerName + "] da duoc xac thuc thanh cong!";
            System.out.println("[" + Thread.currentThread().getName() + "] >> " + result);
            return result;
        });
    }

    static CompletableFuture<String> issueTicket(String movieName, String seat) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("[" + Thread.currentThread().getName() + "]"
                    + " Dang xuat ve phim: " + movieName + "...");
            try {
                TimeUnit.SECONDS.sleep(3); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            String result = "Ve phim [" + movieName + "] - Ghe: " + seat + " da duoc xuat!";
            System.out.println("[" + Thread.currentThread().getName() + "] >> " + result);
            return result;
        });
    }

    public static void main(String[] args) throws Exception {

        System.out.println("=== He thong dat ve xem phim ===\n");
        long startTime = System.currentTimeMillis();

        CompletableFuture<String> validateFuture = validateCustomer("Nguyen Van A");
        CompletableFuture<String> ticketFuture   = issueTicket("Avengers: Endgame", "A12");

        CompletableFuture<String> combinedFuture = validateFuture.thenCombine(
            ticketFuture,
            (validateResult, ticketResult) -> {
                return "\n=== TONG KET DAT VE ==="
                     + "\n  + " + validateResult
                     + "\n  + " + ticketResult
                     + "\n=> Dat ve hoan tat! Chuc ban xem phim vui ve!";
            }
        );

        String finalResult = combinedFuture.get();
        System.out.println(finalResult);

        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("\nTong thoi gian thuc hien: " + elapsed + " ms");
    }
}

