//package hello.core.member;
//
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//class MemberServiceImplTest {
//
//    MemberService memberService = new MemberServiceImpl();
//
//    @Test
//    void join() {
//        Member member = new Member(1L, "memberA", Grade.VIP);
//
//        memberService.join(member);
//        Member findMember = memberService.findMember(1L);
//
//        assertThat(member).isEqualTo(findMember);
//
//    }
//
//    @Test
//    void findMember() {
//
//
//
//    }
//}