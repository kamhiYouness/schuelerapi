package de.kamhi.schuelerapi.schueler;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchuelerService {

    private final SchuelerRepo SCHUELERREPO;

    @Autowired
    public SchuelerService(SchuelerRepo SCHUELERREPO) {
        this.SCHUELERREPO = SCHUELERREPO;
    }

    public SchuelerModel schuelerSpeichern(SchuelerModel schuelerModel) {
        return SCHUELERREPO.save(schuelerModel);
    }

    public List<SchuelerModel> alleSchueler() {
        return SCHUELERREPO.findAll();
    }
  
    public void schuelerloeschen(int schuelerId) {
        SCHUELERREPO.deleteById(schuelerId);
    }
}
