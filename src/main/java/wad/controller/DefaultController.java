package wad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("*")
public class DefaultController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String search() {
        
        return "search";
    }
    
    @RequestMapping(value = "/course-exams", method = RequestMethod.GET)
    public String exams(Model model) {
        model.addAttribute("title", "Course Exams");
        return "exams";
    }
    
    @RequestMapping(value = "/exams", method = RequestMethod.GET)
    public String courceExams(Model model) {
        model.addAttribute("title", "Separate exams");
        return "exams";
    }
}
