package dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UserDTO {
    String name,email,balance,sender,receiver,date,time;
    int amount=0;
    
    public void setName(String name)
    {
        this.name=name;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public  void setBalance(String balance)
    {
        this.balance=balance;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getBalance()
    {
        return balance;
    }
    public void setSender(String sender)
    {
        this.sender=sender;
    }
    public void setReceiver(String receiver)
    {
        this.receiver=receiver;
    }
    public void setAmount(int amount)
    {
        this.amount=amount;
    }
    public String getSender()
    {
        return sender;
    }
    public String getReceiver()
    {
        return receiver;
    }
    public int getAmount()
    {
        return amount;
    }
    public String getCurrentDate()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
        LocalDate localDate = LocalDate.now();
        date=dtf.format(localDate); 
        return date;
    }
    public String getCurrentTime()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();
        time=dtf.format(localTime);
        return time;
    }
}
