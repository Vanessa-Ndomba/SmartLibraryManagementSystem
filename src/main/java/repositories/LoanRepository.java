package repositories;

import domain.Loan;
import java.util.List;

public interface LoanRepository extends Repository<Loan, String> {
    List<Loan> findByMemberId(String memberId);
    List<Loan> findByBookId(String bookId);
    List<Loan> findOverdue();
    List<Loan> findByStatus(String status);
}