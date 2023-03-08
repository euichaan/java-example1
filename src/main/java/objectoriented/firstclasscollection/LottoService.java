package objectoriented.firstclasscollection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class LottoService {

	private static final int LOTTO_NUMBERS_SIZE = 6;

	public void createLottoNumber() {
		List<Long> lottoNumbers = createNonDuplicateNumbers();
		// 로또 번호가 필요한 모든 장소에선 검증로직이 들어가야 한다.
		validateSize(lottoNumbers);
		validateDuplicate(lottoNumbers);
	}

	private List<Long> createNonDuplicateNumbers() {
		return LongStream.rangeClosed(1, 45)
			.limit(LOTTO_NUMBERS_SIZE)
			.boxed()
			.collect(Collectors.toList());
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
