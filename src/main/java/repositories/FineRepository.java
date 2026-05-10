package repositories;

import domain.Fine;
import java.util.List;

public interface FineRepository extends Repository<Fine, String> {
    List<Fine> findByStatus(String status);
    List<Fine> findByLoanId(String loanId);
}