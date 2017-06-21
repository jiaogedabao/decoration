package org.offer.service.impl;

import org.offer.bean.AreaBean;
import org.offer.dao.AreaDAO;
import org.offer.service.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class AreaServiceImpl implements IAreaService{
	
	@Autowired
	private AreaDAO areaDao;

	@Override
	public AreaBean queryById(Integer id) {
		return areaDao.queryById(id);
	}
	

}
