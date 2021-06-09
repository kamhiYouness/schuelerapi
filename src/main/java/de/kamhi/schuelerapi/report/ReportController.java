package de.kamhi.schuelerapi.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/report")
public class ReportController {

    public final ReportService REPORTSERVICE;
@Autowired
public ReportController(ReportService REPORTSERVICE) {
    this.REPORTSERVICE = REPORTSERVICE;
}
@PostMapping(path = "/add")
public ResponseEntity<ReportModel> reportAnlegen(@RequestBody ReportModel report) {
    ReportModel r = REPORTSERVICE.reportAnlegen(report);
    return new ResponseEntity<>(r, HttpStatus.CREATED);
}
@GetMapping(path = "/all")
public ResponseEntity<List<ReportModel>> alleReport() {
    List<ReportModel> ls = REPORTSERVICE.alleReport();
    return new ResponseEntity<>(ls, HttpStatus.OK);
}
@PutMapping(path = "/update")
public ResponseEntity<ReportModel> reportUpdate(@RequestBody ReportModel report) throws Exception {
 ReportModel r = REPORTSERVICE.reportUpdate(report);
 return new ResponseEntity<>(r, HttpStatus.OK); 
}
}


  
