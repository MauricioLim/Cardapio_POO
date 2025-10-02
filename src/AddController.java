import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class AddController {

    Map<String, itemCardapio> itens = new HashMap<>();

    @FXML private Button helloButton;
    @FXML private Button backButton;

    @FXML private TextField descricao;
    @FXML private TextField quantidade;
    @FXML private TextField valor;


    @FXML private RadioButton comida;
    @FXML private RadioButton bebida;

    private ToggleGroup grupo; // Criamos o grupo aqui

    @FXML
    public void initialize() {
        grupo = new ToggleGroup();      // Inicializa o grupo
        comida.setToggleGroup(grupo);   // Associa os RadioButtons
        bebida.setToggleGroup(grupo);
    }

    @FXML
    protected void onHelloButtonClick() {
        String tipo = "";

        if (comida.isSelected()) {
            Comida food = new Comida(descricao.getText(), Integer.parseInt(quantidade.getText()), Double.parseDouble(valor.getText()));
            System.out.println("Comida adicionado com sucesso");

        } else if (bebida.isSelected()) {
            Bebida drink = new Bebida(descricao.getText(), Integer.parseInt(quantidade.getText()), Double.parseDouble(valor.getText()));
            System.out.println("Bebida adicionado com sucesso");
        }

        //System.out.println("Item adicionado: " + tipo +
        //        " | Valores: " + descricao.getText() + ", " +
        //        quantidade.getText() + ", " +
        //        valor.getText());
    }

    @FXML
    protected void backScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("menu.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) backButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Adicionar Item");
            //stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}