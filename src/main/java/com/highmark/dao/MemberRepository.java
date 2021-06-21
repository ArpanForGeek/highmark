package com.highmark.dao;

import com.highmark.entities.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends CrudRepository<Member, String> {

    public List<Member> findByFirstNameStartsWith(String firstName);
}
