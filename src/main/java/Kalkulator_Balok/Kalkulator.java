
package Kalkulator_Balok;

import javax.swing.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Kalkulator extends JFrame{
    JLabel jdl = new JLabel("KALKULATOR BALOK"); 
    JLabel pjg = new JLabel("Panjang");
    JLabel lbr = new JLabel("Lebar");
    JLabel tg = new JLabel("Tinggi");
    JLabel hsl = new JLabel("Hasil : ");
    JLabel kll = new JLabel("");
    JLabel ls = new JLabel("");
    JLabel vlm = new JLabel("");
    JLabel lp = new JLabel("");
    
    JButton htg=  new JButton("Hitung");
    JButton rst=  new JButton("Reset"); 
    
    JTextField fpjg = new JTextField();
    JTextField flbr = new JTextField();
    JTextField ftg = new JTextField();


    public Kalkulator(){
        setSize(450,600);
        setLayout(null);

        add(jdl);add(pjg);add(lbr);add(tg);add(hsl);
        add(kll);add(ls);add(vlm);add(lp);
        add(htg);add(rst);
        add(fpjg);add(flbr);add(ftg);


        jdl.setBounds(160,20,200,25);
        lbr.setBounds(40,70,150,25);
        flbr.setBounds(180,70,200,25);
        pjg.setBounds(40,120,150,25);   
        fpjg.setBounds(180,120,200,25);
        tg.setBounds(40,170,150,25);
        ftg.setBounds(180,170,200,25);
        hsl.setBounds(40,220,200,25);

        ls.setBounds(60,260,300,25);
        kll.setBounds(60,300,300,25);
        vlm.setBounds(60,340,300,25);
        lp.setBounds(60,380,300,25);
        htg.setBounds(100,450,80,30);
        rst.setBounds(250,450,80,30);


        htg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double p = Double.parseDouble(fpjg.getText());
                double l = Double.parseDouble(flbr.getText());
                double t = Double.parseDouble(ftg.getText());

                double luas =  p*l;
                double keliling = 2*(p+l);
                double volume = p*l*t;
                double luasPermukaan = 2*(p*l + p*t + l*t);


                ls.setText(">  Luas Persegi Panjang     : " + luas);
                kll.setText(">  Keliling Persegi Panjang    : " + keliling);
                vlm.setText(">  Volume Balok    : " + volume);
                lp.setText(">  Luas Permukaan Balok     : " + luasPermukaan);
            }
        });

        rst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fpjg.setText("");flbr.setText("");
                ftg.setText("");ls.setText("");
                kll.setText("");vlm.setText("");
                lp.setText("");
            }
            
        });

        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
