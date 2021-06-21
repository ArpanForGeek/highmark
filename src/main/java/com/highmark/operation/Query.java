package com.highmark.operation;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.highmark.entities.Member;
import com.highmark.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Query implements GraphQLQueryResolver {

    @Autowired
    private MemberService memberService;

    public List<Member> getMembers() {
        return memberService.getAllMembers();
    }

    public Member getMemberByUmi(String umi){
        return memberService.getMemberByUmi(umi);
    }

    public List<Member> getMemberByFirstNameStartsWith(String firstName){
        return memberService.getMemberByFirstNameStartsWith(firstName);
    }
}
