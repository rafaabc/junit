package bmi;

import categories.Smoke;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
 * Test Suite to run all methods categorized as Smoke
 */

@RunWith(Categories.class)
@Categories.IncludeCategory(Smoke.class)
@Suite.SuiteClasses({
        CategorizedTestsTest.class
})
public class Suite_SmokeCategoriesTest {
}
