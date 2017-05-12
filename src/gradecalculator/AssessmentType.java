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
public enum AssessmentType {
    EXAM,
    COURSEWORK;
    
    @Override
    public String toString()
    {
        String strResult = "";
        switch (this)
        {
            case EXAM:
                strResult = "Exam";
                break;
            case COURSEWORK:
                strResult = "Coursework";
                break;
        }
        return strResult;
    }
}
