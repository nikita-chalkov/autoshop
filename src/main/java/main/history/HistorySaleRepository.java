package main.history;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.Set;

public interface HistorySaleRepository extends JpaRepository<HistorySale, Long> {

    @Query("SELECT h FROM HistorySale h WHERE h.date BETWEEN :start AND :end")
    Set<HistorySale> findAllByDatePeriod(Date start, Date end);
}
