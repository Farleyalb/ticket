package org.example;

import java.util.*;
public class TicketService {
    private int[] idArray = new int[100];
    private int idCounter = 0;
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private HashMap<Integer, Ticket> ticketMap = new HashMap<>();

    public void addTicket(String description, String priority) {
        int id = idCounter + 1;
        idArray[idCounter] = id;
        idCounter++;
        Ticket ticket = new Ticket(id, description, priority, "NEW");
        tickets.add(ticket);
        ticketMap.put(id, ticket);
        System.out.println("Заявка #" + id + " создана");
    }

    public void showAll() {
        if (tickets.isEmpty()) {
            System.out.println("Заявок нет");
            return;
        }
        for (Ticket t : tickets) {
            System.out.println(t);
        }
    }

    public void showStats() {
        int newCount = 0, inProgress = 0, closed = 0;
        for (Ticket t : tickets) {
            switch (t.getStatus()) {
                case "NEW":
                    newCount++;
                    break;
                case "IN_PROGRESS":
                    inProgress++;
                    break;
                case "CLOSED":
                    closed++;
                    break;
            }
        }
        System.out.println("Новых: " + newCount + ", В работе: " + inProgress + ", Закрыто: " + closed);
    }
}
