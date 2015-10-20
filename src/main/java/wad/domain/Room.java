package wad.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Room extends AbstractPersistable<Long> {
    
    @NotEmpty
    private String name;
    
    @OneToMany
    private List<Exam> exams;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<Exam> getExams() {
        return exams;
    }
    
    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }
}
