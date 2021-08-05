package com.sunil.stream.service;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import com.sunil.stream.dao.KingDAO;
import com.sunil.stream.dao.KingDAOImpl;
import com.sunil.stream.dto.KingDTO;

public class KingServiceImpl implements KingService{
	
	KingDAO list = new KingDAOImpl();


	@Override
	public String validateAndsave(KingDTO dto) {
		boolean nameValid = false;
		boolean totalYearsRuledvalid = false;
		boolean dynastyValid = false;
		boolean regionValid = false;
		boolean totalQueensValid = false;
		boolean currentQueenNameValid = false;
		if (dto != null) {
			System.out.println("dto is not null ,validate");
			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
				System.out.println("name is valid");
				nameValid = true;
			} else {
				System.out.println("name is invalid");
				nameValid = false;
			}
			int ruledYears = dto.getTotalYearsRuled();

			if (ruledYears >= 1 && ruledYears <= 15) {
				System.out.println("years is valid");
				totalYearsRuledvalid = true;
			} else {
				System.out.println("years is invalid ");
				totalYearsRuledvalid = false;
			}
			String dynasty = dto.getDynasty();
			if (dynasty != null && !dynasty.isEmpty() && dynasty.length() >= 4 && dynasty.length() <= 45) {
				System.out.println("dynasty is valid");
				dynastyValid = true;

			} else {
				System.out.println("dynasty is invalid");
				dynastyValid = false;
			}
			String region = dto.getRegion();
			if (region != null && !region.isEmpty() && region.length() >= 4 && region.length() <= 40) {
				System.out.println("region is valid");
				regionValid = true;

			} else {
				System.out.println("region is invalid");
				regionValid = false;
			}
			int queens = dto.getTotalQueens();
			if (queens >= 5 && queens <= 35) {
				System.out.println("queens valid");
				totalQueensValid = true;

			} else {
				System.out.println("queens not  valid");
				totalQueensValid = false;

			}
			String cuttentQueen = dto.getCurrentQueenName();
			if (cuttentQueen != null && !cuttentQueen.isEmpty() && cuttentQueen.length() >= 4
					&& cuttentQueen.length() <= 25) {
				System.out.println("currentQueen is valid");
				currentQueenNameValid = true;
			} else {
				System.out.println("currentQueen is not  valid");
				currentQueenNameValid = false;
			}

			if (nameValid && totalYearsRuledvalid && dynastyValid && regionValid && totalQueensValid
					&& currentQueenNameValid) {
				System.out.println("data is valid");
				return "Success";
			}
			System.out.println("data is invalid");

			return "Failed";
		}
		System.out.println("dto is null cannot  pass to dto");
		return "failed";
	}

	@Override
	public Collection<KingDTO> validateAndfindByRegion(Predicate<KingDTO> search) {
		return this.list.findByRegion(search);
	
	}

	@Override
	public Collection<KingDTO> validateAndfindByNameLike(Predicate<KingDTO> search) {
		
		return this.list.findByNameLike(search);
	}

	@Override
	public Optional<KingDTO> validateAndfindOneByName(Predicate<KingDTO> search) {
		
		return this.list.findOneByName(search);
	}
	
	

}
