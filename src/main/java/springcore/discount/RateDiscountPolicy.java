package springcore.discount;

import springcore.member.Grade;
import springcore.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

	private int discountPercent = 10; // 10% 할인

	@Override
	public int discount(Member member, int price) {
		if (member.getGrade() == Grade.VIP) {
			return price * discountPercent / 100;
		}
		return 0;
	}
}
