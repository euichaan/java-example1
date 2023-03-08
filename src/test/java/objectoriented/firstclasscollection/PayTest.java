package objectoriented.firstclasscollection;

import static objectoriented.firstclasscollection.PayType.*;
import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class PayTest {

	@Test
	void 로직이_밖에_있는_상태() {
		List<Pay> pays = Arrays.asList(
			new Pay(NAVER_PAY, 1000),
			new Pay(NAVER_PAY, 1500),
			new Pay(KAKAO_PAY, 2000),
			new Pay(TOSS, 3000)); // 값은 여기 있음

		Long naverPaySum = pays.stream()
			.filter(pay -> pay.getPayType() == NAVER_PAY)
			.mapToLong(Pay::getAmount)
			.sum(); // 계산은 여기서 진행

		assertThat(naverPaySum).isEqualTo(2500);
	}

	@Test
	void 로직과_값이_한곳에() {
		List<Pay> pays = Arrays.asList(
			new Pay(NAVER_PAY, 1000),
			new Pay(NAVER_PAY, 1500),
			new Pay(KAKAO_PAY, 2000),
			new Pay(TOSS, 3000));

		PayGroups payGroups = new PayGroups(pays);

		Long naverPaySum = payGroups.getNaverPaySum(); // 상태와 로직이 한곳에

		assertThat(naverPaySum).isEqualTo(2500);
	}
}