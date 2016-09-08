import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberListGenerator {

	public List<Integer> getList(int count) {
		Random random = new Random();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			list.add(random.nextInt(100));
		}
		return list;
	}
}
