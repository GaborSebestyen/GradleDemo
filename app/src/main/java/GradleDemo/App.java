package GradleDemo;

/**
 * This class is created for demonstration purposes.
 * The class has a single method that prints a greeting to the console.
 */
public class App{

    /**
     * Method to say hello
     * @return a string with a greeting message
     */
    public String getGreeting(){
        return "Hello World!";
    }

    /**
     * Main method that calls the App classes only method.
     * @param args is mandatory for the main method, this time unused.
     */
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
