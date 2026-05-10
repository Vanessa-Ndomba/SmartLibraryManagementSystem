package repositories;

import domain.Reservation;
import java.util.List;

public interface ReservationRepository extends Repository<Reservation, String> {
    List<Reservation> findByMemberId(String memberId);
    List<Reservation> findByBookId(String bookId);
    List<Reservation> findByStatus(String status);
}