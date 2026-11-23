package infrastructure.repository;

import domain.model.Account;
import domain.port.AccountRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AccountJpaRepository extends JpaRepository<AccountEntity, String>, AccountRepository {

    @Override
    default Account save(Account account) {
        AccountEntity entity = AccountEntity.fromDomain(account);
        AccountEntity savedEntity = save(entity);
        return savedEntity.toDomain();
    }

    @Override
    default Optional<Account> findByAccountNumber(String accountNumber) {
        return findById(accountNumber).map(AccountEntity::toDomain);
    }
}