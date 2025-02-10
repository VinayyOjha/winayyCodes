package ConnectFourUsingOOPS;

public class Player {
    private String name;
    private int playerNumber;
    private char playerSymbol;
    
    public Player(String name, int playerNumber, char playerSymbol){
        this.name = name;
        this.playerNumber = playerNumber;
        this.playerSymbol = playerSymbol;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPlayerNumber(){
        return playerNumber;
    }
    
    public char getPlayerSymbol(){
        return playerSymbol;
    }
}
