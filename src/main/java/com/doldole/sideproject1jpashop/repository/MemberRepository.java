package com.doldole.sideproject1jpashop.repository;

import com.doldole.sideproject1jpashop.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    //select m from Member m where m.name = ?
    public List<Member> findByName(String name);
}
