package com.sunil.stream.service;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import com.sunil.stream.dto.KingDTO;

public interface KingService {
	
	String validateAndsave(KingDTO dto);

	Collection<KingDTO> validateAndfindByRegion(Predicate<KingDTO> search);

	Collection<KingDTO> validateAndfindByNameLike(Predicate<KingDTO> search);
	
	Optional<KingDTO> validateAndfindOneByName(Predicate<KingDTO> search);
}


