package com.sunil.stream.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.sunil.stream.dto.KingDTO;

public class KingDAOImpl implements KingDAO{
	
	Collection<KingDTO> coll = new ArrayList<KingDTO>();

	@Override
	public boolean save(KingDTO dto) {
		boolean added = coll.add(dto);
		System.out.println(dto);
		return added;
	}

	@Override
	public Collection<KingDTO> findByRegion(Predicate<KingDTO> search) {
		
		return this.coll.stream().filter(a -> search.test(a)).collect(Collectors.toList());
	}

	@Override
	public Collection<KingDTO> findByNameLike(Predicate<KingDTO> search) {
		
		return this.coll.stream().filter(s -> search.test(s)).collect(Collectors.toList());
	}

	@Override
	public Optional<KingDTO> findOneByName(Predicate<KingDTO> search) {
		return this.coll.stream().filter(i -> search.test(i)).findFirst();
	}

}
