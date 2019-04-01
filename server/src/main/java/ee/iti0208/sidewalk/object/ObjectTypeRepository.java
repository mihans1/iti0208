package ee.iti0208.sidewalk.object;

import ee.iti0208.sidewalk.jooq.tables.Object;
import ee.iti0208.sidewalk.jooq.tables.Objecttype;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static ee.iti0208.sidewalk.jooq.tables.Objecttype.OBJECTTYPE;

@Service
public class ObjectTypeRepository {
    @Resource
    private DSLContext dsl;
    public RecordMapper<Record, ObjectType> objectTypeRecordMapper = record -> {
        return record.into(OBJECTTYPE).into(ObjectType.class);
    };

    public List<ObjectType> getAllObjectTypes() {
        return dsl.select().from(OBJECTTYPE).fetch(objectTypeRecordMapper);
    }
}
