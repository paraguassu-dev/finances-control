package com.api.financescontrol.services;

import com.api.financescontrol.repositories.IncomingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomingService implements IncomingFacade{

    @Autowired
    IncomingRepository incomingRepository;
}
