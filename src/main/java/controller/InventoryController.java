package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import service.InventoryService;

@RestController
public class InventoryController {

    @Autowired
    InventoryService inventoryService;


}
