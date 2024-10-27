import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> hashSet = new TreeSet<>();
        Collections.addAll(hashSet, "Java", "C", "PHP", "JavaScript", "Python", "Rust", "Haskell", "Go", "Prolog");
        System.out.println(hashSet);
    }
}