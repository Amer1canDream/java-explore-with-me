package ru.practicum.explorewithme.category.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.practicum.explorewithme.category.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}