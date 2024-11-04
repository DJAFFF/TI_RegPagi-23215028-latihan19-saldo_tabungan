/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg5;

/**
 *
 * @author USER
 */
public class Latihan_19 {
 
    public static void main(String[] args) {
        double saldoAwal = 2500000;
        double bungaPerBulan = 0.15;
        int lamaBulan = 6;

        System.out.println("Input:");
        System.out.println("Saldo Awal: Rp. " + saldoAwal);
        System.out.println("Bunga/Bulan(%): " + (bungaPerBulan * 100));
        System.out.println("Lama (bulan): " + lamaBulan);

        System.out.println("\nOutput:");
        System.out.println("Saldo di bulan ke-1 Rp." + hitungSaldoBulan(saldoAwal, bungaPerBulan, 1));
        System.out.println("Saldo di bulan ke-2 Rp." + hitungSaldoBulan(saldoAwal, bungaPerBulan, 2));
        System.out.println("Saldo di bulan ke-3 Rp." + hitungSaldoBulan(saldoAwal, bungaPerBulan, 3));
        System.out.println("Saldo di bulan ke-4 Rp." + hitungSaldoBulan(saldoAwal, bungaPerBulan, 4));
        System.out.println("Saldo di bulan ke-5 Rp." + hitungSaldoBulan(saldoAwal, bungaPerBulan, 5));
        System.out.println("Saldo di bulan ke-6 Rp." + hitungSaldoBulan(saldoAwal, bungaPerBulan, 6));
        System.out.println("BUILD SUCCESSFUL (total time: 0 seconds)");
    }

    public static double hitungSaldoBulan(double saldoAwal, double bungaPerBulan, int bulan) {
        double saldoAkhir = saldoAwal * Math.pow(1 + bungaPerBulan, bulan);
        return saldoAkhir;
    }
}

