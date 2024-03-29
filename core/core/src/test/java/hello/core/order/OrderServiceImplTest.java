//package hello.core.order;
//
//import hello.core.member.Grade;
//import hello.core.member.Member;
//import hello.core.member.MemberService;
//import hello.core.member.MemberServiceImpl;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class OrderServiceImplTest {
//
//    @Test
//    void createOrder() {
//
//        MemberService service = new MemberServiceImpl();
//        OrderService orderService = new OrderServiceImpl();
//
//        Long memberId = 1L;
//        Member member = new Member(memberId, "memberA", Grade.VIP);
//        service.join(member);
//
//        Order order = orderService.createOrder(memberId, "itemA", 1000);
//        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
//    }
//}