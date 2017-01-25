/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rkarne
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getGender method, of class Student.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of getGrade method, of class Student.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        Student instance = new Student();
        double expResult = 0.0;
        double result = instance.getGrade();
        assertEquals(expResult, result, 0.0);
 
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = new Student();
        instance.setName(name);
     
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Student instance = new Student();
        instance.setId(id);

    }

    /**
     * Test of setGender method, of class Student.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        Student instance = new Student();
        instance.setGender(gender);
  
    }

    /**
     * Test of setGrade method, of class Student.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        double grade = 0.0;
        Student instance = new Student();
        instance.setGrade(grade);
    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "{ \"name\" : \"\", \"id\" : \"\" , \"gender\" : \"\", \"grade\" : \"0.0\"}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    @Test
    public void testStudent(){
        System.out.println("teststudent Counstructor");
        Student instance = new Student("sim", "101","male",12.0);
        boolean expResult = true;
        boolean result = instance.getGender().equals("male");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEqualsName() { 
        System.out.println("equals");
        Object obj = new Student();
        Student instance = new Student("sim", "101","male", 12.0);
        boolean expResult = true;
        boolean result = instance.getName().equals("sim");
        assertEquals(expResult, result);
    }
    
       @Test
    public void testEqualsID() {
        System.out.println("equals");
        Object obj = new Student();
        Student instance = new Student("sim", "101","male", 12.0);
        boolean expResult = true;
        boolean result = instance.getId().equals("101");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEqualsNameFalse() { 
        System.out.println("equals");
        Object obj = new Student();
        Student instance = new Student("sim", "101","male", 12.0);
        boolean expResult = false;
        boolean result = instance.getName().equals("rex");
        assertEquals(expResult, result);
    }
    
       @Test
    public void testEqualsIDFalse() {
        System.out.println("equals");
        Object obj = new Student();
        Student instance = new Student("sim", "101","male", 12.0);
        boolean expResult = false;
        boolean result = instance.getId().equals("111");
        assertEquals(expResult, result);
    }
    
  @Test
    public void testToStringJson() {
        System.out.println("toString");
        Student instance = new Student("sim", "101", "male", 12.0);
        String expResult = "{ \"name\" : \"sim\", \"id\" : \"101\" , \"gender\" : \"male\", \"grade\" : \"12.0\"}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
