package com.github.jlgrock.snp.domain.data;

/**
 * JSON key tags related to Patient serialization.
 */
public final class PatientTags {

    /**
     * The first name of the patient.
     */
    public static final String FIRST_NAME_TAG = "first_name";

    /**
     * The middle name of the patient.
     */
    public static final String MIDDLE_NAME_TAG = "middle_name";

    /**
     * The last name of the patient.
     */
    public static final String LAST_NAME_TAG = "last_name";

    /**
     * The date of birth of the patient.
     */
    public static final String DATE_OF_BIRTH_TAG = "dob";

    /**
     * The integer value representation of the {@link com.github.jlgrock.snp.domain.types.Gender Gender}
     * class for a patient's gender.
     */
    public static final String GENDER_TAG = "gender";

    /**
     * The boolean value representing if a patient is deceased.  This can be a null value if unknown.
     */
    public static final String DECEASED = "deceased";

    /**
     * The date of death for a patient
     */
    public static final String DATE_DECEASED = "dod";

    /**
     * The date of death for a patient
     */
    public static final String FHIR_ID_TAG = "fhirId";

    /**
     * Private constructor for utility class.
     */
    private PatientTags(){
    }
  
}

