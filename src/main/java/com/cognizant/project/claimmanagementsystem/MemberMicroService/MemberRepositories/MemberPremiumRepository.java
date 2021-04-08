package com.cognizant.project.claimmanagementsystem.MemberMicroService.MemberRepositories;

import java.util.List;

import com.cognizant.project.claimmanagementsystem.MemberMicroService.MemberEntities.MemberPremium;

import org.springframework.data.repository.CrudRepository;

public interface MemberPremiumRepository extends CrudRepository<MemberPremium,Integer> {
    


public List<MemberPremium> findByMemberidAndPolicyid(int m,int p);



}
