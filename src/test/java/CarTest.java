package test.java;

import com.example.car_gen.Honda;
import com.example.car_gen.Lexus;
import com.example.car_gen.Toyota;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class CarTest {

    Honda civic = new Honda("red", 2006, 120, false, true);
    Lexus rx350 = new Lexus("white", 2015, 120, false, true);
    Toyota supra = new Toyota("black", 2021, 140, false, true);
    @Test
    @Description("getColor returns the correct colors")
    public void testGetColor() {

        assertEquals("red", civic.getColor());
        assertEquals("white", rx350.getColor());
        assertEquals("black", supra.getColor());

    }

    @Test
    @Description("Returns an integer")
    public void accelerateSpeed() {

        //test if value of speed is being returned
        Assert.assertTrue(Integer.class.isInstance(civic.acceleratedSpeed()));

        //breakdown, reset speed
        civic.setSpeed(0);

    }

    @Test
    @Description("Value is increased by 5")
    public void accelerateSpeed2() {
        //setup
        int results = civic.acceleratedSpeed();
        //test if value is increased by 5
        Assert.assertEquals(results, 5);

        //teardown

        civic.setSpeed(0);

    }

    @Test
    @Description("Should not return a value above maxSpeed")
    public void accelerateSpeedNotaboveMax() {
        //setup
        civic.setSpeed(civic.getMaxSpeed() - 3);

        //exercise
        int results = civic.acceleratedSpeed();


        //verify

        assertTrue(results <= civic.getMaxSpeed());

        //teardown
        civic.setSpeed(0);

    }

    @Test
    @Description("Returns an integer")
    public void decelerateSpeed1() {

        int results;

        results = civic.decelerateSpeed();

        Assert.assertTrue(Integer.class.isInstance(results));

        //teardown

        civic.setSpeed(0);
    }

    @Test
    @Description("Decreases speed by 5")
    public void decelerateSpeed2() {
        //setup
        int results;
        civic.setSpeed(45);

        //exercise

        results = civic.decelerateSpeed();

        Assert.assertEquals(results, 40);

        //teardown
        civic.setSpeed(0);
    }

    @Test
    @Description("Speed should not drop below 0")
    public void decelerateSpeed3() {
        //setup
        int results;
        civic.setSpeed(3);

        //exercise

        results = civic.decelerateSpeed();

        assertTrue(results >= 0);

        //teardown
        civic.setSpeed(0);
    }

    @Test
    @Description("convertToElectric should return a boolean")
            public void  convertToElectric1() {
        //setup
        boolean results;
        //exercise
        results = civic.convertToElectric();

        assertTrue(results == true || results == false);

        //teardown

        civic.setIsElectric(false);
    }

    @Test
    @Description("convertToElectric should set isElectric to true if car is not electric and then return value")
    public void  convertToElectric2() {
        //setup
        boolean results;

        //exercise
        results = civic.convertToElectric();

        assertTrue(results == true);


        //teardown

        civic.setIsElectric(false);
    }

    @Test
    @Description("convertToElectric should print a string if car is already electric")
    public void  convertToElectric3() {
        //setup
        boolean results;
        String userMsg  = "The car is already electric\r\n";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream(); //create a new io stream
        System.setOut(new PrintStream(outContent));//set system stream to new io
        PrintStream originalOut = System.out;// save original stream

        civic.setIsElectric(true);
        //exercise
        results = civic.convertToElectric();

        assertEquals(userMsg, outContent.toString());


        //teardown

        civic.setIsElectric(false);
        System.setOut(originalOut);//set back to original stream

    }



}
