package com.example.demo.board.service;

import com.example.demo.board.domain.BoardVO;
import com.example.demo.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("com.example.demo.board.service.BoardService")
public class BoardService {

    @Resource(name="com.example.demo.board.mapper.BoardMapper")
    BoardMapper boardMapper;

    public List<BoardVO> boardListService() throws Exception{
        return boardMapper.boardList();
    }
}
