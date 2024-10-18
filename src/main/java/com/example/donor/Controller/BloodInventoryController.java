package com.example.donor.Controller;

import com.example.donor.Model.BloodInventory;
import com.example.donor.Service.BloodInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bloodinventory")
public class BloodInventoryController {

    @Autowired
    private BloodInventoryService bloodInventoryService;

    @GetMapping
    public List<BloodInventory> getAllBloodType(){
        return bloodInventoryService.getAllBloodInventory();
    }

    @GetMapping("/{bloodType}")
    public Optional<BloodInventory> getByBloodType(String bloodType){
        return bloodInventoryService.getByBloodType(bloodType);
    }


    @PostMapping
    public BloodInventory createBloodInventory(@RequestBody BloodInventory bloodInventory) {
        return bloodInventoryService.saveBloodInventory(bloodInventory);
    }

    @PutMapping("/{id}")
    public BloodInventory updateBloodInventory(@PathVariable Long id, @RequestBody BloodInventory bloodInventory) {
        bloodInventory.setId(id);
        return bloodInventoryService.saveBloodInventory(bloodInventory);
    }

    @DeleteMapping("/{id}")
    public void deleteBloodInventory(@PathVariable Long id) {
        bloodInventoryService.deleteBloodInventory(id);
    }
}
