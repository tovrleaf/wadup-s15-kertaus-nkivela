package wad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.ClassRoom;

public interface ClassRoomRepository extends JpaRepository<ClassRoom, Long> {
    
}
