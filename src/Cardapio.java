import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Cardapio extends Application {
    private static Cardapio instance;
    Scanner teclado = new Scanner(System.in);

    private HashMap <String, itemCardapio> itens = new HashMap<String, itemCardapio>();

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Exemplo JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static Cardapio getInstance() {
        if (instance == null) {
            instance = new Cardapio();
        }
        return instance;
    }

    public void addBebida(Bebida drink){
        itens.put("B" + itens.size() + 1, drink);
    }

    public void addComida(Comida food){
        itens.put("C" + itens.size() + 1, food);
    }

    public HashMap<String, itemCardapio> getItens() {
        return itens;
    }

    public static void main(String[] args) {
        launch();
    }
}


