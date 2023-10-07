package org.academiadecodigo.heroisdovar;

import org.academiadecodigo.heroisdovar.Grid;
import org.academiadecodigo.heroisdovar.GridCell;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class InputHandler implements KeyboardHandler {

    //proprieties to have the positions: left, right, up, down
    private final Keyboard keyboard;
    private final KeyboardEvent[] events;
    private Cursor cursor;
    private boolean spacePressed;

    //constructor
    public InputHandler(Cursor cursor) {
        this.cursor = cursor;
        this.spacePressed = false;
        keyboard = new Keyboard(this);
        events = new KeyboardEvent[6];
        createEvents();
    }

    private void createEvents() {

        for (int i = 0; i < events.length; i++) {
            events[i] = new KeyboardEvent();
        }

        events[0].setKey(KeyboardEvent.KEY_DOWN);
        events[1].setKey(KeyboardEvent.KEY_RIGHT);
        events[2].setKey(KeyboardEvent.KEY_LEFT);
        events[3].setKey(KeyboardEvent.KEY_UP);
        events[4].setKey(KeyboardEvent.KEY_SPACE);
        events[5].setKey(KeyboardEvent.KEY_SPACE);


        for (int i = 0; i < events.length -1; i++) {
            events[i].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(events[i]);
        }
        events[6].setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(events[6]);
    }

    //method to press
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_DOWN:
                cursor.getCursor().translate(0, 40);
                if (spacePressed) {
                    cursor.fillCell();
                }
                break;
            case KeyboardEvent.KEY_RIGHT:
                cursor.getCursor().translate(40, 0);
                if (spacePressed) {
                    cursor.fillCell();
                }
                break;
            case KeyboardEvent.KEY_LEFT:
                cursor.getCursor().translate(-40, 0);
                if (spacePressed) {
                    cursor.fillCell();
                }
                break;
            case KeyboardEvent.KEY_UP:
                cursor.getCursor().translate(0, -40);
                if (spacePressed) {
                    cursor.fillCell();
                }
                break;
            case KeyboardEvent.KEY_SPACE:
                spacePressed = true;
                break;
        }
    }

    //method to released
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        switch ((keyboardEvent.getKey())) {

            case KeyboardEvent.KEY_SPACE:
                spacePressed = false;
                break;
        }
    }
}
