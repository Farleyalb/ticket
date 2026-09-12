package org.example;

public class Ticket {
    private int id;
    private String description;
    private String priority;
    private String status;
    public Ticket (int id, String description, String priority, String status){
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }
    public int getId(){ return id; }
    public String getDescription()
    {return description;}
    public String getPriority()
    {return priority;}
    public String getStatus()
    {return status;}
    public void setStatus(String status)
    {this.status = status;}

@Override
    public String toString(){
        return "#" + id + "|" + description + "|" + priority + "|" + status;

    }
}
