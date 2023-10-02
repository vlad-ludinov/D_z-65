package ModelElement;

import java.util.List;

public class Scene {
    
    public Integer id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;
    
    
    
    public Scene(Integer id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        
        this.id = id;
        
        if (models.size() > 0) {
            this.models = models;
        } else {
            throw new Exception("Должена быть минимум одна модель");
        }
        
        this.flashes = flashes;
        
        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Должена быть минимум одна камера");
        }
    }

    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method1(T model, E flash) {
        return model;
    }    
}
