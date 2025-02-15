/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templatepatterndemo;


public class TemplatePatternDemo {

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();

        game = new Football();
        game.play();
    }
}
