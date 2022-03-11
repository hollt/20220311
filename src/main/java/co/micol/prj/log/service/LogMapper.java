package co.micol.prj.log.service;

import java.util.Date;
import java.util.List;

public interface LogMapper {
	List<LogVO> selectLogList(Date StratDate);
	int insertLog(LogVO vo);
}
