package use_case.clear_users;
import use_case.login.LoginOutputData;

import java.util.ArrayList;

public interface ClearOutputBoundary {
    void prepareSuccessView(ClearOutputData clearOutputData);
}
