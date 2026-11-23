package infrastructure.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
public class AccountEntity {
    @Id
    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "balance", precision = 19, scale = 2)
    private BigDecimal balance;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "owner_id")
    private String ownerId;

    @Column(name = "status")
    private String status;

    public AccountEntity() {
    }

    public AccountEntity(String accountNumber, BigDecimal balance, String accountType, String ownerId, String status) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.ownerId = ownerId;
        this.status = status;
    }

    public static infrastructure.repository.AccountEntity fromDomain(domain.model.Account account) {
        return new infrastructure.repository.AccountEntity(
            account.accountNumber(),
            account.balance(),
            account.accountType(),
            account.ownerId(),
            account.status()
        );
    }

    public domain.model.Account toDomain() {
        return new domain.model.Account(
            accountNumber,
            balance,
            accountType,
            ownerId,
            status
        );
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}