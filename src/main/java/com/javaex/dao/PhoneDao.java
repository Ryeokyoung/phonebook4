package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class PhoneDao {

	@Autowired
	private SqlSession sqlSession;

	
	public int personInsert(PersonVo pVo) {
		// System.out.println(pVo);
		int count = sqlSession.insert("phonebook.personInsert", pVo);
		return count;
	}

	public int personUpdate(PersonVo pVo) {
		//System.out.println(pVo);
		int count = sqlSession.update("phonebook.personUpdate", pVo);
		package com.javaex.dao;

import com.javaex.vo.*;
import java.util.*;

public class TestApp {
	public static void main(String[] args) {
		PhoneDao pDao = new PhoneDao();
		
		List<PersonVo> pList = pDao.personSelect();
		
		System.out.println(pList);
	}
}return count;
	}

	public int personDelete(int personId) {
		// System.out.println(personId);
		int count = sqlSession.delete("phonebook.personDelete", personId);
		return count;
	}

	public List<PersonVo> personSelect() {
		List<PersonVo> pList = sqlSession.selectList("phonebook.personSelect");
		// System.out.println(pList);
		return pList;
	}

	public PersonVo getPerson(int personId) {
		PersonVo pVo = sqlSession.selectOne("phonebook.getPerson", personId);
		// System.out.println(pVo);
		return pVo;
	}
}