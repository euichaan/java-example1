package objectoriented.firstclasscollection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoTicket {
	/**
	 * 6개의 숫자로 이루어져야만 하고
	 * 6개의 숫자는 서로 중복되지 않아야만 하는
	 * 비즈니스에 종속적인 자료구조
	 */
	private static final int LOTTO_NUMBERS_SIZE = 6;

	private final List<Long> lottoNumbers;

	public LottoTicket(List<Long> lottoNumbers) {
		validateSize(lottoNumbers);
		validateDuplicate(lottoNumbers);
		this.lottoNumbers = lottoNumbers;
	}

	private void validateSize(List<Long> lottoNumbers) {
		if (lottoNumbers.size() != LOTTO_NUMBERS_SIZE) {
			throw new IllegalArgumentException("로또 번호는 6개만 가능합니다.");
		}
	}

	private void validateDuplicate(List<Long> lottoNumbers) {
		Set<Long> nonDuplicateNumbers = new HashSet<>(lottoNumbers);
		if (nonDuplicateNumbers.size() != LOTTO_NUMBERS_SIZE) {
			throw new IllegalArgumentException("로또 번호들은 중복될 수 없습니다.");
		}
	}
}
