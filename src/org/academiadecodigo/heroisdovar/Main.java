package org.academiadecodigo.heroisdovar;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Main {
    public static void main(String[] args) {

       /* Rectangle rectangleAlone = new Rectangle(40, 40, 40, 40);
        rectangleAlone.draw();*/

        //instance the grid, I can choose the size
        Grid grid = new Grid(20, 20);

        //instance a cursor with color
        Cursor cursor = new Cursor(grid);
        cursor.makeCursorToStart();


        new InputHandler(cursor);




    }

}





