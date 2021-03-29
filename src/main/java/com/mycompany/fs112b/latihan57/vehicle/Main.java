/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fs112b.latihan57.vehicle;

/**
 *
 * @author 
 * NAMA     : Muhamad Bagas Permana
 * KELAS    : FS112B-PBO
 * NIK      : 2022431570
 * Deskripsi Program	: Program ini berisi program untuk menampilkan
 * vehicle bicycle, skateboard, brand, model, jumlah gear dan panjang papan
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Skateboard skateboard = new Skateboard();
        
        System.out.println("Bicycle");
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println("Brand  : "+bicycle.getMyBrand());
        System.out.println("Model  : "+bicycle.getMyModel());
        System.out.println("Jumlah Gear : "+bicycle.getMyGearCount());
        
        skateboard.setMyBrand("Ally Skate");
        skateboard.setMyModel("Rocket");
        skateboard.setMyBoardLength(54.5);

        System.out.println("\nSkateboard");
        System.out.println("Brand  : "+skateboard.getMyBrand());
        System.out.println("Model  : "+skateboard.getMyModel());
        System.out.println("Panjangnya Board: "+skateboard.getMyBoardLength());

    }
}