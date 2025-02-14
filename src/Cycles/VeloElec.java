package Cycles;
import java.util.Random;

public class VeloElec extends Velo {
    
    private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0; //
    private double facteurPuissanceMoteur; //

    public static double getDEFAUT_COUPLE_MOTEUR() { //
        return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
    }

    public static void setDEFAUT_COUPLE_MOTEUR(double DEFAUT_COUPLE_MOTEUR) { //
        DEFAUT_FACTEUR_PUISSANCE_MOTEUR = DEFAUT_COUPLE_MOTEUR; //
    }
    
    public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
        super(braquet, diamRoue);
        this.facteurPuissanceMoteur = coupleMoteur;
    }
    
   
    public VeloElec(double diamRoue, double coupleMoteur) {
        super(diamRoue);
        this.facteurPuissanceMoteur = coupleMoteur;
    }
    
    public VeloElec() {
        super(); 
        this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
    }
    

    public double getFacteurPuissanceMoteur() {
        return facteurPuissanceMoteur;
    }
    
    public void setFacteurPuissanceMoteur(double coupleMoteur) {
        this.facteurPuissanceMoteur = coupleMoteur;
    }
    
    @Override
    public double getPuissance(double frequenceCoupsDePedale) {
        return super.getPuissance(frequenceCoupsDePedale)* facteurPuissanceMoteur;
    }
    
    @Override
    public String toString() {
        return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur
                + ", braquet=" + getBraquet() 
                + ", diamRoue=" + getDiamRoue() + "]";
    }
    
    public static void main(String[] args) {
        VeloElec ve1 = new VeloElec(14.0, 28.0, 20.0);
        double p1 = ve1.getPuissance(60.0);
        System.out.println("Puissance vélo électrique = " + p1);
        System.out.println(ve1);
        
    }
}
