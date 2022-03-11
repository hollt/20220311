package co.micol.prj.log.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("logDao")
public class LogServiceImpl implements LogService {
	@Autowired
	private LogMapper map;
	
	@Override
	public List<LogVO> selectLogList(Date StratDate) {
		return map.selectLogList(StratDate);
	}

	@Override
	public int insertLog(LogVO vo) {
		return map.insertLog(vo);
	}

}
