package edu.stevens.cs548.clinic.service.dto;

public class TreatmentDtoFactory {
	
	public DrugTreatmentDto createDrugTreatmentDto() {
		return new DrugTreatmentDto();
	}
	
	/*
	 * TODO: Repeat for other treatments.
	 */
	public SurgeryTreatmentDto createSurgeryTreatmentDto() {
		return new SurgeryTreatmentDto();
	}
	public RadiologyTreatmentDto createRadiologyTreatmentDto() {
		return new RadiologyTreatmentDto();
	}
	public PhysiotherapyTreatmentDto createPhysioTreatmentDto() {
		return new PhysiotherapyTreatmentDto();
	}


}
