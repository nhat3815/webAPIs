package com.tgdd.fresher.webAPI.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tgdd.fresher.webAPI.model.POCT;


public interface IPOCTService {
	List<POCT> getPOCTTOPH (String sttRec);
}
