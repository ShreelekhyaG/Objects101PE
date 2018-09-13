package Test;

import Java.StudentGradeCalc6;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class StudentGradeCalc6Test {
    StudentGradeCalc6 studentGradeCalc6;
    @Before
    public void setUp() throws Exception {
        studentGradeCalc6=new StudentGradeCalc6();
    }

    @After
    public void tearDown() throws Exception {
        studentGradeCalc6=null;
    }

    @Test
    public void avgCalc() {
        assertEquals(81.5,studentGradeCalc6.avgCalc(new int[]{86,65,98,77}),0.1);
        assertEquals(50.0,studentGradeCalc6.avgCalc(new int[]{50,50}),0.1);
    }
    @Test
    public void avgCalcFailure() {
        assertNull(studentGradeCalc6.avgCalc(new int[]{}));
        assertNotNull("failed",studentGradeCalc6.avgCalc(new int[]{36,89,50}));
    }

    @Test
    public void minGrade() {
        assertEquals(67,studentGradeCalc6.minGrade(new int[]{67,89,90,99}),0);
        assertEquals(23,studentGradeCalc6.minGrade(new int[]{23,89,90,99}),0);
    }
    @Test
    public void minGradeFailure(){
        assertNull(studentGradeCalc6.minGrade(new int[]{}));
        assertNotSame("failed",34,studentGradeCalc6.minGrade(new int[]{34,67,98,90,12}));
    }

    @Test
    public void maxGrade() {
        assertEquals(99,studentGradeCalc6.maxGrade(new int[]{67,89,90,99}),0);
        assertEquals(87,studentGradeCalc6.maxGrade(new int[]{87}),0);
    }
    @Test
    public void maxGradeFailure(){
        assertNull(studentGradeCalc6.maxGrade(new int[]{}));
        assertNotSame("failed",3,studentGradeCalc6.maxGrade(new int[]{3,90,89}));
    }
}