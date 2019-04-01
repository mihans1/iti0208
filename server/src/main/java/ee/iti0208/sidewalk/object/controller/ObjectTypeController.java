package ee.iti0208.sidewalk.object.controller;

import ee.iti0208.sidewalk.object.domain.ObjectType;
import ee.iti0208.sidewalk.object.service.ObjectTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/api")
public class ObjectTypeController {
    @Resource
    private ObjectTypeService service;
    @GetMapping("objectTypes")
    public ResponseEntity<List<ObjectType>> getAllObjectTypes() {
        return new ResponseEntity<>(service.getAllObjectTypes(), HttpStatus.OK);
    }
}
