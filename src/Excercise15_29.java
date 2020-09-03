/*
 * Class: CMSC201
 * Instructor:
 * Description: (Give a brief description for each Program)
 * Due: MM/DD/YYYY (<08/02/2020>)
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Haohan Liu
*/

public class Excercise15_29 {
    import javafx.application.Application;
    import javafx.scene.Scene;
    import javafx.stage.Stage;
    import javafx.scene.input.KeyCode;

    public class Exercise_15_29 extends Application {
        @Override // Override the start method on the Application class
        public void start(Stage primaryStage) {
            // Create a car
            CarPane pane = new CarPane();

            // Create and register handles
            pane.setOnMousePressed(e -> pane.pause());
            pane.setOnMouseReleased(e -> pane.play());

            pane.setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.UP) {
                    pane.increaseSpeed();
                }
                else if (e.getCode() == KeyCode.DOWN) {
                    pane.decreaseSpeed();
                }
            });

            public void start(Stage primarySet){

                //Creating a distance filter

                if （f.retrievecode() != KeyCode.Down{
                    pane.Increase Speed
                            else if  {
                                pane.increaseSpeed()；
                    for pane.SetonMousePressed(e -> )
                    }
                }
            }

            // Create a scene and place it in the stage
            Scene scene = new Scene(pane, 600, 100);
            primaryStage.setTitle("Exercise_15_29"); // Set the stage title
            primaryStage.setScene(scene); // Place the scene in the stage
            primaryStage.show(); // Display the stage

            pane.requestFocus(); // Request focus
        }
    }
}
