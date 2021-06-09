package de.kamhi.schuelerapi.schueler;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchuelerRepo extends JpaRepository <SchuelerModel, Integer>{
    
}
