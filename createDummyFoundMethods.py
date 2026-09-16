foundMethodsFile = r"src\main\java\fr\geming400\screwyou4\FoundMethods.java"
with open(foundMethodsFile, "w") as f:
    f.write("""
package fr.geming400.screwyou4;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import fr.geming400.screwyou4.generator.Generator;

import java.util.List;
import java.util.Map;

public final class FoundMethods {
    public static final Map<String, List<Generator.SerializedMethod>> FOUND_METHODS = null;
}
    """)
