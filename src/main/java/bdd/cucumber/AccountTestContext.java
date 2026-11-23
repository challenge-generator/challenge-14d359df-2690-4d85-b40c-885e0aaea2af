// TODO(reto): archivo stubbeado; implementa los cuerpos.
package bdd.cucumber;

import domain.model.Account;

public class AccountTestContext {

    private Account account;
    private boolean isValid;
    private String lastErrorMessage;

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setValidationResult(boolean valid) {
        this.isValid = valid;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setErrorMessage(String message) {
        this.lastErrorMessage = message;
    }

    public String getErrorMessage() {
        return lastErrorMessage;
    }

    public void clear() {
      throw new UnsupportedOperationException("TODO(reto): clear");
    }
}