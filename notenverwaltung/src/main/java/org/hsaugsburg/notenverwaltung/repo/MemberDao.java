package org.hsaugsburg.notenverwaltung.repo;

import java.util.List;

import org.hsaugsburg.notenverwaltung.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
