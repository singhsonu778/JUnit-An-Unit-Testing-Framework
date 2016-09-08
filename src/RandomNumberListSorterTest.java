import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RandomNumberListSorterTest {
	@InjectMocks
	RandomNumberListSorter listSorter;
	@Mock
	RandomNumberListGenerator listGenerator;

	@Test
	public void shouldGetSortedRandomNumberList() {
		List<Integer> fakeList = Arrays.asList(15, 20, 3, 16, 5);
		Mockito.when(listGenerator.getList(5)).thenReturn(fakeList);

		List<Integer> list = listSorter.getSortedRandomNumberList(5);

		Assert.assertEquals(list.get(0), new Integer(3));
		Assert.assertEquals(list.get(1), new Integer(5));
		Assert.assertEquals(list.get(2), new Integer(15));
		Assert.assertEquals(list.get(3), new Integer(16));
		Assert.assertEquals(list.get(4), new Integer(20));
		Mockito.verify(listGenerator, Mockito.times(1)).getList(5);

		list.forEach(System.out::println);
	}
}