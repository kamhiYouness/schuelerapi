package de.kamhi.schuelerapi.schueler;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import de.kamhi.schuelerapi.report.ReportModel;



@Entity
@Table(name = "schueler")
public class SchuelerModel implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int schuelerId;
    @Column(unique = true, columnDefinition = "varchar(50)")
    private String email;
    @Column(name = "password", columnDefinition = "varchar(50)")
    private String pw;

    @OneToMany(fetch = FetchType.LAZY)
    private List<ReportModel> report;


    public SchuelerModel() {
    }
    public SchuelerModel(String email, String pw) {
        this.email = email;
        setPw(pw);
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPw(String pw) {
        Integer pwhash = pw.hashCode();
        String stingHash = pwhash.toString();
        this.pw = stingHash;
    }
    public void setSchuelerId(int schuelerId) {
        this.schuelerId = schuelerId;
    }
    public String getEmail() {
        return email;
    }
    public String holePw() {
        return pw;
    }
    public int getSchuelerId() {
        return schuelerId;
    }


}

