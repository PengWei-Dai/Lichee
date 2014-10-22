package me.lichee.action;

import me.lichee.entity.Person;
import me.lichee.service.Service;

import com.opensymphony.xwork2.Action;


public class RegistAction
	implements Action
{
	//���������ڷ�װ�û��������������
	private Person person;
	//���ڷ�װ������������
	private String tip;
	//ϵͳ���õ�ҵ���߼����
	private Service service;
	//����ע��ҵ���߼�����������setter����
	public void setService(Service service)
	{
		this.service = service;
	}

	//person���Ե�setter��getter����
	public void setPerson(Person person)
	{
		this.person = person;
	}
	public Person getPerson()
	{
		return this.person;
	}

	//tip���Ե�setter��getter����
	public void setTip(String tip)
	{
		this.tip = tip;
	}
	public String getTip()
	{
		return this.tip;
	}

	//�����û������execute����
	public String execute()
		throws Exception
	{
		//����ҵ���߼������regist��������������
		if (service.regist(person))
		{
			setTip("������ע��ɹ���");
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}
}
