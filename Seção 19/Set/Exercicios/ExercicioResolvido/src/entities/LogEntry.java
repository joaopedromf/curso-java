package entities;

import java.time.Instant;

public class LogEntry {
    
    private String userName;
    private Instant moment;

    public LogEntry(String userName, Instant moment) {
        this.userName = userName;
        this.moment = moment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Instant getmoment() {
        return moment;
    }

    public void setmoment(Instant moment) {
        this.moment = moment;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LogEntry other = (LogEntry) obj;
        if (userName == null) {
            if (other.userName != null)
                return false;
        } else if (!userName.equals(other.userName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "LogEntry [userName=" + userName + ", moment=" + moment + "]";
    }
}