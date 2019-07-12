package com.ksh.web.board.service;

import java.util.List;
import com.ksh.web.board.model.BoardVO;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.ksh.web.board.dao.BoardDAO;
import com.ksh.web.board.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	@Inject
	private BoardDAO boardDAO;

	public List<BoardVO> getBoardList() throws Exception {
		return boardDAO.getBoardList();
	}
}