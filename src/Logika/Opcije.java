package Logika;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;

/**
 *
 * @author Kristina
 */
public class Opcije {
    public static void launch(){
    
        System.out.println("Izaberi opciju:" );
        System.out.println("1.Prikaz svih zaposlenih iz baze");
        System.out.println("2.Prikaz samo određenih zaposlenih iz baze po nekom od kriterijuma koji nije ID (npr. po imenu, broju godina, adresi ili visini dohotka); ");
        System.out.println("3. Izmena podataka o zaposlenom na osnovu ID-a");
        System.out.println("4. Brisanje zaposlenog na osnovu  ID-a");
        System.out.println("5. Unos novog zaposlenog u bazu.");
        System.out.println("6. Zavrsetak programa.");
        
        Frame f = new Frame("Izaberite opciju");
        LayoutManager layOut = new GridLayout(2,1);
        f.setLayout(layOut);
        
        JButton opcija1 = new JButton("Opcija 1");
        opcija1.setSize(5, 20);
        opcija1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               opcija1.setText("Kliknuli ste na opciju 1");
               Aplikacija.PrikazZaposlenih();
        }  
    });  
        JButton opcija2 = new JButton("Opcija 2");
        opcija2.setSize(5, 20);
        opcija2.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                opcija2.setText("Kliknuli ste na opciju 2");
                Aplikacija.PrikazRadnika();
            }
        });
       
        JButton opcija3 = new JButton("Opcija 3");
        opcija3.setSize(5, 20);
        
        opcija3.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                opcija3.setText("Kliknuli ste na opciju 3");
                Aplikacija.IzmenaPodataka();
            }
        });
        
        JButton opcija4 = new JButton("Opcija 4");
        opcija4.setSize(5, 20);
        
        opcija4.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                opcija4.setText("Kliknuli ste na opciju 4");
                Aplikacija.BrisanjeZaposlenog();
            }
        });
        
        JButton opcija5 = new JButton("Opcija 5");
        opcija5.setSize(5, 20);
        
        opcija5.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                opcija5.setText("Kliknuli ste na opciju 5");
                Aplikacija.UnosZaposlenog();
            }
        });
        
        JButton opcija6 = new JButton("Opcija 6");
        opcija6.setSize(5, 20);
        
        opcija6.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                opcija6.setText("Kliknuli ste na opciju 6");
                Aplikacija.Zavrsetak();
            }
        });
        
        f.add(opcija1);       
        f.add(opcija2);     
        f.add(opcija3);
        f.add(opcija4);
        f.add(opcija5);       
        f.add(opcija6);
       
        f.setSize(100,300);
        f.setVisible(true);
        f.setLocation(250,200);  
        f.setSize(600,400); 
        
        f.addWindowListener(new WindowAdapter () {  
        public void windowClosing(WindowEvent e) {  
          System.exit(0);  
        } 
      }); 
    }
}    

