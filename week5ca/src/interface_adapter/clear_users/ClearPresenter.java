package interface_adapter.clear_users;
import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupState;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import java.util.ArrayList;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private SignupViewModel signupViewModel;
    private ViewManagerModel viewManagerModel;
    public ClearPresenter(ViewManagerModel viewManagerModel, SignupViewModel signupViewModel, ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.signupViewModel = signupViewModel;
        this.clearViewModel = clearViewModel;
    }

    public void prepareSuccessView(ClearOutputData usernames) {
        ClearState clearState = clearViewModel.getState();
        clearState.setUsernames(usernames.getUsernames());
        SignupState signupState = signupViewModel.getState();
        signupState.setClearedUsers(usernames.getUsernames());
        this.clearViewModel.setState(clearState);
        this.signupViewModel.setState(signupState);
        clearViewModel.firePropertyChanged();
        signupViewModel.firePropertyChanged();

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }

    public void prepareFailView(String error) {
        ClearState clearState = clearViewModel.getState();
        clearState.setClearError(error);
        clearViewModel.firePropertyChanged();
    }

}
