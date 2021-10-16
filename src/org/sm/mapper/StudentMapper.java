package org.sm.mapper;

import java.util.List;

import org.sm.entity.Card;
import org.sm.entity.Student;

public interface StudentMapper {

	void addStudent(Student student);
	
	List<Student> queryStudentAndCard();
	
	List<Card> queryClassById();
	
	Card selectCardByStudentId(Integer id);
}
