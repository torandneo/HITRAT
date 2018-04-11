package com.hit.rat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hit.rat.entity.HitTupple;
import com.hit.rat.repository.HitRatioRepository;





@Service("hitRatioService")
@Transactional
public class HitRatioService {	
	
	 @Autowired
	 private HitRatioRepository hRatioRepository;

	     
	   public void save(HitTupple hTupple) {
	       hRatioRepository.save(hTupple);
	   }

	  
	   public HitTupple get(int id) {
	      return hRatioRepository.get(id);
	   }

	  
	   public List<HitTupple> list() {
	      return hRatioRepository.list();
	   }

	   
	  /* public void update(long id, HitTupple hTupple) {
		   hRatioRepository.update(id, hTupple);
	   }*/

	   	   
	   public void delete(int id) {
		   hRatioRepository.delete(id);
	   }


}
