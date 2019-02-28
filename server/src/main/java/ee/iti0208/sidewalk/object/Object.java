package ee.iti0208.sidewalk.object;

import lombok.Data;

@Data
public class Object {
    private int id;
    private String title;
    private ObjectType objectType;
    private Location objectLocation;
    private String description;
}
