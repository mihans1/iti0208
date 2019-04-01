package ee.iti0208.sidewalk.object.domain;

import lombok.Data;

@Data
public class ObjectType {
    private int id;
    private String type;
    public ObjectType(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
