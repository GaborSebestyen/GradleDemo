package GradleDemo;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AppTest{
    @Test public void appHasAGreeting(){
        //Arrange
        App myApp = new App();
        //Act and Assert
        assertNotNull(myApp.getGreeting(), "app should have a greeting");
    }

    /** 
    @Test public void appFailingTest(){
        //Arrange
        App myApp = new App();
        //Act and Assert
        assertNull(myApp.getGreeting(), "test will fail");
    }
    */
}
