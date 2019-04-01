package ee.iti0208.sidewalk.object.service;

import ee.iti0208.sidewalk.object.domain.Object;
import ee.iti0208.sidewalk.object.repository.ObjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ObjectService {

    @Resource
    private ObjectRepository objectRepository;

    public Object getObjectById(int objectId) {
        return objectRepository.getObjectById(objectId);
    }

    public List<Object> getAllObjects() {
        return objectRepository.getAllObjects();
    }

    public Integer addObject(Object object) {
        objectRepository.addLocation(object.getObjectLocation());
        return objectRepository.addObject(object);
    }
}
