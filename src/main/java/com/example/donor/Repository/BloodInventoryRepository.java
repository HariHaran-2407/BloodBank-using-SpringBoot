package com.example.donor.Repository;

import com.example.donor.Model.BloodInventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BloodInventoryRepository extends JpaRepository<BloodInventory,Long> {
    Optional<BloodInventory> findByBloodType(String bloodType);
}
