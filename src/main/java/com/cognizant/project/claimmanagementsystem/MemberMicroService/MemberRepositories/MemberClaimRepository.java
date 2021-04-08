package com.cognizant.project.claimmanagementsystem.MemberMicroService.MemberRepositories;

import com.cognizant.project.claimmanagementsystem.MemberMicroService.MemberEntities.MemberClaim;

import org.springframework.data.repository.CrudRepository;

public interface MemberClaimRepository extends CrudRepository<MemberClaim,Integer> {
    
}
