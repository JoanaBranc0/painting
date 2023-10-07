package org.academiadecodigo.heroisdovar;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Grid {
    //Proprieties
    public static final int PADDING = 10;
    public static final int cellSize = 40;
    private GridCell[][] allRectangles;

    private int col;
    private int row;
    private Cursor cursor;

    //Don't know if I need, BUT...
    private int x;
    private int y;
    private int width;
    private int height;
    private int makeGrid;

    //Constructors
    public Grid(int col, int row) {
        allRectangles = new GridCell[col][row];
        this.col = col;
        this.row = row;
        makeGrid();
    }

    public int getCellSize() {
        return cellSize;
    }

    //method to make a grid
    public void makeGrid() {
        for (int i = 0; i < allRectangles.length; i++) {
            for (int j = 0; j < allRectangles[i].length; j++) {
                allRectangles[i][j] = new GridCell(i * cellSize + PADDING, j * cellSize + PADDING, cellSize, cellSize);
            }
        }
    }


    public GridCell[][] getAllRectangles() {
        return allRectangles;
    }
}


