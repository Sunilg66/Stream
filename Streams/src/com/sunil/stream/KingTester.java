package com.sunil.stream;

import java.util.Collection;
import java.util.Optional;

import com.sunil.stream.dto.KingDTO;
import com.sunil.stream.service.KingService;
import com.sunil.stream.service.KingServiceImpl;

public class KingTester {

	public static void main(String[] args) {
		
		KingDTO dto1 = new KingDTO("Mayura Sharma", "Banavasi", "Kadamba", 40, "Bhagirathi", 2);
		KingDTO dto2 = new KingDTO("KrishnaDevaraya", "SouthIndia", "Vijayanagar", 30, "ChinnammaDevi", 2);
		KingDTO dto3 = new KingDTO("Bahamani Sultanate", "North Karnataka", "Bahamani", 25, "Haseki Sultan", 8);
		KingDTO dto4 = new KingDTO("KrishnaRaja Wodeyar", "OldMysore", "Mysore Wodeyars", 65, "Maharani Pratapa Ammani", 5);

		KingService dao=new KingServiceImpl();
		dao.validateAndsave(dto1);
		dao.validateAndsave(dto2);
		dao.validateAndsave(dto3);
		dao.validateAndsave(dto4);

		Collection<KingDTO> region=dao.validateAndfindByRegion(k->k.getRegion().equals("Pataliputra"));
		for (KingDTO kingDTO : region) {
			System.out.println(kingDTO);
			}
		
		Optional<KingDTO> name = dao.validateAndfindOneByName((b) -> b.getName().equals("Shivaji"));
		if(name.isPresent()) {
			KingDTO optional=name.get();
			System.out.println(optional);
		}
		Collection<KingDTO> like=dao.validateAndfindByNameLike((m)->m.getName().equals("Krishnadevaraya"));
		for (KingDTO kingDTO : like) {
			System.out.println(kingDTO);
		}

	}

}
