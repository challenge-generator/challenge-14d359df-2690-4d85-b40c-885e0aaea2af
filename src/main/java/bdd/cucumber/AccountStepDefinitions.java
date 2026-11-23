// TODO(reto): archivo stubbeado; implementa los cuerpos.
package bdd.cucumber;

import domain.service.AccountValidationService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.math.BigDecimal;

public class AccountStepDefinitions {

    private final AccountValidationService accountValidationService;
    private final AccountTestContext testContext;
    private Exception thrownException;

    public AccountStepDefinitions(AccountValidationService accountValidationService,
                                   AccountTestContext testContext) {
        this.accountValidationService = accountValidationService;
        this.testContext = testContext;
    }

    @Given("Una cuenta con saldo inicial de {int} y tipo {string} asociada a un cliente existente")
    public void givenAnExistingAccount(int balance, String accountType) {
      throw new UnsupportedOperationException("TODO(reto): Given");
    }

    @When("Se crea la cuenta")
    public void whenTheAccountIsCreated() {
      throw new UnsupportedOperationException("TODO(reto): When");
    }

    @Then("La cuenta es válida y se registra correctamente")
    public void thenTheAccountShouldBeValid() {
      throw new UnsupportedOperationException("TODO(reto): Then");
    }

    @Then("La creación falla y se lanza una excepción de negocio")
    public void thenTheCreationFailsWithBusinessException() {
      throw new UnsupportedOperationException("TODO(reto): Then");
    }

    @Given("Una cuenta con saldo inicial de {int} y tipo {string}")
    public void givenAnAccountWithNegativeBalance(int balance, String accountType) {
      throw new UnsupportedOperationException("TODO(reto): Given");
    }

    @When("Se intenta crear la cuenta")
    public void whenAttemptingToCreateAccount() {
      throw new UnsupportedOperationException("TODO(reto): When");
    }
}