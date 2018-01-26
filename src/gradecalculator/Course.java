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
public class Course {
    private String name = "Unknown";
    private String code = "Unknown";
    private ArrayList<Year> arlYears = new ArrayList<>();
    
    public void createTestData(){
        this.name = "BSc (Hons) Computer Science";
        this.code = "G407";
        
        //Year 1
        Year year = new Year(0.10);
/*          Discard lowest 2 grades for first year
            Module module = new Module("ISAD151", "Databases: Analysis, Design & Development", 20);
            Assessment assessment = new Assessment(0.6, 89.00, AssessmentType.COURSEWORK);
            module.addAssessment(assessment);
            assessment = new Assessment(0.4, 50.00, AssessmentType.EXAM);
            module.addAssessment(assessment);
            year.addModule(module);

            module = new Module("SOFT152", "Software Engineering", 20);
            assessment = new Assessment(1.0, 71.89, AssessmentType.COURSEWORK);
            module.addAssessment(assessment);
            year.addModule(module);
*/            
        Module module = new Module("MATH1607PP", "The Quantum Universe", 20);
        Assessment assessment = new Assessment(1.0, 83.50, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        year.addModule(module);

        module = new Module("NET103", "Principles of Infrastructure", 20);
        assessment = new Assessment(0.5, 74.00, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        assessment = new Assessment(0.5, 82.00, AssessmentType.EXAM);
        module.addAssessment(assessment);
        year.addModule(module);

        module = new Module("SOFT153", "Algorithms, Data Structures & Mathematics", 20);
        assessment = new Assessment(0.5, 90.34 + .405, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        assessment = new Assessment(0.5, 86.25 + .405, AssessmentType.EXAM);
        module.addAssessment(assessment);
        year.addModule(module);

        module = new Module("SOFT155", "Computer Science Immersive Introduction", 20);
        assessment = new Assessment(1.0, 75.00, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        year.addModule(module);
        this.addYear(year);

        //Year 2
        year = new Year(0.30);
        module = new Module("ISAD251", "Database Applications Development", 20);
        assessment = new Assessment(0.5, 87.00, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        assessment = new Assessment(0.5, 86.00, AssessmentType.EXAM);
        module.addAssessment(assessment);
        year.addModule(module);
            
        module = new Module("ISAD260", "User-Centred Interface Design", 20);
        assessment = new Assessment(0.5, 80.00, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        assessment = new Assessment(0.5, 70.00, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        year.addModule(module);
            
        module = new Module("SOFT252", "Object-oriented Software Engineering with Design Patterns", 20);
        assessment = new Assessment(0.3, 79.41, AssessmentType.EXAM);
        module.addAssessment(assessment);
        assessment = new Assessment(0.7, 71.5, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        year.addModule(module);
                        
        module = new Module("PRCS251", "Computer Science Integrating Project", 20);
        assessment = new Assessment(1.0, 75.43, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        year.addModule(module);
            
        module = new Module("SOFT253", "Computer Science Immersive Introduction", 20);
        assessment = new Assessment(0.5, 64.00, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        assessment = new Assessment(0.5, 81.30, AssessmentType.EXAM);
        module.addAssessment(assessment);
        year.addModule(module);
            
        module = new Module("AINT252", "Computation Theory & Artificial Intelligence", 20);
        assessment = new Assessment(0.5, 81.67, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        assessment = new Assessment(0.5, 75.00, AssessmentType.EXAM);
        module.addAssessment(assessment);
        year.addModule(module);
        this.addYear(year);
        
        //Year 3
        year = new Year(0.60);
        
        module = new Module("SOFT351", "Programming for Entertainment Systems", 20);
        assessment = new Assessment(0.4, 72.00, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        assessment = new Assessment(0.6, 0.00, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        year.addModule(module);
        
        module = new Module("ISAD361", "Advanced Databases & Data Management", 20);
        assessment = new Assessment(0.65, 72.00, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        assessment = new Assessment(0.35, 72.00, AssessmentType.EXAM);
        module.addAssessment(assessment);
        year.addModule(module);
        
        module = new Module("AINT351", "Machine Learning", 20);
        assessment = new Assessment(0.35, 83.00, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        assessment = new Assessment(0.35, 81.00, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        assessment = new Assessment(0.30, 0.00, AssessmentType.EXAM);
        module.addAssessment(assessment);
        year.addModule(module);
        
        module = new Module("LAW3239", "Cybercrime: Issues & Regulation", 20);
        assessment = new Assessment(1.0, 0.00, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        year.addModule(module);
        
        module = new Module("PRCO304", "Computing Project", 40);
        assessment = new Assessment(1.0, 0.00, AssessmentType.COURSEWORK);
        module.addAssessment(assessment);
        year.addModule(module);
        
        this.addYear(year);
        
        System.out.println(this.calculateCourseGrade());
    }
    
    public Course(){
    }
    
    public Course(String name, String code){
        this.name = name;
        this.code = code;
        this.arlYears = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Year> getArlYears() {
        return arlYears;
    }

    public void addYear(Year year) {
        this.arlYears.add(year);
    }
    
    public Double calculateCourseGrade(){
        Double courseGrade = 0.00;
        
        for (Year thisYear : this.arlYears){
            courseGrade += (thisYear.calculateYearGrade() * thisYear.getWeighting());
        }
        
        return courseGrade;
    }
}