package dev.quercusdata.ibermaticademov2.repository;

import dev.quercusdata.ibermaticademov2.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
