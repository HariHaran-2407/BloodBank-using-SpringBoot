package com.example.donor.Repository;

import com.example.donor.Model.BloodInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloodInventoryRepository extends JpaRepository<BloodInventory,Long> {
}
