package interface_adapter.clear_users;

public class ClearState {
    private String clearError = null;
    public ClearState(ClearState copy) {
        clearError = copy.clearError;
    }
    public ClearState() {}

    public void setClearError(String clearError) {
        this.clearError = clearError;
    }
}
