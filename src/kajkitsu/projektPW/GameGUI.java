package kajkitsu.projektPW;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        RunGame runGame = new RunGame();
        Game game = runGame.runGame();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("game-gui.fxml"));
        Parent root = (Parent) loader.load();

        Controller controller = loader.getController();
        controller.setGame(game);
        primaryStage.setTitle("ProjektPW github.com/Kajkitsu");
        primaryStage.setScene(new Scene(root, 1410, 380));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);

    }
}