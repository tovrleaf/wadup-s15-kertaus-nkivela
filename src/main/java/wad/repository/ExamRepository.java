package wad.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.Exam;
import wad.domain.Exam.Type;

public interface ExamRepository extends JpaRepository<Exam, Long> {
    List<Exam> findByType(Type type);
}
