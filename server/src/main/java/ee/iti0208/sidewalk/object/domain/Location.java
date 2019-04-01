package ee.iti0208.sidewalk.object.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Location {
    private int id;
    private BigDecimal lat;
    private BigDecimal lng;
    public Location(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }
}
