package com.sunil.stream.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import com.sunil.stream.constants.FinishType;
import com.sunil.stream.dto.NailPaintDTO;

public class NailPaintDAOImpl implements NailPaintDAO {

	private Collection<NailPaintDTO> list = new ArrayList<NailPaintDTO>();

	@Override
	public boolean save(NailPaintDTO dto) {

		return this.list.add(dto);
	}

	@Override
	public Optional<NailPaintDTO> findOne(String brand) {

		return this.list.stream().filter(b -> b.getBrand().equals(brand)).findFirst();
	}

	@Override
	public Collection<NailPaintDTO> findByFinishType(FinishType type) {

		return this.list.stream().filter(t -> t.getType().equals(FinishType.PEARL)).collect(Collectors.toList());
	}

	@Override
	public Collection<NailPaintDTO> findByPriceLesserThan(double price) {

		return this.list.stream().filter(p -> p.getPrice() < price).collect(Collectors.toSet());
	}

}
