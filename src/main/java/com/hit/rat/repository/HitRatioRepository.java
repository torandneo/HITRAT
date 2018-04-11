package com.hit.rat.repository;

import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import com.hit.rat.entity.HitTupple;



@Repository("IHitRatioRepository")
public class HitRatioRepository extends AbstractDao<Integer, HitTupple> implements IHitRatioRepository{	
		
	   public void save(HitTupple hTupple) {
		   persist(hTupple);	    
	   }	   
	   public HitTupple get(int id) {
		   HitTupple hTupple = getByKey(id);			
		   return hTupple;
	   }	 
	   @SuppressWarnings("unchecked")
	public List<HitTupple> list() {	      
		   Criteria criteria = createEntityCriteria();			
		   List<HitTupple> hTupples = (List<HitTupple>) criteria.list();
		   return hTupples;
	   }	   
	   public void delete(int id) {		   
		   HitTupple hTupple = get(id);
			delete(hTupple);
	   }
	   


}
