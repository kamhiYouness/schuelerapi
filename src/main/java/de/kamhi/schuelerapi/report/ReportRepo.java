package de.kamhi.schuelerapi.report;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository

public interface ReportRepo extends JpaRepository<ReportModel, Integer> {

    @Modifying
    @Query("SELECT r FROM ReportModel r WHERE schueler_id = ?1")
    List<ReportModel> findReportBySchueler(int schueler_id);

}
