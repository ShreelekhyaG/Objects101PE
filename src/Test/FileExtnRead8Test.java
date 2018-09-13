package Test;

import Java.FileExtnRead8;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileExtnRead8Test {
    FileExtnRead8 fileExtnRead8;
    @Before
    public void setUp() throws Exception {
        fileExtnRead8=new FileExtnRead8();
    }

    @After
    public void tearDown() throws Exception {
        fileExtnRead8=null;
    }

    @Test
    public void read() {
        assertEquals("failed","Hello",fileExtnRead8.read("/home/cgi/IdeaProjects/Objects101PE/src/Java/","input.txt"));
        assertEquals("failed","shreelekhya gampa",fileExtnRead8.read("/home/cgi/IdeaProjects/Objects101PE/src/Java/","testing.csv"));
    }
    @Test
    public void readNull() {
        assertEquals("failed","file not found",fileExtnRead8.read("/home/cgi/IdeaProjects/Objects101PE/src/Java/","inp.txt"));
    }
}