package de.kamhi.schuelerapi.schueler;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path = "/schueler")
public class SchuelerController {

   private final SchuelerService SCHUELERSERVICE;

    @Autowired
    public SchuelerController(SchuelerService SCHUELERSERVICE) {
        this.SCHUELERSERVICE = SCHUELERSERVICE;
    }

    @PostMapping(path = "/save")
    public ResponseEntity<SchuelerModel> save(@RequestBody SchuelerModel schuelerModel) {
        SchuelerModel u = SCHUELERSERVICE.schuelerSpeichern(schuelerModel);
        return new ResponseEntity<>(u, HttpStatus.CREATED);
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<SchuelerModel>> alleSchueler() {
        List<SchuelerModel> schl = SCHUELERSERVICE.alleSchueler();

        return new ResponseEntity<>(schl, HttpStatus.OK);

    }
    @DeleteMapping(path = "/delete/{id}")  
    public ResponseEntity<SchuelerModel> schuelerLoeschen(@PathVariable("id") int schuelerId){
        SCHUELERSERVICE.schuelerloeschen(schuelerId);
        return new ResponseEntity<>(HttpStatus.OK);
    }                 
}

  

