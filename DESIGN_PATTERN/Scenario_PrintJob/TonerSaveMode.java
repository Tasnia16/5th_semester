package Scenario;
import java.util.*;

public class TonerSaveMode  extends PrintMode{

    // private String tonerSavingLevel;

    List<String>str=new ArrayList<>();
    str.add("HIGH") ;
    str.add("MEDIUM") ;
    str.add("LOW") ;
    
   private double colorIntensity;
    private double costPerPage;

    public TonerSaveMode(String tonerSavingLevel, double colorIntensity,double costPerPage) {
        this.tonerSavingLevel = tonerSavingLevel;
        this.colorIntensity = colorIntensity;
        this.costPerPage = costPerPage;
    }
     
    @Override
    void saveToner(){

      
         Hashmap<String,ColorIntensity_algo> set_pair=new Hashmap<>();
         int t=0;
         for(String s: str ){
            set_pair.put(s,ColorIntensity_algo[t++]);
         }


    }

    
    @Override
    public double getCostPerPage() {
        return this.costPerPage;
    }

    enum ColorIntensity_algo{
        HIGH, MEDIUM,LOW
    }

}


