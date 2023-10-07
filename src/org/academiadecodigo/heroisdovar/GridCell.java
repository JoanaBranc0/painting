package org.academiadecodigo.heroisdovar;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class GridCell {

    //proprieties
    public static final int PADDING = 10;
    private Rectangle rectangleAlone;
    private int x;
    private int y;
    private int cellSize;


    //constructor
    public GridCell(int x, int y, int cellSize, int size) {
        this.cellSize = cellSize;
        this.rectangleAlone = new Rectangle(x, y, cellSize, size);
        this.x = x;
        this.y = y;

        rectangleAlone.draw();
        //rectangleAlone.fill();
    }

    //getters
    public Rectangle getRectangleAlone() {
        return rectangleAlone;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getCellSize() {
        return cellSize;
    }

    //setters
    public void setRectangleAlone(Rectangle rectangleAlone) {
        this.rectangleAlone = rectangleAlone;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCellSize(int cellSize) {
        this.cellSize = cellSize;
    }

    /*method to create a grid
    public void makeRectangle() {
        rectangleAlone.draw();
    }

    public boolean isPainted() {

        return false;
    }*/
}
