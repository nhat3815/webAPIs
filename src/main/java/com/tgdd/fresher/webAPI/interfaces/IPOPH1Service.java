package com.tgdd.fresher.webAPI.interfaces;

import java.util.List;

import com.tgdd.fresher.webAPI.model.POPH1;

public interface IPOPH1Service {

	List<POPH1> POGetPH1(String poid, int limit);

	POPH1 getPOPH1(String poid, int limit);

	POPH1 createPOPH1(POPH1 poph1);

	POPH1 UpdatePOPH1(POPH1 poph1);

	int deletePOPH1(String poid);

}
