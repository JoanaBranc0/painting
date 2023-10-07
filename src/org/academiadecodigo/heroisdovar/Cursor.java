package org.academiadecodigo.heroisdovar;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cursor {

    //proprieties
    private Rectangle cursor;
    private int position;
    Grid grid;

    //constructor
    public Cursor(Grid grid) {
        this.grid = grid;
    }

    /*method to show and fill cursor
    public void showColor(Color orange) {
        cursor.fill();
    }*/

    public void makeCursorToStart() {
        cursor = new Rectangle(Grid.PADDING, Grid.PADDING, Grid.cellSize, Grid.cellSize);
        cursor.setColor(Color.GREEN);
        cursor.fill();
    }

    public Rectangle getCursor() {
        return cursor;
    }

    public void setCursor(Rectangle cursor) {
        this.cursor = cursor;
    }

    public void fill() {
    }

    public int getPosition() {
        return position;
    }

    public Grid getGrid() {
        return grid;
    }

    public int yToRow() {
        return cursor.getY() / Grid.cellSize;
    }

    public  int xToCol() {
        return cursor.getX() / Grid.cellSize;
    }



    public void fillCell() {
        //for (int i = 0; i < allRectangles.length; i++) {
        //for (int j = 0; j < allRectangles[i].length; j++) {
               /*if (allRectangles[i][j].getRectangleAlone().getX() == cursor.getX() && allRectangles[i][j].getRectangleAlone().getY() == cursor.getY()){
                    allRectangles[i][j].getRectangleAlone().fill();*/
                /*if (allRectangles[i][j].getX() == cursor.getX() && allRectangles[i][j].getY() == cursor.getY()) {
                    allRectangles[i][j].getRectangleAlone().fill();*/
        if (grid.getAllRectangles()[xToCol()][yToRow()].getRectangleAlone().isFilled()) {
            grid.getAllRectangles()[xToCol()][yToRow()].getRectangleAlone().draw();
        } else {
            grid.getAllRectangles()[xToCol()][yToRow()].getRectangleAlone().fill();
        }


        //agora não está a pintar, quero que pinte!

        //

    }

}
