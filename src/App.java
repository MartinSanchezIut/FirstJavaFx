import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;


public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        creerStage("Vous avez été infecté par le Covid-19", "Un virus du nom de cocoronana a infecté votre cerveau").show();
    }




    public Stage creerStage(String nom, String labl) {
        Stage stage = new Stage() ;

        stage.setTitle(nom);
        stage.setResizable(false);

        stage.setWidth(450);
        stage.setHeight(180);



        stage.setX(getRandomDouble(0, 1920 - 450));
        stage.setY(getRandomDouble(0, 1080 - 180));

        VBox vbox = new VBox() ;

        Label lbl = new Label(labl) ;

        Button btn = new Button("Noon enlevez moi cette merde") ;
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Chaiiii");
                creerStage("Chai", "Le virus se propage nooon soyez plus rapiude").show();
                creerStage("Chai", "c'est mort la striute").show();
            }
        });
        vbox.getChildren().add(lbl) ;
        vbox.getChildren().add(btn) ;

        Scene scene = new Scene(vbox) ;
        stage.setScene(scene);

        return stage;
    }

    public static double getRandomDouble(double min, double max) {
        double start = min;
        double end = max;
        double random = new Random().nextDouble();
        double result = start + (random * (end - start));

return result ;
    }
}
