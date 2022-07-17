package com.api.financescontrol.controllers;

import com.api.financescontrol.services.IncomingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/incoming")
public class IncomingController {

    @Autowired
    IncomingService incomingService;

}
