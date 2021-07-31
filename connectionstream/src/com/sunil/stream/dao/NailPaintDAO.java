package com.sunil.stream.dao;

import java.util.Collection;
import java.util.Optional;

import com.sunil.stream.constants.FinishType;
import com.sunil.stream.dto.NailPaintDTO;

public interface NailPaintDAO {
	
	boolean save(NailPaintDTO dto);
	
  Optional<NailPaintDTO> findOne(String brand);

  Collection<NailPaintDTO> findByFinishType(FinishType type);
	
  Collection<NailPaintDTO> findByPriceLesserThan(double price);
  
  

}
