package wad.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Room extends AbstractPersistable<Long> {
    
    @NotEmpty
    private String identifier;
    
    @ManyToMany(mappedBy = "rooms")
    private List<Exam> exams;
    
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    
    public List<Exam> getExams() {
        return exams;
    }
    
    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }
}
