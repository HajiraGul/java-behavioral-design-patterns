/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatterndemo;

/**
 *
 * @author PMYLS
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
