package ee.iti0208.sidewalk.object.repository;

import ee.iti0208.sidewalk.jooq.tables.records.LocationRecord;
import ee.iti0208.sidewalk.jooq.tables.records.ObjectRecord;
import ee.iti0208.sidewalk.object.domain.Location;
import ee.iti0208.sidewalk.object.domain.Object;
import ee.iti0208.sidewalk.object.domain.ObjectType;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;
import java.util.Optional;

import static ee.iti0208.sidewalk.jooq.tables.Location.LOCATION;
import static ee.iti0208.sidewalk.jooq.tables.Object.OBJECT;
import static ee.iti0208.sidewalk.jooq.tables.Objecttype.OBJECTTYPE;

@Service
public class ObjectRepository {

    @Resource
    private DSLContext dsl;

    public RecordMapper<Record, Object> objectRecordMapper = record -> {
        Object object = record.into(OBJECT).into(Object.class);
        object.setObjectType(record.into(OBJECTTYPE).into(ObjectType.class));
        object.setObjectLocation(record.into(LOCATION).into(Location.class));
        return object;
    };
    public RecordMapper<Record, Location> locationRecordMapper = record -> {
        Location location=record.into(LOCATION).into(Location.class);
        return location;
    };

    public Object getObjectById(int objectId) {
        return dsl.select()
                .from(OBJECT)
                .leftJoin(OBJECTTYPE)
                .onKey()
                .leftJoin(LOCATION)
                .onKey()
                .where(OBJECT.ID.eq(objectId))
                .fetchAny(objectRecordMapper);
    }

    public List<Object> getAllObjects() {
        return dsl.select()
                .from(OBJECT)
                .leftJoin(OBJECTTYPE)
                .onKey()
                .leftJoin(LOCATION)
                .onKey()
                .fetch(objectRecordMapper);
    }

    public int addObject(Object object) {
        ObjectRecord record = dsl.newRecord(OBJECT, object)
                .with(OBJECT.LOCATION, Optional.of(object)
                        .map(Object::getObjectLocation)
                        .map(Location::getId)
                        .orElse(null))
                .with(OBJECT.TYPE, Optional.of(object)
                        .map(Object::getObjectType)
                        .map(ObjectType::getId)
                        .orElse(1));
        record.store();
        return record.getId();
    }

    public Integer addLocation(Location location) {
        LocationRecord record = dsl.newRecord(LOCATION, location);
        record.store();
        return record.getId();
    }

    public List<Location> getAllLocations() {
        return dsl.select().from(LOCATION).fetch(locationRecordMapper);
    }
}
