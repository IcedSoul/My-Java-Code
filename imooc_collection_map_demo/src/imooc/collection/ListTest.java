package imooc.collection;
import java.util.*;
/**
 * 备选课程类
 * @author 郭晓峰
 *
 */

public class ListTest {
	/**
	 * 存放备选课程
	 */
	public List coursesToSelect;
	public ListTest(){
		this.coursesToSelect=new ArrayList();
	}
	/**
	 * 用于向coursesToSelect添加课程
	 */
	public void testAdd(){
		//创建一个课程对像，调用add方法，添加到备选课程中
		Course cr1=new Course("1","数据结构");
		coursesToSelect.add(cr1);
		Course temp= (Course)coursesToSelect.get(0);
		System.out.print("添加了课程，课程编号： "+temp.id+" ,课程名称："+temp.name);
		Course cr2=new Course("2","C语言");
		coursesToSelect.add(0, cr2);
		Course temp2= (Course)coursesToSelect.get(0);
		System.out.print("添加了课程，课程编号： "+temp2.id+" ,课程名称："+temp2.name);
	}
	public static void main(String[] args){
		ListTest It =new ListTest();
		It.testAdd();
	}

}
