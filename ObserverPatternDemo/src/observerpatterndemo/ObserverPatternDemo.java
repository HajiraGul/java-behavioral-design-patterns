/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatterndemo;

/**
 *
 * @author PMYLS
 */
public class ObserverPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subject subject=new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("First state change:15");
        subject.setState(15);
        System.out.println("First state change:10");
        subject.setState(10);
    }
}
