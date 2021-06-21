package com.highmark.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.highmark.dao.MemberRepository;
import com.highmark.entities.Member;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService{
    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return IteratorUtils.toList(memberRepository.findAll().iterator());
    }

    public Member getMemberByUmi(String umi){
        return memberRepository.findById(umi)
                .orElseGet(()->{
                    throw new NullPointerException("No data found");
                });
    }

    public List<Member> getMemberByFirstNameStartsWith(String firstName){
        return memberRepository.findByFirstNameStartsWith(firstName);
    }
}
