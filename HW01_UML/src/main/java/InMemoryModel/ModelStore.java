package InMemoryModel;

import ModelElement.PoligonalModel;
import ModelElement.Scene;
import ModelElement.Flash;
import ModelElement.Camera;

import java.util.ArrayList;
import java.util.List;

public class ModelStore {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangeObserver> ChangeObservers;

    /**
     * конструктор
     *
     * @throws Exception
     */
    public ModelStore(List<IModelChangeObserver> changeObservers) throws Exception {
        this.ChangeObservers = changeObservers;

        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        Models.add(new PoligonalModel(null));
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0,Models,Flashes, Cameras));
    }


    /**
     * Возвращает scena по ID
     *
     * @param ID
     * @return
     */
    public Scene GetScena(int ID) {
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).ID == ID) {
                return Scenes.get(i);
            }

        }
        return null;
    }

    /**
     * Регистрация изменений
     * @param sender
     */

    public void NotifyChange(IModelChanger sender) {

    }
}
