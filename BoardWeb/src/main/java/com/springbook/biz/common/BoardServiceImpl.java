package com.springbook.biz.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import com.springbook.biz.board.impl.BoardDAOSpring;

//@Service("boardService")
public class BoardServiceImpl implements BoardService
{
	@Autowired
	private BoardDAOSpring boardDAO = new BoardDAOSpring();
	private LogAdvice log;
	
	public BoardServiceImpl() {
		log = new LogAdvice();
	}
	
	public void insertBoard(BoardVO vo)
	{
//		if(vo.getSeq() == 0)
//		{
//			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
//		}
		System.out.println("값: "+vo);
		//log.printLog();
		boardDAO.insertBoard(vo);
		boardDAO.insertBoard(vo);

	}
	
	public void updateBoard(BoardVO vo)
	{
		//log.printLog();
		boardDAO.updateBoard(vo);
	}
	
	public void deleteBoard(BoardVO vo)
	{
		//log.printLog();
		boardDAO.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		// TODO Auto-generated method stub
		return boardDAO.getBoardList(vo);
		
	}
	
}
