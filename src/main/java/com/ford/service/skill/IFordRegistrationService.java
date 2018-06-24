package com.ford.service.skill;

import java.util.List;

import com.ford.entity.skill.FordRegistration;
import com.ford.entity.skill.FordRegistrationExample;

public interface IFordRegistrationService {
	
	public int addFordRegist(FordRegistration fordRegistration) throws Exception;

	public List<FordRegistration> findFordRegist(FordRegistrationExample fordRegistrationExample) throws Exception;
}
