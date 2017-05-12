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
public class Module {
    private String code = "Unknown";
    private String description = "Unknown";
    private Integer credits = 20;
    private ArrayList<Assessment> arlAssessments = new ArrayList<>();

    public Module(){
    }
    
    public Module(String code, String description, Integer credits){
        this.code = code;
        this.description = description;
        this.credits = credits;
        this.arlAssessments = new ArrayList<>();
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public ArrayList<Assessment> getArlAssessments() {
        return arlAssessments;
    }

    public void addAssessment(Assessment assessment) {
        this.arlAssessments.add(assessment);
    }
    
    public Double calculateModuleGrade(){
        Double moduleGrade = 0.00;
        
        for (Assessment thisAssessment : this.arlAssessments){
            moduleGrade += (thisAssessment.getGrade() * thisAssessment.getWeighting());
        }
        
        return moduleGrade;
    }
}