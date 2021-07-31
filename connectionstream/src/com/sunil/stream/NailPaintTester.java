package com.sunil.stream;

import java.util.Optional;

import com.sunil.stream.constants.FinishType;
import com.sunil.stream.dao.NailPaintDAO;
import com.sunil.stream.dao.NailPaintDAOImpl;
import com.sunil.stream.dto.NailPaintDTO;

public class NailPaintTester {

	public static void main(String[] args) {
		
		NailPaintDTO dto = new NailPaintDTO("Lakme","PolishGrey",250.0d,true,FinishType.METALLIC);
		NailPaintDTO dto1 = new NailPaintDTO("Revlon","PetalPink",350.0d,true,FinishType.GLITTER);
		NailPaintDTO dto2 = new NailPaintDTO("OPI","NavyBlue",150.0d,false,FinishType.SHEER);
		NailPaintDTO dto3 = new NailPaintDTO("Inglot","Green",120.0d,true,FinishType.TEXTURED);
		NailPaintDTO dto4 = new NailPaintDTO("LotusHerbals","Red",175.0d,true,FinishType.PEARL);
		
		NailPaintDAO dao = new NailPaintDAOImpl();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		
		Optional<NailPaintDTO> op = dao.findOne("Revlon");
		if(op.isPresent()) {
			NailPaintDTO paint = op.get();
			System.out.println(paint.getBrand());
		}
		
		
		dao.findByFinishType(FinishType.PEARL).forEach(m-> System.out.println(m.getPrice()));
		
		dao.findByPriceLesserThan(200.0d).forEach(p-> System.out.println(p.getBrand()));
	}
	
     

}
