package entities;

import entities.enums.SpidStatus;

import java.util.Date;

public class Spid extends BaseClass {

    private SpidStatus status;
    private String description;
    private User user;

    public Spid() {
    }

    public Spid(Long id, String description, User user) {
        super(id, new Date(), user.getUsername());
        this.description = description;
        this.user = user;
        setStatus(SpidStatus.PENDING);
    }


    public SpidStatus getStatus() {
        return status;
    }

    public void setStatus(SpidStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Spid{" +
                "id=" +getId()+'\''+
                "createdAt= "+getCreatedAt()+'\''+
                "createdBy="+ getCreatedBy()+'\''+
                "status=" + status +
                ", description='" + description + '\'' +
                ", user=" + user +
                '}';
    }
}