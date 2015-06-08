package com.github.jlgrock.snp.domain.types;

import com.google.common.base.MoreObjects;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * The domain object that represents a single encounter in a patient visit.  Each encounter can consist
 * of multiple {@link com.github.jlgrock.snp.domain.types.Observation Observation} objects.
 */
public class Encounter extends AbstractMongoDomainObject {

//    @NotNull
//    private Long patientId;
    
    private String subject;
    
    private String clazz;

//    private String reasonForVisit;
    
    private String status;
    
    private String participant;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", getId())
//                .add("patientId", patientId)
                .add("class", clazz)
                .add("status", status)
//                .add("reasonForVisit", reasonForVisit)
                .add("observations", observations)
                .toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), /*patientId,*/ clazz, status, /*reasonForVisit,*/ observations);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Encounter other = (Encounter) obj;
        return Objects.equals(this.getId(), other.getId())
//                && Objects.equals(this.patientId, other.patientId)
                && Objects.equals(this.clazz, other.clazz)
                && Objects.equals(this.status, other.status)
//                && Objects.equals(this.reasonForVisit, other.reasonForVisit)
                && Objects.equals(this.observations, other.observations);
    }

//    public String getReasonForVisit() {
//        return reasonForVisit;
//    }
//
//    public void setReasonForVisit(final String pReasonForVisit) {
//        reasonForVisit = pReasonForVisit;
//    }

    public List<Observation> getObservations() {
        return observations;
    }

    public void setObservations(final List<Observation> pObservations) {
        observations = pObservations;
    }

    private List<Observation> observations;

//    public Long getPatientId() {
//        return patientId;
//    }
//
//	public void setPatientId(final Long pPatientId) {
//        this.patientId = pPatientId;
//    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getParticipant() {
		return participant;
	}

	public void setParticipant(String participant) {
		this.participant = participant;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}

