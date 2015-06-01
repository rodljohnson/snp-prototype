package com.github.jlgrock.snp.domain.classifier;

import com.github.jlgrock.snp.apis.classifier.LogicGraphClassifier;
import gov.vha.isaac.logic.LogicGraph;
import gov.vha.isaac.lookup.constants.Constants;
import gov.vha.isaac.metadata.coordinates.ViewCoordinates;
import gov.vha.isaac.ochre.api.LookupService;
import org.ihtsdo.otf.tcc.api.store.TerminologySnapshotDI;
import org.ihtsdo.otf.tcc.api.store.TerminologyStoreDI;
import org.ihtsdo.otf.tcc.api.uuid.UuidT3Generator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.UUID;

/**
 *
 */
//@Service
//@Singleton
public class LogicGraphClassifierImpl implements LogicGraphClassifier {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogicGraphClassifierImpl.class);

	public LogicGraphClassifierImpl() {
		LOGGER.info("Instantiating Classifier Service...");

		LOGGER.info("Loading Classifier Database...");

		LOGGER.info("Instantiating Classifier Service...");

	}
	/**
	 * Get the native identifier
	 * @param sctid SNOMED clinical terms identifier
	 * @return native identifier
	 */
	public int getNidFromSNOMED(final String sctid) {
    	int nid = 0;
    	try {
    		TerminologyStoreDI termStore = LookupService.getService(TerminologyStoreDI.class);
    		TerminologySnapshotDI termSnapshot = termStore.getSnapshot(ViewCoordinates.getDevelopmentInferredLatest());
    		UUID uuid = UuidT3Generator.fromSNOMED(Long.parseLong(sctid));

    		//Get NID from UUID
    		nid = termSnapshot.getNidForUuids(uuid);
    	} catch (IOException ex) {
    		LOGGER.error("Fatal error occured", ex);
    	}
    	return nid;
    }

	/**
	 * Start the expression service
	 */
    public static void startExpressionService() {
    	if(LookupService.getRunLevelController().getCurrentRunLevel() != 2) {
			System.setProperty(Constants.CHRONICLE_COLLECTIONS_ROOT_LOCATION_PROPERTY, "target/data/object-chronicles");
    		System.setProperty(Constants.SEARCH_ROOT_LOCATION_PROPERTY, "target/data/search");

    		LookupService.getRunLevelController().proceedTo(2);
    		LOGGER.info("System up...");
		} else {
			LOGGER.info("System already up and running!");
		}
    }

    /**
     * Stop the expression service
     */
    public static void stopExpressionService() {
    	LookupService.getRunLevelController().proceedTo(-1);
	    LOGGER.info("System down...");
    }

	@Override
	public Long classify(LogicGraph pce) {
		return null;
	}
}
