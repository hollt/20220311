package co.micol.prj.log.service;

import java.util.Date;
import java.util.List;

public interface LogService {
	List<LogVO> selectLogList(Date StratDate);
	int insertLog(LogVO vo);
}
