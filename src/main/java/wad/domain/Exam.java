package wad.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Exam extends AbstractPersistable<Long> {
    
    @NotNull
    private int courseCode;
    
    @NotEmpty
    private String name;
    
    // can be choosen later
    @ManyToOne
    private Teacher examiner;
    
    // can be choosen later
    @ManyToMany
    private List<Room> rooms;
    
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    
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

    public void addRoom(Room room) {
        if (this.rooms == null) {
            this.rooms = new ArrayList<Room>();
        }
 
        this.rooms.add(room);
    }
 
    public List<Room> getRooms() {
        return rooms;
    }
 
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
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
}
