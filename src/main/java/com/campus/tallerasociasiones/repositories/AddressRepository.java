package com.campus.tallerasociasiones.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campus.tallerasociasiones.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
