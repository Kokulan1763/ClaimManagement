package com.cognizant.project.claimmanagementsystem.ClaimsMicroService.ClaimRepositories;
import com.cognizant.project.claimmanagementsystem.ClaimsMicroService.ClaimEntities.Claim;

import org.springframework.data.repository.CrudRepository;

public interface ClaimRepository extends CrudRepository<Claim,Integer> {
    
}
