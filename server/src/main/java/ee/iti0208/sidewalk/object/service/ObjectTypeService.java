package ee.iti0208.sidewalk.object.service;

import ee.iti0208.sidewalk.object.domain.ObjectType;
import ee.iti0208.sidewalk.object.repository.ObjectTypeRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ObjectTypeService {
    @Resource
    private ObjectTypeRepository repo;

    public List<ObjectType> getAllObjectTypes(){
        return repo.getAllObjectTypes();
    }
}
