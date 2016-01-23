package imooc.collection;

import java.util.*;
/**
 * Ñ§ÉúÀà
 * @author ¹ùÏş·å
 *
 */

public class Student {
	public String id;
	public String name;
	public Set courses;
	public Student(String id,String name){
		this.id=id;
		this.name=name;
		this.courses=new HashSet();
	}

}
