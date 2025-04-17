package com.example.SpringWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("home method called");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add (@RequestParam("num1") int num ,@RequestParam("num2") int num2, ModelAndView mv) {
        System.out.println("in add method");
        int result = num + num2 ;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }


    @RequestMapping("addalien")
    public String addAlien(@ModelAttribute Alien alien) {
        System.out.println("in add method");
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//        mv.addObject("alien", alien);
//        mv.setViewName("result");
//        return mv;
        return "result";
    }


//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num ,@RequestParam("num2") int num2, Model model) {
//        System.out.println("in add method");
//        int result = num + num2 ;
//        model.addAttribute("result", result);
//        return "result";
//    }
//    public String add(HttpServletRequest req, HttpSession session){
//        System.out.println("in add method");
//        int num1 = 0;
//        int num2 = 0;
//        String param1 = req.getParameter("num1");
//        String param2 = req.getParameter("num2");
//        try{
//            if (param1 != null && !param1.isEmpty()) {
//                num1 = Integer.parseInt(param1);
//            }
//            if (param2 != null && !param2.isEmpty()) {
//                num2 = Integer.parseInt(param2);
//            }
//        }
//        catch (NumberFormatException e){
//            return "Invalid number format";
//        }
//        int result = num1 + num2;
////        System.out.println(result);
//        session.setAttribute("result", result);
//        return "result.jsp";
//    }
}
