package org.example;
import java.util.Scanner;
public class Main { public static void main(String[] args) { TicketService service = new TicketService(); Scanner in = new Scanner(System.in);
    while (true) {
        System.out.println("\n1. Добавить заявку");
        System.out.println("2. Показать все заявки");
        System.out.println("3. Показать статистику");
        System.out.println("0. Выход");
        System.out.print("Выберите: ");

        int choice = in.nextInt();
        in.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Описание: ");
                String desc = in.nextLine();
                System.out.print("Приоритет (HIGH/MEDIUM/LOW): ");
                String prio = in.nextLine().toUpperCase();
                service.addTicket(desc, prio);
                break;
            case 2:
                service.showAll();
                break;
            case 3:
                service.showStats();
                break;
            case 0:
                System.out.println("До свидания!");
                return;
            default:
                System.out.println("Неверный ввод");
        }
    }
}
}