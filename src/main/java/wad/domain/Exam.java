package wad.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Exam extends AbstractPersistable<Long> {
    
    @NotNull
    private int courseCode;
    
    @NotEmpty
    private String name;
    
    @ManyToOne
    private Teacher examiner;
    
    @ManyToOne
    private Room room;
    
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    
    @Transient
    private List<String> roomList;
    
    @NotNull
    private Type type;

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getExaminer() {
        return examiner;
    }

    public void setExaminer(Teacher examiner) {
        this.examiner = examiner;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    
    public Type getType() {
        return this.type;
    }
    
    public void setType(Type type) {
        this.type = type;
    }
    
    public enum Type {
        COURSE, SEPARATE;
    }
    
    public void addRoomName(String name) {
        if (this.roomList == null) {
            this.roomList = new ArrayList<String>();
        }
 
        this.roomList.add(name);
    }
 
    public List<String> getRoomList() {
        return roomList;
    }
 
    public void setRoomList(List<String> roomList) {
        this.roomList = roomList;
    }
}
