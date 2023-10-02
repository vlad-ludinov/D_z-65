package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElement.Camera;
import ModelElement.Flash;
import ModelElement.PoligonalModel;
import ModelElement.Scene;
import ModelElement.Texture;

public class ModelStore {

    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changedObservers;
    
    
    
    public ModelStore(IModelChangedObserver[] changedObservers) throws Exception {
        this.changedObservers = changedObservers;
        
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();


        models.add(new PoligonalModel(new ArrayList<Texture>()));
        scenes.add(new Scene(0, models, flashes, cameras));
        flashes.add(new Flash());
        cameras.add(new Camera());
    }

    public Scene getScene(Integer id) {
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == id) {
                return scenes.get(i);
            }
        }
        return null;
    }

    public void notifyChange(IModelChanger sender) {

    }
}