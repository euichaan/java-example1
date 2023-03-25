package springcore;

import springcore.discount.DiscountPolicy;
import springcore.discount.RateDiscountPolicy;
import springcore.member.MemberRepository;
import springcore.member.MemberService;
import springcore.member.MemberServiceImpl;
import springcore.member.MemoryMemberRepository;
import springcore.order.OrderService;
import springcore.order.OrderServiceImpl;

public class AppConfig {
	/**
	 * 객체 생성하고 관리하면서
	 * 의존관계 연결 =
	 * DI 컨테이너, IoC 컨테이너
	 */
	public MemberService memberService() {
		return new MemberServiceImpl(memberRepository());
	}

	public OrderService orderService() {
		return new OrderServiceImpl(
			memberRepository(),
			getDiscountPolicy());
	}

	public MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}

	public DiscountPolicy getDiscountPolicy() {
		// return new FixDiscountPolicy();
		return new RateDiscountPolicy();
	}
}
