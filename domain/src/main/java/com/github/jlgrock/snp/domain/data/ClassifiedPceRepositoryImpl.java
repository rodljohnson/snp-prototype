package com.github.jlgrock.snp.domain.data;

import com.github.jlgrock.snp.apis.connection.MongoDbFactory;
import com.github.jlgrock.snp.domain.converters.ClassifiedPceReadConverter;
import com.github.jlgrock.snp.domain.converters.ClassifiedPceWriteConverter;
import com.github.jlgrock.snp.domain.types.ClassifiedPce;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.jvnet.hk2.annotations.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

/**
 * This class executes queries against the ClassifiedPce 
 * Collection within MongoDB.
 */
@Service
public class ClassifiedPceRepositoryImpl extends AbstractRepositoryImpl<ClassifiedPce, ObjectId>
		implements ClassifiedPceRepository {

	private final ClassifiedPceReadConverter classifiedPceReadConverter;

	private final ClassifiedPceWriteConverter classifiedPceWriteConverter;

	private static final Logger LOGGER = LoggerFactory.getLogger(ClassifiedPceRepositoryImpl.class);
	/**
	 * @param mongoDbFactoryIn MongoDbFactory
	 * @param classifiedPceReadConverterIn ClassifiedPceReadConverter
	 * @param classifiedPceWriteConverterIn ClassifiedPceWriteConverter
	 */
	@Inject
    public ClassifiedPceRepositoryImpl(final MongoDbFactory mongoDbFactoryIn,
									   final ClassifiedPceReadConverter classifiedPceReadConverterIn,
									   final ClassifiedPceWriteConverter classifiedPceWriteConverterIn) {
        super(mongoDbFactoryIn);
		classifiedPceReadConverter = classifiedPceReadConverterIn;
		classifiedPceWriteConverter = classifiedPceWriteConverterIn;
    }

	@Override
	protected ClassifiedPce convertToDomainObject(final Document dbObjectin) {
        LOGGER.trace("convertToDomainObject(dbObjectin={})", dbObjectin);
		return classifiedPceReadConverter.convert(dbObjectin);
	}

	@Override
	protected Document convertToDBObject(final ClassifiedPce s) {
		LOGGER.trace("convertToDBObject(s={})", s);
		if (s == null) {
			return null;
		}
		return classifiedPceWriteConverter.convert(s);
	}

    @Override
    protected String getCollectionName() {
		LOGGER.trace("getCollectionName()");
        return "pces";
    }
}
