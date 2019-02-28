package ee.iti0208.sidewalk.object;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/api")
public class ObjectController {

    @Resource
    private ObjectService objectService;

    @PostMapping("/object")
    public ResponseEntity<Integer> addObject(@RequestBody Object object) {
        return new ResponseEntity<>(objectService.addObject(object), HttpStatus.OK);
    }

    @GetMapping("/object/all")
    public ResponseEntity<List<Object>> getAllObjects(){
        return new ResponseEntity<>(objectService.getAllObjects(), HttpStatus.OK);
    }

    @GetMapping("/object/{objectId}")
    public ResponseEntity<Object> getObjectById(@NotNull @Min(1) @PathVariable int objectId) {
        Object object = objectService.getObjectById(objectId);
        if (object != null) {
            return new ResponseEntity<>(object, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
