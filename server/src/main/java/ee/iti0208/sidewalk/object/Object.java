package ee.iti0208.sidewalk.object;

import lombok.Data;

@Data
public class Object {
    private int id;
    private String title;
    private ObjectType objectType;
    private Location objectLocation;
    private String description;
    public Object(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    public Location getObjectLocation() {
        return objectLocation;
    }

    public void setObjectLocation(Location objectLocation) {
        this.objectLocation = objectLocation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
