package wad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wad.domain.Exam;
import wad.repository.ExamRepository;

@Controller
@RequestMapping("*")
public class DefaultController {
    
    @Autowired
    private ExamRepository examRepository;
    
    @RequestMapping(method = RequestMethod.GET)
    public String search() {
        return "search";
    }
    
    @RequestMapping(value = "/course-exams", method = RequestMethod.GET)
    public String exams(Model model) {
        model.addAttribute("title", "Course Exams");
        model.addAttribute("courses", examRepository.findByType(Exam.Type.COURSE));
        return "exams";
    }
    
    @RequestMapping(value = "/exams", method = RequestMethod.GET)
    public String courceExams(Model model) {
        model.addAttribute("title", "Separate exams");
        model.addAttribute("courses", examRepository.findByType(Exam.Type.SEPARATE));
        return "exams";
    }
}
