package io.github.mat3e.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    List<Task> findAll();

    Page<Task> findAll(Pageable page);

    Optional<Task> findById(Integer id);

    boolean existById(Integer id);
    List<Task> findByDone(@Param("state") boolean done);
    Task save(Task entity);


}