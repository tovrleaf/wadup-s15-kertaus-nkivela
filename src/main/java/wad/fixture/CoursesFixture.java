package wad.fixture;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wad.domain.Exam;
import wad.domain.ClassRoom;
import wad.domain.Teacher;
import wad.repository.ExamRepository;
import wad.repository.ClassRoomRepository;
import wad.repository.TeacherRepository;

@Service
public class CoursesFixture {
    
    @Autowired
    private ClassRoomRepository roomRepository;
    
    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private ExamRepository examRepository;
    
    public void populate() throws ParseException {
        ClassRoom rA11 = new ClassRoom();
        rA11.setName("A11");
        rA11 = roomRepository.save(rA11);
        
        ClassRoom rB123 = new ClassRoom();
        rB123.setName("B123");
        rB123 = roomRepository.save(rB123);
        
        Teacher tuovinen = new Teacher();
        tuovinen.setName("Antti-Pekka Tuovinen");
        tuovinen = teacherRepository.save(tuovinen);
        
        Teacher karkkainen = new Teacher();
        karkkainen.setName("Juha Kärkkäinen");
        karkkainen = teacherRepository.save(karkkainen);
        
        Teacher luukkainen = new Teacher();
        luukkainen.setName("Matti Luukkainen");
        luukkainen = teacherRepository.save(luukkainen);
        
        Teacher vihavainen = new Teacher();
        vihavainen.setName("Arto Vihavainen");
        vihavainen = teacherRepository.save(vihavainen);
        
        Teacher makinen = new Teacher();
        makinen.setName("Veli Mäkinen");
        makinen = teacherRepository.save(makinen);
        
        SimpleDateFormat df = new SimpleDateFormat("d.M.y k:m");
        
        Exam exam1 = new Exam();
        exam1.setCourseCode(581358);
        exam1.setName("Software Architecture");
        exam1.setExaminer(tuovinen);
        exam1.setRoom(rA11);
        exam1.setDateTime(df.parse("20.10.2015 09:00"));
        exam1.setType(Exam.Type.COURSE);
        exam1 = examRepository.save(exam1);
        
        Exam exam2 = new Exam();
        exam2.setCourseCode(582670);
        exam2.setName("Algorithms for Bioinformatics");
        exam2.setExaminer(karkkainen);
        exam2.setRoom(rA11);
        exam2.setDateTime(df.parse("20.10.2015 09:00"));
        exam2.setType(Exam.Type.COURSE);
        exam2 = examRepository.save(exam2);
        
        Exam exam3 = new Exam();
        exam3.setCourseCode(581259);
        exam3.setName("Software Engineering");
        exam3.setExaminer(luukkainen);
        exam3.setRoom(rA11);
        exam3.setDateTime(df.parse("20.10.2015 09:00"));
        exam3.setType(Exam.Type.COURSE);
        exam3 = examRepository.save(exam3);
        
        Exam exam4 = new Exam();
        exam4.setCourseCode(581325);
        exam4.setName("Introduction to Programming");
        exam4.setExaminer(vihavainen);
        exam4.setRoom(rB123);
        exam4.setDateTime(df.parse("20.10.2015 16:00"));
        exam4.setType(Exam.Type.COURSE);
        exam4 = examRepository.save(exam4);
        
        Exam exam5 = new Exam();
        exam5.setCourseCode(582715);
        exam5.setName("Register	Algorithms in Molecular Biology");
        exam5.setExaminer(makinen);
        exam5.setRoom(rB123);
        exam5.setDateTime(df.parse("17.11.2015 16:00"));
        exam5.setType(Exam.Type.SEPARATE);
        exam5 = examRepository.save(exam5);
    }
}
