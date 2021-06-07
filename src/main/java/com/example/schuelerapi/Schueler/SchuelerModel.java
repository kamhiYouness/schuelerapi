package com.example.schuelerapi.Schueler;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schueler")

public class SchuelerModel implements Serializable {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )



    
}
@Column(unique = true, columnDefinition = "varchar(50)")
