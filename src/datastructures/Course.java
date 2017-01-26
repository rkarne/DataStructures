/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author INDIA
 */
public class Course {
    
    private List<Student> students = new ArrayList<>(); 
    Student student = new Student();
    
    Course(){
      this.students = null;
    }
    
    Course(List<Student> students){
        this.students = students;
    }
    
    public void add(Object student){
        students.add((Student) student);
    }
    
        public void remove(Object student){
        students.remove((Student) student);
    }
        
   public void remove(String id){
        students.remove(id);
   } 
   
     public void remove( int position){
          students.remove(position);
   } 
     
     public List<Student> getAll(){
         return students;
     }
   
        @Override
    public boolean equals(Object obj){
        if (obj instanceof Course){
            Course objC = (Course) obj;
                if(objC.getAll().equals(students)){
                                return true;
                            }
                }
        return false;
    }
    @Override
    public String toString(){
      
        return students.toString();
         }
    
 
    
    public Map<String,Set<String>> getGradeMap(){
        
        Map<String,Set<String>> s = new HashMap<>();
        
        Set<String> studentA = new HashSet<>();
        Set<String> studentB = new HashSet<>();
        Set<String> studentC = new HashSet<>();
        Set<String> studentD = new HashSet<>();
        
        for(int i =0; i< students.size(); i++){
            if(students.get(i).getGrade()> 94.0 && students.get(i).getGrade()<100.0 ){
                studentA.add(student.getName());
            }
            else if(students.get(i).getGrade()> 85.0 && students.get(i).getGrade()<94.0 ){
                studentB.add(student.getName());
            }
            else if(students.get(i).getGrade()> 75 && students.get(i).getGrade()<85 ){
                studentC.add(student.getName());
            }
            else if(students.get(i).getGrade()> 60.0 && students.get(i).getGrade()<75.0 ){
                studentD.add(student.getName());
            }
        }
        s.put("A", studentA);
        s.put("B", studentB);
        s.put("C", studentC);
        s.put("D", studentD);
        
        return s;
    }
    
    public void insert(Student s, int position){
        Set<String> str = new HashSet<>();
        for(int i=0; i< str.size();i++){
            str.add(s.getName());
        }
    }
    
    public Student get(String id){
        Student s = new Student();
        Set<String> str = new HashSet<>();
        for(int i=0; i<str.size(); i++){
            str.add(s.getId());
        }
        return s;
    }
    
    public Student get(int position){
        
        if(student.getId().equals(students.get(position))){
            return student;
        }
        else{
            return student;
        }
        
    }
    
       public Set<String> getAllByGender(String gender){
        
        Set<String> studentF = new HashSet<>();
        Set<String> studentM = new HashSet<>();
        if(gender == "female" || gender == "Female" || gender == "FEMALE"){
            studentF.add(student.getGender());
            return studentF;
        }
        else{
            studentM.add(student.getGender());
            return studentM;
        }
      
        
    }
    
}
