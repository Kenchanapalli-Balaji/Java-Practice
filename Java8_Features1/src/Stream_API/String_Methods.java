package Stream_API;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_Methods 
{
	public static void main(String[] args) {
		String s="simple codes";
		s.chars().mapToObj(c->(char) c).filter(c->c!=' ')
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey)
		.sorted(Comparator.reverseOrder()).forEach(st->System.out.print(st+","));
	}
}
