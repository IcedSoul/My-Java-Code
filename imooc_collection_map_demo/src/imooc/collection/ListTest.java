package imooc.collection;
import java.util.*;
/**
 * ��ѡ�γ���
 * @author ������
 *
 */

public class ListTest {
	/**
	 * ��ű�ѡ�γ�
	 */
	public List coursesToSelect;
	public ListTest(){
		this.coursesToSelect=new ArrayList();
	}
	/**
	 * ������coursesToSelect���ӿγ�
	 */
	public void testAdd(){
		//����һ���γ̶��񣬵���add���������ӵ���ѡ�γ���
		Course cr1=new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp= (Course)coursesToSelect.get(0);
		System.out.print("�����˿γ̣��γ̱�ţ� "+temp.id+" ,�γ����ƣ�"+temp.name);
		Course cr2=new Course("2","C����");
		coursesToSelect.add(0, cr2);
		Course temp2= (Course)coursesToSelect.get(0);
		System.out.print("�����˿γ̣��γ̱�ţ� "+temp2.id+" ,�γ����ƣ�"+temp2.name);
	}
	public static void main(String[] args){
		ListTest It =new ListTest();
		It.testAdd();
	}

}