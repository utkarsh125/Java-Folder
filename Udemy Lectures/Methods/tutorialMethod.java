package Methods;

public class tutorialMethod {
    public static void main(String[] args) {
        int newScore = calcScore("Utkarsh", 50);
        System.out.println("The new Score: " + newScore);
        //TWO WAYS TO ACCESS THE OVERLOADED METHOD
        //FIRST WAY
        calcScore(75);
        //WITH NO PARAMETERS
        calcScore();
    }

    public static int calcScore(String name, int score){
        System.out.println(name+ " "+"scored "+ score);
        return score*1000;
    }
    //OVERLOADED METHOD
    public static int calcScore(int score){
        System.out.println("Unnamed Player"+ " "+"scored "+ score);
        return score*1000;
    }

    //SECOND OVERLOADED METHOD
    public static int calcScore(){
        System.out.println("No player name, no player score.");
        return 0; //as we got nothing to return
    }
}
