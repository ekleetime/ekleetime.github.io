import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by lee on 2019-11-29.
 */
public class JunitTestTest {
    public static JunitTest junitTest;
    @BeforeClass
    public static void makeInstance()throws Exception {
        junitTest = new JunitTest("È«±æµ¿", 20, 180.0f);

    }
    @Before
    public void beforeTest()throws Exception {
        System.out.println("before!!");
    }
    @Test
    public void getName() throws Exception {
        assertEquals("È«±æµ¿", junitTest.getName());
    }

    @Test
    public void getAge() throws Exception{
        assertEquals(20,junitTest.getAge());
    }

    @Test
    public void getTall() throws Exception{
        assertEquals(180.0f, junitTest.getTall(),180.f);
    }

    @Test
    public void setAge()throws Exception {
        junitTest.setAge(29);
    }

    @Test
    public void getAge2() throws Exception{
        assertEquals(29,junitTest.getAge());
    }

    @Test
    @Ignore
    public void setTall()throws Exception {
        junitTest.setTall(170.0f);
    }

    @Test
    public void getTall2() throws Exception{
        assertEquals(170.0f, junitTest.getTall(),180.f);
    }


    @Test
    public void setName()throws Exception {
        junitTest.setName("ÀÓ²©Á¤");
    }

    @Test
    public void getName2() throws Exception {
        assertEquals("È«±æµ¿", junitTest.getName());
    }

    @After
    public void printAfter()throws Exception {
        System.out.println("After!!");
    }

    @AfterClass
    public static void printAfterClass()throws Exception {
        System.out.println("AFTER CLASS");
    }




    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetName() throws Exception {

    }

    @Test
    public void testGetAge() throws Exception {

    }

    @Test
    public void testGetTall() throws Exception {

    }

    @Test
    public void testSetName() throws Exception {

    }

    @Test
    public void testSetAge() throws Exception {

    }

    @Test
    public void testSetTall() throws Exception {

    }

    @Test
    public void testPrintInfo() throws Exception {

    }
}