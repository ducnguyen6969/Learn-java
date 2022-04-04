package frontEnd;

import pattern.ModelIObserver;

public class DesktopFrontend implements ModelIObserver{
	private String name;

    public DesktopFrontend(String name) {
        this.name = name;
    }

    @Override
    public void managerVehicle(String message) {
        System.out.println("DesktopFrontend add Vehicle: " + this.name + message);
    }

    @Override
    public void managerCustomer(String message) {
        System.out.println("DesktopFrontend add Customer: " + this.name + message);
    }

    @Override
    public void managerStaff(String message) {
        System.out.println("DesktopFrontend add Staff: " + this.name + message);
    }
}
