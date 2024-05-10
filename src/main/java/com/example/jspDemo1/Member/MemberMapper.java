package com.example.jspDemo1.Member;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface  MemberMapper {

    MemberDTO getByLoginID(String loginID);

    void save(MemberDTO member);


    void update(MemberDTO params);
    int getMemberByLoginID(String loginID);

}
