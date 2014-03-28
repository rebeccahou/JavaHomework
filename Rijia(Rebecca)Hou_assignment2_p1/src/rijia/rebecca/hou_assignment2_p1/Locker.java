package rijia.rebecca.hou_assignment2_p1;
/**
 * @version 1.0
 * @author Rijia(Rebecca) Hou
 * 24/09/2013
 */
/**
 * Class Locker has only one attribute, ifopen. It also has two methods, ChangeStatus and ReadStatus. 
 */
public class Locker {
    private boolean ifopen; // true if open, false if the locker is locked
    /**
     * Description: this method is used to change the current status of the locker
     */
    Locker(){
        ifopen = false; // the initial status of the locker should be closed
    }
    public void ChangeStatus(){
        ifopen = !ifopen; // if the locker is open, then lock; if the locker is locked, then open
    }
    /**
     * Descriptioin: this method is used to get the current status of the locker
     * @return if true, then lock is open, if false then locker is locked
     */
    public boolean ReadStatus(){
        return ifopen; // return the status of the locker 
    }
}
