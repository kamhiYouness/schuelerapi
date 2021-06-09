package de.kamhi.schuelerapi.report;

   
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import de.kamhi.schuelerapi.schueler.SchuelerModel;



@Entity
@Table(name = "report")
public class ReportModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private int reportId; 
    @Column(columnDefinition = "varchar(25)")
    private String titel; 
    private String text; 
    
    @ManyToOne
    @JoinColumn(name = "schueler_id", nullable = false)
    private SchuelerModel schueler; 

    public ReportModel() {
    }

    public ReportModel(String titel, String text, SchuelerModel schueler) {
        this.titel = titel;
        this.text = text;
        this.schueler = schueler;
    }

    public SchuelerModel getSchueler() {
        return schueler;
    }

    public void setSchueler(SchuelerModel schueler) {
        this.schueler = schueler;
    }

    public int getReportId() {
        return this.reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getTitel() {
        return this.titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
