package com.cognizant.project.claimmanagementsystem.MemberMicroService.MemberControllers;

import java.util.List;

import com.cognizant.project.claimmanagementsystem.MemberMicroService.MemberEntities.MemberPremium;
import com.cognizant.project.claimmanagementsystem.MemberMicroService.MemberRepositories.MemberPremiumRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/membermicroservice")
public class memberController {
    
@Autowired
MemberPremiumRepository memberrepo;



@GetMapping("/viewBills")
public List<MemberPremium> getviewBills(int memberid,int policyid)
{

return memberrepo.findByMemberidAndPolicyid(memberid, policyid);
}




}
