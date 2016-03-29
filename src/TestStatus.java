/**
 * Created by anna on 28.03.16.
 */
public enum TestStatus {

    PASSED,
    FAILED,
    SKIPPED,
    ABORTED;

    public boolean canContinue(){
        if(this == PASSED || this == SKIPPED){
            return true;
        } else {
            return false;
        }
    }


}
