package objectoriented.firstclasscollection;

import java.util.Map;

public class GameRanking {
	/**
	 * 1. 비즈니스에 종속적인 자료구조
	 * 2. Collection의 불변성을 보장
	 * 3. 상태와 행위를 한 곳에서 관리
	 * 4. 이름이 있는 컬렉션
	 */

	private Map<String, String> ranks;

	public GameRanking(Map<String, String> ranks) {
		this.ranks = ranks;
	}
}
