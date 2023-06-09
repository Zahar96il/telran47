package telran.java47.student.servise;

import java.util.List;

import telran.java47.student.dto.ScoreDto;
import telran.java47.student.dto.StudentCreateDto;
import telran.java47.student.dto.StudentDto;
import telran.java47.student.dto.StudentUpdateDto;

public interface StudentService {
	boolean addStudent(StudentCreateDto studentCreateDto);
	
	StudentDto findStudent(int id);
	
	StudentDto removeStudent(int id);
	
	StudentCreateDto updateStudent (int id, StudentUpdateDto studentUpdateDto);
	
	boolean addScore (Integer id, ScoreDto scoreDto);
	
	List<StudentDto> findStudentsByName (String name);
	
	long getStudentsNamesQuantity (List<String> name);
	
	List<StudentDto> getStudentsByExamMinScore(String exam, int minScore);
}
