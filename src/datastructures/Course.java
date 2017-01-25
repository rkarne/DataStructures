/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author INDIA
 */
public class Course {
    
    private List<Student> students = new ArrayList<>(); 
    
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
        return "";
         }
    
    public Set<Student> getAllByGender(){
        
        return null;
    }
    
    public Map<Student,Set<String>> getGradeMap(){
        return null;
        
    }
}
