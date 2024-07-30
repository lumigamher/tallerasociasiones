package com.campus.tallerasociasiones.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.tallerasociasiones.entities.Address;
import com.campus.tallerasociasiones.services.ClientService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/{id}/address")
    public void addAddressToClient(@PathVariable Long id, @RequestBody Address[] addresses) {
        clientService.addAddressToClient(id, addresses);
    }
}
