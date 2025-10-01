import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class HelloController {

    @FXML private Button helloButton;
    @FXML private TextField campo1;
    @FXML private TextField campo2;
    @FXML private TextField campo3;

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
            tipo = "Comida";
        } else if (bebida.isSelected()) {
            tipo = "Bebida";
        }

        System.out.println("Item adicionado: " + tipo +
                " | Valores: " + campo1.getText() + ", " +
                campo2.getText() + ", " +
                campo3.getText());
    }
}