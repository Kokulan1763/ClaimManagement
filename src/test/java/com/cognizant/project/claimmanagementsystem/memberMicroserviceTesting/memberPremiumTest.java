package com.cognizant.project.claimmanagementsystem.memberMicroserviceTesting;

import com.cognizant.project.claimmanagementsystem.ClaimsMicroService.ClaimEntities.Claim;
import com.cognizant.project.claimmanagementsystem.ClaimsMicroService.ClaimRepositories.ClaimRepository;
import com.cognizant.project.claimmanagementsystem.MemberMicroService.MemberEntities.MemberPremium;
import com.cognizant.project.claimmanagementsystem.MemberMicroService.MemberRepositories.MemberPremiumRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class memberPremiumTest {
    @Autowired
ApplicationContext context;





@Test
public void setup()
{

    MemberPremiumRepository memberpremiumrepo=context.getBean(MemberPremiumRepository.class);

MemberPremium m1=new MemberPremium(1, 1, 1000, 2000, 2000,java.time.LocalDate.now().toString());
MemberPremium m2=new MemberPremium(2, 2, 2000, 3000, 3000,java.time.LocalDate.now().toString());
MemberPremium m3=new MemberPremium(3, 3, 1000, 2000, 2000,java.time.LocalDate.now().toString());
MemberPremium m4=new MemberPremium(4, 4, 1000, 2000, 2000,java.time.LocalDate.now().toString());
MemberPremium m5=new MemberPremium(5, 5, 1000, 2000, 2000,java.time.LocalDate.now().toString());

memberpremiumrepo.save(m1);
memberpremiumrepo.save(m2);
memberpremiumrepo.save(m3);
memberpremiumrepo.save(m4);
memberpremiumrepo.save(m5);
}









}
