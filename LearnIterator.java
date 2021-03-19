package collections;

public class LearnIterator {
	Set<String> s1 = new HashSet<String>();
    s1.add("BD");
    s1.add("AB");
    s1.add("EF");
    s1.add("AB");
    s1.add(null);
    s1.add("");
    System.out.println("Hash Set -Random:" + s1);
    s1.clear();
    s1 = new LinkedHashSet<String>();
    s1.add("BD");
    s1.add("AB");
    s1.add("EF");
    s1.add("AB");
    s1.add("AB");
    s1.add(null);
    System.out.println("Linked Hash Set - Insertion Order:" + s1);
    s1.clear();
    s1 = new TreeSet<String>();
    s1.add("BD");
    s1.add("AB");
    s1.add("EF");
    s1.add("AB");
    // s1.add(null);
    System.out.println("Tree Set - Sorting Order:" + s1);
    Iterator<String> itr = s1.iterator();
    while (itr.hasNext()) {
        System.out.println(itr.next());
        ;
}
