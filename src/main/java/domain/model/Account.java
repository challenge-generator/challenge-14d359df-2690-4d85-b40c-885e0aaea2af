package domain.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

public record Account(
    @NotBlank(message = "Account number cannot be blank")
    String accountNumber,

    @NotNull(message = "Balance cannot be null")
    @PositiveOrZero(message = "Balance cannot be negative")
    BigDecimal balance,

    @NotBlank(message = "Account type cannot be blank")
    String accountType,

    @NotBlank(message = "Owner ID cannot be blank")
    String ownerId,

    @NotBlank(message = "Status cannot be blank")
    String status) {

    public Account {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number cannot be null or blank");
        }
        if (balance == null || balance.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Balance cannot be null or negative");
        }
        if (accountType == null || accountType.isBlank()) {
            throw new IllegalArgumentException("Account type cannot be null or blank");
        }
        if (ownerId == null || ownerId.isBlank()) {
            throw new IllegalArgumentException("Owner ID cannot be null or blank");
        }
        if (status == null || status.isBlank()) {
            throw new IllegalArgumentException("Status cannot be null or blank");
        }
    }

    public Account withBalance(BigDecimal newBalance) {
        return new Account(accountNumber, newBalance, accountType, ownerId, status);
    }

    public Account withStatus(String newStatus) {
        return new Account(accountNumber, balance, accountType, ownerId, newStatus);
    }
}