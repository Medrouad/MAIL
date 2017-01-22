package TP1;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class OrdinateurTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class OrdinateurTest
{
    /**
     * Default constructor for test class OrdinateurTest
     */
    public OrdinateurTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testNom()
    {
        TP1.Ordinateur ordinate2 = new TP1.Ordinateur("DELL", 400);
        ordinate2.affiche();
        ordinate2.affiche();
        assertEquals("DELL", ordinate2.getNom());
        ordinate2.affiche();
    }

    @Test
    public void testPrix()
    {
        TP1.Ordinateur ordinate1 = new TP1.Ordinateur("DELL", 400);
        ordinate1.affiche();
        ordinate1.getPrix();
        assertEquals(400, ordinate1.getPrix(), 0.1);
        ordinate1.setPrix(500);
        assertEquals(500, ordinate1.getPrix(), 0.1);
    }
}


