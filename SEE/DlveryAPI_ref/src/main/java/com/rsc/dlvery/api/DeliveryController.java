package com.rsc.dlvery.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.rsc.dlvery.DlveryApiApplication;
import com.rsc.dlvery.exception.DeliveryException;
import com.rsc.dlvery.model.DeliveryItem;
import com.rsc.dlvery.service.DeliveryManager;
import com.rsc.dlvery.service.DeliveryManagerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DeliveryController extends BaseController {

    @Autowired
    @Qualifier("DML")
    private DeliveryManager delService;
    
    @GetMapping(value = "/dis",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DeliveryItem>> getDeliveryItems() {
        System.out.println(delService.fetchAllDeiveryItems());
        return new ResponseEntity<List<DeliveryItem>>(getDelItems(),HttpStatus.OK);
    }

    @GetMapping(value = "/dis/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<DeliveryItem>> getDeliveryItemsByID(@PathVariable int id) {
        Optional<DeliveryItem> dItem = getDelItems().stream().filter(di-> di.getId()==id).findFirst();
        return new ResponseEntity<Optional<DeliveryItem>>(dItem,HttpStatus.OK);
    }

    @PutMapping(value = "/dis",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DeliveryItem> updateDI(@Valid @RequestBody DeliveryItem di){
        return new ResponseEntity<DeliveryItem>(di,HttpStatus.OK);
    }


    @PostMapping(value = "/di",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DeliveryItem>> AddDI(@Valid @RequestBody DeliveryItem di) throws DeliveryException{
        List<DeliveryItem> lstDi = getDelItems();
        

        if (di.getItemname().equalsIgnoreCase("Grocerry")){
            //return new ResponseEntity<List<DeliveryItem>>(lstDi,HttpStatus.BAD_REQUEST);
            throw new DeliveryException("Not Supported Delivery");
        }
        //int j = 9/0;

        lstDi.add(di);
        System.out.println(di);

        return new ResponseEntity<List<DeliveryItem>>(lstDi,HttpStatus.OK);
    }


}
