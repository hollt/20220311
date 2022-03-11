package co.micol.prj.member.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.micol.prj.log.service.LogService;
import co.micol.prj.log.service.LogVO;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.vo.MemberVO;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberDao;
	@Autowired
	private LogService logDao;
	
	@RequestMapping("memberList.do")
	public String memberList(Model model,HttpSession session,LogVO logVo) {
		logVo.setId((String) session.getAttribute("id"));
		logVo.setAction("R");
		logDao.insertLog(logVo);
		model.addAttribute("members", memberDao.memberSelectList());
		return "member/memberList";
	}

	@PostMapping("/memberSelect.do")
	public String memberSelect(Model model, MemberVO vo,LogVO logVo) {
		vo = memberDao.memberSelect(vo);
		logVo.setId("micol");
		logVo.setAction("R");
		logDao.insertLog(logVo);
		if (vo != null) {
			model.addAttribute("member", vo);
			return "member/memberSelect";
		} else {
			model.addAttribute("message", "조회된 회원이 없습니다.");
			return "member/memberError";
		}
	}
	@RequestMapping("memberInsertForm.do")
	public String memberInsertForm() {
		return "member/memberInsertForm";
	}
	
	@PostMapping("/memberInsert.do")
	public String memberRegister(MemberVO vo,LogVO logVo) {
		int n = memberDao.memberInsert(vo);
		logVo.setId("micol");
		logVo.setAction("C");
		logDao.insertLog(logVo);
		if(n != 0) {
			return "redirect:home.do";
		}
			return "member/memberError";
	}

	@RequestMapping("memberDelete.do")
	public String memberDelete(MemberVO vo,LogVO logVo) {
		int n = memberDao.memberDelete(vo);
		logVo.setId("micol");
		logVo.setAction("D");
		logDao.insertLog(logVo);
		if (n != 0) {
			return "redirect:memberList.do";
		}
		return "member/memberError";
	}
	
	@RequestMapping("/memberUpdateForm.do")
	public String memberUpdateForm(MemberVO vo , Model model) {
		vo = memberDao.memberSelect(vo);
		model.addAttribute("member", vo);		
		return "member/memberUpdateForm";
	}
	
	@RequestMapping("/memberUpdate.do")
	public String memberUpdate(MemberVO vo,LogVO logVo) {
		int n = memberDao.memberUpdate(vo);
		logVo.setId("micol");
		logVo.setAction("U");
		logDao.insertLog(logVo);
		if(n != 0) {
			return "redirect:memberList.do";
		}
			return "member/memberError";
	}
	
	
}
