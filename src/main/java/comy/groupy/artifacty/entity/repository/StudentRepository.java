package comy.groupy.artifacty.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comy.groupy.artifacty.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	Student findStudentByStudName(String pv);

}
