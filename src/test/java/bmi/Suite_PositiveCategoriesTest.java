package bmi;

import categories.Positives;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
 * Test Suite to run all methods categorized as Positive
 */

@RunWith(Categories.class)
@Categories.IncludeCategory(Positives.class)
@Suite.SuiteClasses({
        CategorizedTestsTest.class
})
public class Suite_PositiveCategoriesTest {
}
