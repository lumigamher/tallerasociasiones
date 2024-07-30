package com.campus.tallerasociasiones.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campus.tallerasociasiones.entities.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
