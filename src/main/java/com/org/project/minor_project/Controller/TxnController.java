package com.org.project.minor_project.Controller;

import com.org.project.minor_project.DTO.TxnRequest;
import com.org.project.minor_project.Exception.TxnException;
import com.org.project.minor_project.Services.TxnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/txn")
public class TxnController {
    @Autowired
    private TxnService txnService;

//    @PostMapping("/create")
//    public String createTxn(@RequestBody TxnRequest txnRequest) throws TxnException {
//        return txnService.create(txnRequest);
//    }
//    @PostMapping("/create")
//    public ResponseEntity<String> create(@RequestBody TxnRequest txnRequest) throws TxnException {
//       String txnId =  txnService.create(txnRequest);
//       return new ResponseEntity<>(txnId, HttpStatus.OK);
//    }
//
//    @PutMapping("/return")
//    public ResponseEntity<Integer> returnBook(@RequestBody TxnRequest txnRequest) throws TxnException {
//        int txnId = txnService.returnBook(txnRequest);
//        return new ResponseEntity<>(txnId, HttpStatus.OK);
//    }


    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody TxnRequest txnRequest) throws TxnException {
        String txnId =  txnService.create(txnRequest);
        return new ResponseEntity<>(txnId, HttpStatus.OK);
    }

    @PutMapping("/return")
    public ResponseEntity<Integer> returnBook(@RequestBody TxnRequest txnRequest) throws TxnException {
        int txnId = txnService.returnBook(txnRequest);
        return new ResponseEntity<>(txnId, HttpStatus.OK);
    }
}
