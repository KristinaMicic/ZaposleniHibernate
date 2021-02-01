package Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author Kristina
 */
@Entity
@Table (name = "zaposleni")
public class Zaposleni {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "ime")
    private String ime;
    
    @Column(name = "brGodina")
    private int brGodina;
    
    @Column(name = "adresa")
    private String adresa;
    
    @Column(name = "visinaDohotka")
    private int visinaDohotka;

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getIme() {return ime;}

    public int getBrGodina() {return brGodina;}

    public String getAdresa() {return adresa;}
    
    public int getVisinaDohotka() {return visinaDohotka;}

    public void setIme(String ime) {this.ime = ime;}

    public void setBrGodina(int brGodina) {this.brGodina = brGodina;}

    public void setAdresa(String adresa) {this.adresa = adresa;}
    
    public void setVisinaDohotka (int visinaDohotka) { this.visinaDohotka = visinaDohotka;}
    
    public Zaposleni(int id, String ime, int brGodina, String adresa, int visinaDohotka) {
        this.id = id;
        this.ime = ime;
        this.brGodina = brGodina;
        this.adresa = adresa;
        this.visinaDohotka = visinaDohotka;
    }
    public Zaposleni(){
        
    }
}
