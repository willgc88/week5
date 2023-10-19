package use_case.clear_users;

import java.util.List;

public class ClearOutputData {
    private final List usernames;

    public ClearOutputData(List usernames) {
        this.usernames = usernames;
    }
    public String getUsernames() {
        return usernames.toString();
    }
}
