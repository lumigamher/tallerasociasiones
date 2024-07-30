package com.campus.tallerasociasiones.services;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.tallerasociasiones.entities.Address;
import com.campus.tallerasociasiones.entities.Client;
import com.campus.tallerasociasiones.repositories.ClientRepository;

import jakarta.transaction.Transactional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Transactional
    public void addAddressToClient(Long clientId, Address... addresses) {
        Optional<Client> optionalClient = clientRepository.findById(clientId);
        optionalClient.ifPresent(client -> {
            client.getAddresses().addAll(Arrays.asList(addresses));
            clientRepository.save(client);
            System.out.println(client);
        });
    }

}
