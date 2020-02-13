/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.io.Serializable;

/**
 *
 * @author Frank.Tilugulilwa
 * @author Edward Mwangile
 * @author Daniel Mushi
 */
//Class students a blueprint for objects which are going to be transported over network to remote clients.The class must be serializable.
public class StudentView implements Serializable {
    
    private String registrationNumber ; 
    private String names;
    private String courseCode;
    private int test1Score;
    private int test2Score;
    private int assignment1Score;                        
    private int assignment2score ;
    private int presentationScore;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getTest1Score() {
        return test1Score;
    }

    public void setTest1Score(int test1Score) {
        this.test1Score = test1Score;
    }

    public int getTest2Score() {
        return test2Score;
    }

    public void setTest2Score(int test2Score) {
        this.test2Score = test2Score;
    }

    public int getAssignment1Score() {
        return assignment1Score;
    }

    public void setAssignment1Score(int assignment1Score) {
        this.assignment1Score = assignment1Score;
    }

    public int getAssignment2score() {
        return assignment2score;
    }

    public void setAssignment2score(int assignment2score) {
        this.assignment2score = assignment2score;
    }

    public int getPresentationScore() {
        return presentationScore;
    }

    public void setPresentationScore(int presentationScore) {
        this.presentationScore = presentationScore;
    }
     

}
