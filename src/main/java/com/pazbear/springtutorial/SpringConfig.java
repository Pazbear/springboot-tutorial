package com.pazbear.springtutorial;

import com.pazbear.springtutorial.repository.JdbcMemberRepository;
import com.pazbear.springtutorial.repository.JpaMemberRepository;
import com.pazbear.springtutorial.repository.MemberRepository;
import com.pazbear.springtutorial.repository.MemoryMemberRepository;
import com.pazbear.springtutorial.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*
    @PersistenceContext
    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }
    */

    /*
    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }*/

    /**
     * 자바 코드로 직접 스프링 빈 등록
     */
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

    /*
    @Bean
    public MemberRepository memberRepository(){

        //return new JdbcMemberRepository(dataSource);
        //return new JdbcTemplateMemberRepository(dataSource);
        //return new JpaMemberRepository(em);
    }
    */
}
