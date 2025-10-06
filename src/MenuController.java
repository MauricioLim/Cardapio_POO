import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//import java.awt.*;
import javafx.scene.control.Button;
public class MenuController {



          private Cardapio cardapio = Cardapio.getInstance();
    @FXML private Button addButton;
    @FXML private Button viewButton;

    @FXML
    protected void addItem() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("screen.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) addButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle(" Item");
            //stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void viewItem() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) viewButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Adicionar Item");
            this.cardapio.getItens();

            //stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}