package rps;

public class GameManager {
    public String wonDialog;

    public String[] choices = {"Rock","Paper","Scissors"};
    GameManager(String wonDia){
    wonDialog = wonDia;

    }
    public String checkVictory(Player Player1,Player Player2){

        if(Player1.choice.equals("Rock" )&& Player2.choice.equals("Scissors")){
            return Player1.name;
        }
        else if(Player1.choice.equals("Scissors") && Player2.choice.equals("Paper")){
            return Player1.name;
        }
        else if(Player1.choice.equals("Paper") && Player2.choice.equals("Rock")){
            return Player1.name;
        }
        else if(Player1.choice.equals(Player2.choice) ){
            return "Tie";
        }
        else{
            return Player2.name;
        }


    }
    public void congratulate(String Winner){
        if (Winner.equals("Tie")){
            System.out.println("Tie!!");
        }
        else{
            System.out.printf(wonDialog,Winner);
        }

    }
    public void showChoices(){
        System.out.println("Choose : ");
        for(int i=1;i <= 3;i++){
            System.out.printf("%d ==> %s\n",i,choices[i-1]);
        }
    }

}
