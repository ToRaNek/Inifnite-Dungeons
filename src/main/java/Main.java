package src.main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class Main {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Player player = new Player("Joueur1", 100, 10, 1, 10, 1, 1);
        Game game = new Game(player);

        game.showStartMenu();

        boolean optionEntered = false;
        do{
                    String result = Utils.readString();
                    switch (result) {
                        case "1":
                            optionEntered = true;
                            game.start();
                            break;
                        case "2":
                            optionEntered = true;
                            
                        case "3":
                            game.showHelpMenu();
                            TimeUnit.SECONDS.sleep(4);
                            game.showStartMenu();
                            break;
                        case "4":
                            optionEntered = true;
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Choix Invalide");
                            break;
                    }       


        }while (!optionEntered);
         




    }

}