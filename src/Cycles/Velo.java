package Cycles;
import java.util.Random;

public class Velo {

    private static double DEFAUT_BRAQUET = 13.0; 
    private double braquet; 
    private double diamRoue; 
    private Random genAlea = new Random(); 
    

    public static double getDEFAUT_BRAQUET() { 
        return DEFAUT_BRAQUET;
    }
    
    public static void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) { 
        DEFAUT_BRAQUET = dEFAUT_BRAQUET;
    }
  
    public Velo(double braquet, double diamRoue) { 
        this.braquet = braquet;
        this.diamRoue = diamRoue;
    }
    
    public Velo(double braquet) { 
        this(braquet, 28.0);  
    }
    
    public Velo() { 
        this(DEFAUT_BRAQUET, 28.0);
    }
    
    public Random getGenAlea() { 
        return genAlea;
    }
    
    public void setGenAlea(Random genAlea) {
        this.genAlea = genAlea;
    }
    public double getBraquet() { 
        return braquet;
    }
    
    public void setBraquet(double braquet) { 
        this.braquet = braquet;
    }
    
    public double getDiamRoue() { 
        return diamRoue;
    }
    
    public void setDiamRoue(double diamRoue) { 
        this.diamRoue = diamRoue;
    }
    
    
    public double getPuissance(double FrequenceCoupsDePedale) {
        return FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
    }
    
    @Override
    public String toString() { 
        return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
    }
    
    public static void main(String[] args) {
        Velo monVelo = new Velo();
        monVelo.setGenAlea(new Random());
        double puissance = monVelo.getPuissance(60.0);
        
        System.out.println("Puissance calculée = " + puissance);
        System.out.println(monVelo.toString());
    }
}
