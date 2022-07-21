package com.pazbear.springtutorial;

import com.pazbear.springtutorial.repository.MemberRepository;
import com.pazbear.springtutorial.repository.MemoryMemberRepository;
import com.pazbear.springtutorial.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    /**
     * 자바 코드로 직접 스프링 빈 등록
     */
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
