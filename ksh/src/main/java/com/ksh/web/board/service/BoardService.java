package com.ksh.web.board.service;

import java.util.List;
import java.util.Map;



import com.ksh.web.board.model.BoardVO;



public interface BoardService {
	public List<BoardVO> getBoardList() throws Exception;
}