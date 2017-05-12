/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalculator;

/**
 *
 * @author jkellaway
 */
public class Assessment {
    private Double weighting = 1.00;
    private Double grade = 0.00;
    private AssessmentType assessmentType = null;

    public Assessment(){
    }
    
    public Assessment(Double weighting, Double grade, AssessmentType assessmentType){
        this.weighting = weighting;
        this.grade = grade;
        this.assessmentType = assessmentType;
    }
    
    public Double getWeighting() {
        return weighting;
    }

    public void setWeighting(Double weighting) {
        this.weighting = weighting;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public AssessmentType getAssessmentType() {
        return assessmentType;
    }

    public void setAssessmentType(AssessmentType assessmentType) {
        this.assessmentType = assessmentType;
    }
}