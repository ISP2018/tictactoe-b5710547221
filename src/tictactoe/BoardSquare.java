package tictactoe;


import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * A single square on the game board.
 */
public class BoardSquare extends Rectangle {
	/** square knows its own row and column. */
	private int row;
	private int column;
	private int size;
	
	/**
	 * initial board specification
	 */
	public BoardSquare(int row, int col, int size){
		super(100, 100);
        this.row = row;
        this.column = col;
		size  = row*col;
		this.size = size;
	}
	/**
	 * get board row
	 */
	public int getRow() {
		return this.row;
	}
	/**
	 * get board column
	 */
	public int getColumn() {
		return this.column;
	}
	/**
	 * get board size
	 */
	public int getSize(){
		return this.size;
	}
	
}
