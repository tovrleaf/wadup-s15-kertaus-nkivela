package wad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    
}
