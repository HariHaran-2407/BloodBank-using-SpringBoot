package com.example.donor.Service;

import com.example.donor.Model.BloodInventory;
import com.example.donor.Repository.BloodInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class BloodInventoryService {

    @Autowired
    private BloodInventoryRepository bloodInventoryRepository;

    public List<BloodInventory> getAllBloodInventory(){
        return bloodInventoryRepository.findAll();
    }

    public Optional<BloodInventory> getByBloodType(String bloodType) {
        return bloodInventoryRepository.findAll().stream()
                .filter(b -> b.getBloodType().equalsIgnoreCase(bloodType)) // Use equalsIgnoreCase for case-insensitive comparison
                .findFirst(); // This returns an Optional<BloodInventory>
    }


    public BloodInventory saveBloodInventory(BloodInventory bloodInventory) {
        return bloodInventoryRepository.save(bloodInventory);
    }



    public void deleteBloodInventory(Long id) {
        bloodInventoryRepository.deleteById(id);
    }
}
