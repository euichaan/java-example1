package springcore.discount;

import springcore.member.Grade;
import springcore.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

	/**
	 * 정액 할인 정책
	 */
	private int discountFixAmount = 1000;

	@Override
	public int discount(Member member, int price) {
		if (member.getGrade() == Grade.VIP) {
			return discountFixAmount;
		}
		return 0;
	}
}
