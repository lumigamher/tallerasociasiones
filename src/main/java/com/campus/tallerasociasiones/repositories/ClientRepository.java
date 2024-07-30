package com.campus.tallerasociasiones.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campus.tallerasociasiones.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
