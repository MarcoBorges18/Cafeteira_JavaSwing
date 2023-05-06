import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.Scanner;

import cafeteira.Cafeteira;
import log.Log;


public class App {
    public static void main(String[] args) throws Exception {

        Cafeteira cafe = new Cafeteira();
        Log log = new Log(new ArrayList<String>());
        Scanner scan = new Scanner(System.in);
        
        JFrame frame = new JFrame("Teste");
        frame.setSize(600,400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        JButton ligar = new JButton("Ligar");
        ligar.setSize(100,50);
        ligar.setLocation(35,50);

        ligar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cafe.ligar();
                log.registro(cafe.toLog());
            }
        });
        
        JButton desligar = new JButton("Desligar");
        desligar.setSize(100,50);
        desligar.setLocation(140,50);

        desligar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cafe.desligar();
                log.registro(cafe.toLog());
            }
        });

        JButton encherCafe = new JButton("Encher Cafe");
        encherCafe.setSize(150,50);
        encherCafe.setLocation(245,50);

        encherCafe.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("Digite a quantidade de cafe de deseja colocar");
                cafe.encherCafe(scan.nextInt());
                log.registro(cafe.toLog());
            }
        });

        JButton encherAgua = new JButton("Encher Agua");
        encherAgua.setSize(150,50);
        encherAgua.setLocation(35,105);

        encherAgua.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("Digite a quantidade de agua de deseja colocar");
                cafe.encherAgua(scan.nextInt());
                log.registro(cafe.toLog());
            }
        });

        JButton status = new JButton("Status");
        status.setSize(100,50);
        status.setLocation(190,105);

        status.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cafe.status();
                log.registro(cafe.toLog());
            }
        });

        JButton fazerCafe = new JButton("Fazer Cafe");
        fazerCafe.setSize(150,50);
        fazerCafe.setLocation(35,160);

        fazerCafe.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("Digite a quantidade de xicaras que deseja fazer");
                cafe.fazerCafe(scan.nextInt());
                log.registro(cafe.toLog());
            }
        });

        JButton logStatus = new JButton("Log");
        logStatus.setSize(100,50);
        logStatus.setLocation(295,105);

        logStatus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println(log.toString());
            }
        });

        
        frame.add(ligar);
        frame.add(desligar);
        frame.add(encherCafe);
        frame.add(encherAgua);
        frame.add(status);
        frame.add(fazerCafe);
        frame.add(logStatus);
        frame.setVisible(true);
        
    }
}
