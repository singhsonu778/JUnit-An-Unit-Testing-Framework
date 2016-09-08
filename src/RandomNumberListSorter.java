import java.util.List;

public class RandomNumberListSorter {

	private RandomNumberListGenerator listGenerator;

	public RandomNumberListSorter(RandomNumberListGenerator listGenerator) {
		this.listGenerator = listGenerator;
	}

	public List<Integer> getSortedRandomNumberList(int count) {
		List<Integer> list = listGenerator.getList(count);
		list.sort((s1, s2) -> s1 - s2);
		return list;
	}
}
