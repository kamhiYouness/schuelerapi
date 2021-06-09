package de.kamhi.schuelerapi.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    private final ReportRepo REPORTREPO ;

    @Autowired
    public ReportService(ReportRepo REPORTREPO) {
        this.REPORTREPO = REPORTREPO;
    }

    public List<ReportModel> alleReport() {
        return REPORTREPO.findAll();
    }

    public ReportModel reportAnlegen(ReportModel report) {
        return REPORTREPO.save(report);
    }

    public List<ReportModel> alleSchuelerRepoert(int id) {
        return REPORTREPO.findReportBySchueler(id);
    }
    public ReportModel reportUpdate(ReportModel report) throws Exception {
        return REPORTREPO.save(report);
    }
}