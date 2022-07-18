package com.api.financescontrol.services;

import com.api.financescontrol.models.Incoming;
import com.api.financescontrol.repositories.IncomingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class IncomingService implements IncomingFacade{

    @Autowired
    IncomingRepository incomingRepository;

    @Override
    @Transactional
    public Incoming save(Incoming incoming) {
        return incomingRepository.save(incoming);
    }
}
