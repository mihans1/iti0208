package ee.iti0208.sidewalk.object;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Location {
    private int id;
    private BigDecimal lat;
    private BigDecimal lng;
}
