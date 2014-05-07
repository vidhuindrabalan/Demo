package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.dao.FbDao;
@Service("FbServiceImpl")
@Transactional
public class FbServiceImpl implements FbService {
	@Autowired
private FbDao fbDaoImpl;
	public void getFb() {
		// TODO Auto-generated method stub
		fbDaoImpl.getFbDao();
	}

}
