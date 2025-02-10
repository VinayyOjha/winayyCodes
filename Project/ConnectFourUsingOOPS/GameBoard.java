package ConnectFourUsingOOPS;

public class GameBoard{
    private int rows;
    private int columns;
    private int[][] board;
    
    public GameBoard(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        setGrid();
    }
    
    private void setGrid(){
        board = new int[rows][columns];
    }
}