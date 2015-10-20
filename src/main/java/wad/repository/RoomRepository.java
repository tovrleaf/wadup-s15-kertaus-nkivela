package wad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
    
}
