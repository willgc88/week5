package interface_adapter.clear_users;

import java.util.ArrayList;

public class ClearState {
    private String clearError = null;
    private String usernames = null;
    public ClearState(ClearState copy) {
        clearError = copy.clearError;
        usernames = copy.usernames;
    }
    public ClearState() {}

    public void setClearError(String clearError) {
        this.clearError = clearError;
    }
    public void setUsernames(String usernames) {
        this.usernames = usernames;
    }
    public String getUsernames() {
        return usernames;
    }
}
