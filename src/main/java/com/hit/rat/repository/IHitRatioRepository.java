package com.hit.rat.repository;
import java.util.List;

import com.hit.rat.entity.HitTupple;



public interface IHitRatioRepository {

	void save(HitTupple hTupple);
	HitTupple get(int id);
	List<HitTupple> list();	
	void delete(int id);

}
