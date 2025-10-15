import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;

public class ViewController {
    @FXML private Button backButton;
    @FXML private TableView<itemCardapio> itensComida;
    @FXML private TableView<itemCardapio> itensBebida;

    @FXML private TableColumn<itemCardapio,String> colunaDescComida;
    //@FXML private TableColumn<itemCardapio,String> colunaQtd;
    @FXML private TableColumn<itemCardapio,String> colunaValorComida;

    @FXML private TableColumn<itemCardapio,String> colunaDescBebida;
    @FXML private TableColumn<itemCardapio,String> colunaValorBebida;


    private Cardapio cardapio = Cardapio.getInstance();

    @FXML
    protected void backScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("menu.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) backButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Mal Restaurante");
            //stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initialize() {


        colunaDescComida.setCellValueFactory(new PropertyValueFactory<>("nome"));
        //colunaQtd.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
        colunaValorComida.setCellValueFactory(new PropertyValueFactory<>("preco"));

        colunaDescBebida.setCellValueFactory(new PropertyValueFactory<>("nome"));
        //colunaQtd.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
        colunaValorBebida.setCellValueFactory(new PropertyValueFactory<>("preco"));

        ObservableList<itemCardapio> lista = FXCollections.observableArrayList(cardapio.getItens().values());

        itensComida.setItems(lista);
    }
}
