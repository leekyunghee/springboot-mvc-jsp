package com.example.demo.board.controller;

import com.example.demo.board.domain.BoardVO;
import com.example.demo.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class BoardController {

    @Resource(name="com.example.demo.board.service.BoardService")
    BoardService boardService;

    @RequestMapping("/list")
    private String boardList(Model model) throws Exception {

        model.addAttribute("list", boardService.boardListService());

        return "list";
    }

    @RequestMapping("/detail/{idBoard}")
    private String boardDetail(@PathVariable int idBoard, Model model) throws Exception {

        model.addAttribute("detail", boardService.boardDetailService(idBoard));

        return "detail";
    }
    @RequestMapping("/insertView")
    private String boardInsertForm() throws Exception {
        return "insert";
    }
    @RequestMapping("/insert")
    private String boardInsert(HttpServletRequest request) throws Exception {

        BoardVO boardVO = new BoardVO();
        boardVO.setSubject(request.getParameter("subject"));
        boardVO.setContent(request.getParameter("content"));
        boardVO.setWriter(request.getParameter("writer"));

        boardService.boardInsertService(boardVO);

        return "redirect:list";
    }
    @RequestMapping("/update/{idBoard}")
    private String boardUpdateForm(@PathVariable int idBoard, Model model) throws Exception {

        model.addAttribute("update", boardService.boardDetailService(idBoard));

        return "update";
    }

    @RequestMapping("/update")
    private String boardUpdate(HttpServletRequest request) throws Exception {

        BoardVO boardVO = new BoardVO();
        boardVO.setSubject(request.getParameter("subject"));
        boardVO.setContent(request.getParameter("content"));
        boardVO.setWriter(request.getParameter("writer"));
        boardVO.setIdBoard(Integer.parseInt(request.getParameter("idBoard")));

        boardService.boardUpdateService(boardVO);

        return "redirect:/detail/"+request.getParameter("idBoard");
    }

    @RequestMapping("/delete/{idBoard}")
    private String delete(@PathVariable int idBoard) throws Exception {

        boardService.boardDeleteService(idBoard);

        return "redirect:/list";
    }
}
