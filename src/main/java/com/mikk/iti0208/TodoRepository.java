package com.mikk.iti0208;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface TodoRepository extends JpaRepository<Todo, Long> {}