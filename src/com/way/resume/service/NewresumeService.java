package com.way.resume.service;

import java.util.List;

import com.way.resume.model.Basic_info;
import com.way.resume.model.Educational_info;
import com.way.resume.model.Work_info;

/**
 * 
 * NewresumeService接口 service层的接口
 *
 */
public interface NewresumeService {

	void insertbasic(Basic_info basicinfo);

	void addEducational(Educational_info edu);

	void addWork(Work_info work);

	void addIntroduce(Basic_info intro);

	List<Basic_info> selectBasic_info(int userid);

	List<Educational_info> selectEducational_info(int userid);

	List<Work_info> selectWork_info(int userid);

}
