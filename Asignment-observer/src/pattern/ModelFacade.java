package pattern;

import java.util.ArrayList;

import actionObserver.ActionObserver;

public class ModelFacade {
	public static ActionObserver action;

    private ArrayList<ModelIObserver> listObserver;
    private int mainState;
    
    public void addSubscriber(ModelIObserver modelIObserver) {
        if (listObserver ==null){
            listObserver = new ArrayList<>();
        }
        if (action == ActionObserver.AddStaff){
            listObserver.add(modelIObserver);
        }

        if (action == ActionObserver.AddCustomer){
            listObserver.add(modelIObserver);
        }

        if (action == ActionObserver.AddVehicle){
            listObserver.add(modelIObserver);
        }
    }

   
    public void removeSubscriber(ModelIObserver modelIObserver) {

    }

    public void mainBusinessLogic() {
        mainState ++;
        sendNotify(action);
    }

    
    public void sendNotify(ActionObserver action) {
        System.out.println("Check: "+ action);
        switch (action){
            case AddStaff:
                for (ModelIObserver observer: listObserver) {
                    observer.managerStaff(" ,Add staff OK, thực thi lần thứ "+ this.mainState );
                }
                listObserver = null;
                break;
            case AddCustomer:
                for (ModelIObserver observer: listObserver) {
                    observer.managerCustomer(" ,Add customer OK, thực thi lần thứ "+ this.mainState);
                }
                listObserver = null;
                break;
            case AddVehicle:
                for (ModelIObserver observer: listObserver) {
                    observer.managerVehicle(" ,Add vehicle OK, thực thi lần thứ "+ this.mainState);
                }
                listObserver = null;
                break;
        }
    }
}
