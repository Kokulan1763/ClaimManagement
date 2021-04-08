package com.cognizant.project.claimmanagementsystem.MemberMicroService.MemberRepositories;

import com.cognizant.project.claimmanagementsystem.MemberMicroService.MemberEntities.MemberPolicy;

import org.springframework.data.repository.CrudRepository;

public interface MemberPolicyRepository extends CrudRepository<MemberPolicy,Integer>{
    
}
