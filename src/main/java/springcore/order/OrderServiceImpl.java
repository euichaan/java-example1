package springcore.order;

import springcore.discount.DiscountPolicy;
import springcore.member.Member;
import springcore.member.MemberRepository;

public class OrderServiceImpl implements OrderService {

	private final MemberRepository memberRepository;
	private final DiscountPolicy discountPolicy;

	public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
		this.memberRepository = memberRepository;
		this.discountPolicy = discountPolicy;
	}

	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {
		Member member = memberRepository.findById(memberId); // 회원 정보 조회
		int discountPrice = discountPolicy.discount(member, itemPrice); // 할인 정책 적용

		return new Order(memberId, itemName, itemPrice, discountPrice); // 주문 객체 생성, 반환
	}
}
