/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import tugas3.ruang.Balok;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author IIN
 */
public class Tampilan extends JFrame implements ActionListener {
    
    JLabel lJudul = new JLabel(" == Kalkulator Balok == ");
    JLabel lPjg = new JLabel("Panjang  ");
    JTextField fPjg = new JTextField(8);
    JLabel lLbr = new JLabel("Lebar  ");
    JTextField fLbr = new JTextField(8);
    JLabel lTinggi = new JLabel("Tinggi  ");
    JTextField fTinggi = new JTextField(8);
    JLabel lHasil = new JLabel("Hasil :");
    JLabel lLuaspermukaan = new JLabel(); 
    JLabel lKelilingP = new JLabel();
    JLabel lVolumeBalok = new JLabel();
    JLabel lLuasPer = new JLabel();
    JButton Hitung = new JButton("Hitung");
    JButton Reset = new JButton("Reset");
    
    Tampilan(){
        setTitle("Tugas 3 Pratikum PBO");
        setSize(400,550);
        setLayout(null);

            add(lJudul);
            add(lPjg);
            add(fPjg);
            add(lLbr);
            add(fLbr);
            add(lTinggi);
            add(fTinggi);
            add(lHasil);
            add(Hitung);
            add(Reset);
        
            lJudul.setBounds(125,0,250,20);
            lPjg.setBounds(10,30,250,20);
            fPjg.setBounds(90, 30, 250, 20);
            lLbr.setBounds(10,70,150,20);
            fLbr.setBounds(90, 70, 250, 20);
            lTinggi.setBounds(10,110,150,20);
            fTinggi.setBounds(90, 110, 250, 20);
            lHasil.setBounds(50, 140, 150, 20);
            Hitung.setBounds(45, 400, 100, 30);
            Reset.setBounds(230, 400, 100, 30);
            Hitung.addActionListener(this);
            Reset.addActionListener(this);
            
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent cek) {
        if (cek.getSource() == Hitung) {
            try{
                double panjang = Double.parseDouble(fPjg.getText());
                double lebar = Double.parseDouble(fLbr.getText());
                double tinggi = Double.parseDouble(fTinggi.getText());

            Balok balok = new Balok(tinggi, panjang, lebar);
      
            lLuaspermukaan.setText ("Luas Persegi               : " + Double.toString(balok.luas())); add(lLuaspermukaan);
            lLuaspermukaan.setBounds(30, 170, 300, 30);
            lKelilingP.setText  ("Keliling Persegi              : " + Double.toString(balok.keliling())); add(lKelilingP);
            lKelilingP.setBounds(30, 210, 300, 30);
            lVolumeBalok.setText    ("Volume Balok              : " + Double.toString(balok.volume())); add(lVolumeBalok);
            lVolumeBalok.setBounds(30, 250, 300, 30);
            lLuasPer.setText    ("Luas Permukaan Balok     : " + Double.toString(balok.luasPermukaan())); add(lLuasPer);
            lLuasPer.setBounds(30, 290, 300, 30);   
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error !!!");
            }
        }
        if (cek.getSource() == Reset){
            fPjg.setText(null);
            fLbr.setText(null);
            fTinggi.setText(null);
            lLuaspermukaan.setText(null);
            lKelilingP.setText(null);
            lVolumeBalok.setText(null);
            lLuasPer.setText(null);
        }
    }
}