package wad.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Room extends AbstractPersistable<Long> {
    
    @NotEmpty
    private String idıentifier;
    
    @ManyToMany(mappedBy = "rooms")
    private List<Exam> exams;
    
    public String getIdıentifier() {
        return idıentifier;
    }

    public void setIdıentifier(String idıentifier) {
        this.idıentifier = idıentifier;
    }
    
    public List<Exam> getExams() {
        return exams;
    }
    
    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }
}
