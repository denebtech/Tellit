package tellit.com.tellit.controller.operations;

/**
 * Created by ioshero on 04.09.15.
 */
public interface OperationCalback {
    void onComplete();
    void onError(Exception ex);
}
