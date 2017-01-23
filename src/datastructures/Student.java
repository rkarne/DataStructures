/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author rkarne
 */
public class Student {
    private String name;
    private String id;
    private String gender;
    private double grade;
    Student(){
        
    }
    Student(String name, String id, String gender, double grade){
        
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    public boolean equals(){
    
        return false;
    }
    public String toString(){
        return " ";
    }
}
