package objectoriented.firstclasscollection;

public enum PayType {

	NAVER_PAY,
	KAKAO_PAY,
	TOSS;

	public static boolean isNaverPay(PayType payType) {
		return payType == NAVER_PAY;
	}

	public static boolean isKaKaoPay(PayType payType) {
		return payType == KAKAO_PAY;
	}
}
