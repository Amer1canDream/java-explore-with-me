package ru.practicum.explorewithme.user.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.practicum.explorewithme.user.models.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByIdIsIn(List<Long> ids, Pageable pageable);

    boolean existsByEmail(String email);
}