package edu.stevens.cs548.clinic.data;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


// TODO
@Entity
@Table

public class PhysiotherapyTreatment extends Treatment {

	private static final long serialVersionUID = 5602950140629148756L;
	
	// TODO (including order by date)
	@ElementCollection



	protected List<LocalDate> treatmentDates;

	public void addTreatmentDate(LocalDate date) {
		treatmentDates.add(date);
	}

}
