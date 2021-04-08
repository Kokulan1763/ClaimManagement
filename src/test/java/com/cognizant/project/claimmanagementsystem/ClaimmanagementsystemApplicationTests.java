package com.cognizant.project.claimmanagementsystem;
import com.cognizant.project.claimmanagementsystem.ClaimsMicroService.ClaimEntities.Claim;
import com.cognizant.project.claimmanagementsystem.ClaimsMicroService.ClaimRepositories.ClaimRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ClaimmanagementsystemApplicationTests {

@Autowired
ApplicationContext context;



	@Test
	void testClaimsMicroService() {
ClaimRepository claimrepo=context.getBean(ClaimRepository.class);




	}

}
