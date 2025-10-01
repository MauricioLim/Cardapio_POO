import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Cardapio extends Application {
    Scanner teclado = new Scanner(System.in);

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Exemplo JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    Map<String, itemCardapio> itens = new HashMap<>();

    public void mostrar(){
        for (itemCardapio item : itens.values()) {
            System.out.println(item.getNome() + " - R$" + item.getPreco());
        }

        System.out.println();
        menu();
    }

    public void adicionarItem() {
        System.out.println("O que tu gostaria de adicionar ao cardapio: \n1 - Bebida \n2 - Comida");
        int op = teclado.nextInt();
        teclado.nextLine();


        switch (op) {
            case 1:
                System.out.print("Informe a descrição: ");
                String nome = teclado.nextLine();

                System.out.print("Informe quantos mls tem a bebida: ");
                int ml = teclado.nextInt();
                teclado.nextLine();

                System.out.print("Informe o preço: ");
                double preco = teclado.nextDouble();
                teclado.nextLine();

                Bebida drink = new Bebida(nome, ml, preco);
                itens.put(nome, drink);
                System.out.println();
                menu();
                break;
            
            case 2:
                System.out.print("Informe a descrição: ");
                nome = teclado.nextLine();

                System.out.print("Informe quantas pessoas o prato serve: ");
                int qtd = teclado.nextInt();

                System.out.print("Informe o preço: ");
                preco = teclado.nextDouble();

                Comida plate = new Comida(nome, qtd, preco);
                itens.put(nome, plate);
                System.out.println();
                menu();
                break;
            default:
                System.out.println("Opção invalida!");
                System.out.println();
                adicionarItem();
                break;
        }

    }

    public void menu(){
        System.out.println();
        System.out.print("Bem vindo ao Mau lanchonete, o que gostaria de fazer: \n1 - Adicionar item ao cardapio \n2 - Visualizar o carpio \n3 - Sair \nDigite a opção: ");
        int op  = teclado.nextInt();
        teclado.nextLine();

        switch (op) {
            case 1:
                adicionarItem();
                break;
            case 2:
                mostrar();
                break;
            case 3:
                System.out.println("Obrigado por visitar! Não volte mais");
                break;
            default:    
                System.out.println("Opção invalida!");
                System.out.println();
                menu();
                break;
        }
    }



    public static void main(String[] args) {
        launch();
    }
}
