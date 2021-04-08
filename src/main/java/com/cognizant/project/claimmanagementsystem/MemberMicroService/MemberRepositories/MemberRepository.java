package com.cognizant.project.claimmanagementsystem.MemberMicroService.MemberRepositories;

import org.springframework.data.repository.CrudRepository;
import com.cognizant.project.claimmanagementsystem.MemberMicroService.MemberEntities.Member;
public interface MemberRepository extends CrudRepository<Member,Integer> {
    
}
