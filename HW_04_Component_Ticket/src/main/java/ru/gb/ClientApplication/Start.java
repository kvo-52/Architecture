package ru.gb.ClientApplication;

import ru.gb.Core.Customer;
import ru.gb.Interfaces.ICustomer;
import ru.gb.Models.Ticket;

import java.util.Date;
import java.util.List;

/**
 * Основной класс клиентского приложения.
 */
public class Start extends EnterData {
    // Связь с основной логикой осуществляется через интерфейс ICustomer.
    private ICustomer customer;
    private int ticketRouteNumber;
    private Date ticketDate;

    /**
     * Метод запуска меню входа и регистрации
     */
    public void runLoginRegisterMenu() {
        boolean run = true;
        while (run) {
            printMessageLine("Application for buying bus tickets");
            printMessageLine("This is a test version. The data base is not available in full mode.");
            printMessageLine("To login\t\t\tenter 1\nTo register\t\t\tenter 2\nTo exit\t\t\t\tenter 0");
            System.out.print("Enter your choice > ");
            int choice = 0;
            try {
                choice = inputInt(0, 2);
            } catch (RuntimeException ex) {
                System.err.println(ex.getMessage());
                continue;
            }
            System.out.println("=====================================================================================");
            run = runLoginRegisterMenuChoiceLogic(choice);
        }
    }

    /**
     * Логика ветвления запуска программы
     *
     * @param choice
     * @return
     */
    private boolean runLoginRegisterMenuChoiceLogic(int choice) {
        switch (choice) {
            case 1:
                login();
                if (customer.getUser() == null) {
                    break;
                } else {
                    runBuyingMenu();
                    break;
                }
            case 2:
                register();
                if (customer == null) {
                    break;
                } else {
                    runBuyingMenu();
                    break;
                }
            default:
                return false;
        }
        return true;
    }

    /**
     * Меню входа зарегестрированного пользователя
     */
    private void login() {
        printMessageLine("This is a test version. The data base is not available in full mode.");
        printMessageLine("Login");
        System.out.print("User name: ");
        String userName = inputString();
        System.out.print("Password: ");
        int passwordHash = inputString().hashCode();
        System.out.println("=====================================================================================");
        System.out.print("Enter the system... ");
        customer = new Customer();
        try {
            customer.setUser(Authentication.authentication(customer.getUserProvider(), userName, passwordHash));
        } catch (RuntimeException ex) {
            System.out.println("FAIL");
            System.out.println(ex.getMessage());
            System.out.println("=====================================================================================");
            return;
        }
        printMessageLine("OK");
    }

    /**
     * Меню регистрации нового пользователя
     */
    private void register() {
        printMessageLine("This is a test version. The data base is not available in full mode.");
        printMessageLine("Register");
        System.out.print("Enter user name: ");
        String userName = inputString();
        System.out.print("Enter password: ");
        int passwordHash = inputString().hashCode();
        System.out.print("Repeat password: ");
        int passwordHash2 = inputString().hashCode();
        if (passwordHash != passwordHash2) {
            System.out.println("=====================================================================================");
            printMessageLine("Passwords do not match. Exit register.");
            return;
        }
        System.out.print("Enter card number: ");
        long cardNumber = inputLong(1L, 9999_9999_9999_9999L);
        System.out.println("=====================================================================================");
        System.out.print("Register the system... ");
        customer = new Customer();
        int id;
        try {
            id = customer.getUserProvider().createClient(userName, passwordHash, cardNumber);
            customer.setUser(Authentication.authentication(customer.getUserProvider(), userName, passwordHash));
        } catch (RuntimeException ex) {
            System.out.println("FAIL");
            System.out.println(ex.getMessage());
            System.out.println("=====================================================================================");
            return;
        }
        printMessageLine("OK. user " + customer.getUser().getUserName() + " with ID " + id + "added to base.");
    }
}


