/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalculator;

import java.util.ArrayList;

/**
 *
 * @author jkellaway
 */
public class Year {
    private Double weighting = 0.00;
    private ArrayList<Module> arlModules = new ArrayList<>();

    public Year(){
    }
    
    public Year(Double weighting){
        this.weighting = weighting;
        this.arlModules = new ArrayList<>();
    }
    
    public Double getWeighting() {
        return weighting;
    }

    public void setWeighting(Double weighting) {
        this.weighting = weighting;
    }

    public ArrayList<Module> getArlModules() {
        return arlModules;
    }

    public void addModule(Module module) {
        this.arlModules.add(module);
    }
    
    public Double calculateYearGrade(){
        Double yearGrade = 0.00;
        boolean finalYear = false;
        
        for (Module thisModule : this.arlModules){
            yearGrade += thisModule.calculateModuleGrade();
            if (thisModule.getCredits() == 40){
                finalYear = true;
                yearGrade += thisModule.calculateModuleGrade();
            }
        }
        
        if (finalYear){
            return yearGrade / (arlModules.size() + 1);
        }
        return yearGrade / arlModules.size();
    }
}