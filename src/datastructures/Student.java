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
        this.name="";
        this.id="";
        this.gender="";
        this.grade=0.0;
    }
    Student(String name, String id, String gender, double grade){
        this.name=name;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
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
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Student){
            Student objS = (Student) obj;
                if(objS.getName().equals(name)){
                    if(objS.getId().equals(id)){
                        if(objS.getGender().equals(gender)){
                            if(objS.getGrade() == grade){
                                return true;
                            }
                        }
                    }
                }
        }
        return false;
    }
    @Override
    public String toString(){
        return "{ \"name\" : \""+name+"\", \"id\" : \""+id+"\" , \"gender\" : \""+gender+"\", \"grade\" : \""+grade+"\"}";
    }
}
