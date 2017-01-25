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
public class CourseTest {
    
    public CourseTest() {
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
     * Test of add method, of class Course.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object student = null;
        List<Student> ls = new ArrayList<>();
        Student s = new Student();
        Course instance = new Course(ls);
        instance.add(s);
        
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_Object() {
        System.out.println("remove");
        //Object student = null;
        List<Student> ls = new ArrayList<>();
        Student s = new Student();
        ls.add(s);
        Course instance = new Course(ls);
        instance.remove(s);
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_String() {
        System.out.println("remove");
        String id = "";
        List<Student> ls = new ArrayList<>();
        Student s = new Student();
        ls.add(s);
        Course instance = new Course(ls);
        instance.remove(id);
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int position = 0;
        List<Student> ls = new ArrayList<>();
        Student s = new Student();
        ls.add(s);
        Course instance = new Course(ls);
        instance.remove(position);
       
    }

    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Course instance = new Course();
        List<Student> expResult = null;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student("sim", "101", "male", 12.0);
        String expResult = "{ \"name\" : \"sim\", \"id\" : \"101\" , \"gender\" : \"male\", \"grade\" : \"12.0\"}";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getAllByGender method, of class Course.
     */
    @Test
    public void testGetAllByGender() {
        System.out.println("getAllByGender");
        List<Student> ls = new ArrayList<>();
        
        Course instance = new Course(ls);
        Set <String> s = new HashSet<>();
        Set<String> expResult = s;
        Set<String> result = instance.getAllByGender("male");
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getGradeMap method, of class Course.
     */
    @Test
    public void testGetGradeMap() {
        System.out.println("getGradeMap");
        List <Student> ls = new ArrayList<>();
        Course instance = new Course(ls);
        Set<String> sdemo;
        sdemo = new HashSet<>();
        Map<String, Set<String>> s = new HashMap<>();
        s.put("A", (Set<String>) sdemo);
        s.put("B", (Set<String>) sdemo);
        s.put("C", (Set<String>) sdemo);
        s.put("D", (Set<String>) sdemo);
        Map<String, Set<String>> expResult = s;
        Map<String, Set<String>> result = instance.getGradeMap();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testGetAllnoarugment() {
        System.out.println("getAll");
        Course instance = new Course();
        List<Student> student = new ArrayList<>();
        Course cs = new Course(student);
        List<Student> expResult = null;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
    }
    
}
