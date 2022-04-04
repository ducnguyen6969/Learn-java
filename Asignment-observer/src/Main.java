import java.util.Scanner;

import actionObserver.ActionObserver;
import frontEnd.DesktopFrontend;
import frontEnd.WebFrontend;
import pattern.ModelFacade;
import pattern.ModelIObserver;

public class Main {
	private static ModelIObserver modelIObserver;

    public static void main(String[] args) {
        ModelFacade modelFacade = new ModelFacade();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Facade Manager");
            System.out.println("==========================");
            System.out.println("1. DesktopFrontend");
            System.out.println("2. WebFrontend");
            System.out.println("0. Exit");
            System.out.println("==========================");
            System.out.println("Please enter your choice (0-2)");
            int choiceObserver = scanner.nextInt();
            switch (choiceObserver){
                case 1:
                    while (true) {
                        System.out.println("==========================");
                        System.out.println("1. Add Staff");
                        System.out.println("2. Add Customer");
                        System.out.println("3. Add Vehicle");
                        System.out.println("0. Back");
                        System.out.println("==========================");
                        System.out.println("Please enter your choice (0-3)");

                        int choice = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice){
                            case 1:
                                ModelFacade.action = ActionObserver.AddStaff;
                                modelIObserver = new DesktopFrontend("Hoang");
                                modelFacade.addSubscriber(modelIObserver);
                                modelIObserver = new DesktopFrontend("Minh");
                                modelFacade.addSubscriber(modelIObserver);
                                modelFacade.mainBusinessLogic();
                                break;
                            case 2:
                                ModelFacade.action = ActionObserver.AddCustomer;
                                modelIObserver = new DesktopFrontend("Duc");
                                modelFacade.addSubscriber(modelIObserver);
                                modelIObserver = new DesktopFrontend("Hoang Anh");
                                modelFacade.addSubscriber(modelIObserver);
                                modelFacade.mainBusinessLogic();
                                break;
                            case 3:
                                ModelFacade.action = ActionObserver.AddVehicle;
                                modelIObserver = new DesktopFrontend("Xe cua thang quyet");
                                modelFacade.addSubscriber(modelIObserver);
                                modelIObserver = new DesktopFrontend("Xe dap");
                                modelFacade.addSubscriber(modelIObserver);
                                modelFacade.mainBusinessLogic();
                                break;
                        }
                        if (choice == 0){
                            break;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("==========================");
                        System.out.println("1. Add Staff");
                        System.out.println("2. Add Customer");
                        System.out.println("3. Add Vehicle");
                        System.out.println("0. Back");
                        System.out.println("==========================");
                        System.out.println("Please enter your choice (0-3)");

                        int choice = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice){
                            case 1:
                                ModelFacade.action = ActionObserver.AddStaff;
                                modelIObserver = new WebFrontend("ActionObserver");
                                modelFacade.addSubscriber(modelIObserver);
                                modelIObserver = new WebFrontend("ActionObserver1");
                                modelFacade.addSubscriber(modelIObserver);
                                modelFacade.mainBusinessLogic();
                                break;
                            case 2:
                                ModelFacade.action = ActionObserver.AddCustomer;
                                modelIObserver = new WebFrontend("ActionObserver2");
                                modelFacade.addSubscriber(modelIObserver);
                                modelIObserver = new WebFrontend("ActionObserver4");
                                modelFacade.addSubscriber(modelIObserver);
                                modelFacade.mainBusinessLogic();
                                break;
                            case 3:
                                ModelFacade.action = ActionObserver.AddVehicle;
                                modelIObserver = new WebFrontend("ActionObserver6");
                                modelFacade.addSubscriber(modelIObserver);
                                modelIObserver = new WebFrontend("ActionObserver7");
                                modelFacade.addSubscriber(modelIObserver);
                                modelFacade.mainBusinessLogic();
                                break;
                        }
                        if (choice == 0){
                            break;
                        }
                    }
                    break;
            }
            if (choiceObserver == 0){
                System.out.println("Program Refactor Finnish\n");
                break;
            }
        }
    }
}
