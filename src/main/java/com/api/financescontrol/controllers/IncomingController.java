package com.api.financescontrol.controllers;

import com.api.financescontrol.dtos.ExpenseDTO;
import com.api.financescontrol.dtos.IncomingDTO;
import com.api.financescontrol.models.Expense;
import com.api.financescontrol.models.Incoming;
import com.api.financescontrol.services.IncomingService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@RequestMapping("/incoming")
public class IncomingController {

    @Autowired
    IncomingService incomingService;

    @PostMapping
    public ResponseEntity<Object> createIncoming(@RequestBody @Valid IncomingDTO incomingDTO){
        var incoming = new Incoming();
        BeanUtils.copyProperties(incomingDTO, incoming);
        incoming.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));

        return ResponseEntity.status(HttpStatus.CREATED).body(incomingService.save(incoming));
    }

}
