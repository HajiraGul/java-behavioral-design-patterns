/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templatepatterndemo;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // Template method
    public final void play(){

        // Initialize the game
        initialize();

        // Start game
        startPlay();

        // End game
        endPlay();
    }
}