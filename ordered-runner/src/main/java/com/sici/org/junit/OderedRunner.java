package com.sici.org.junit;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

/**
 * Suggestion by StackOverFlow. http://stackoverflow.com/users/378167/michael-d. 
 * And http://stackoverflow.com/users/473775/joscarsson
 * 
 * @author pthanhtrung.
 */
public class OderedRunner extends BlockJUnit4ClassRunner {

	public OderedRunner(Class<?> klass) throws InitializationError {
		super(klass);
	}

	@Override
	protected List<FrameworkMethod> computeTestMethods() {
		List<FrameworkMethod> frameworkMethods = super.computeTestMethods();
		Collections.sort(frameworkMethods, new Comparator<FrameworkMethod>() {

			public int compare(FrameworkMethod f1, FrameworkMethod f2) {
				Order o1 = f1.getAnnotation(Order.class);
                Order o2 = f2.getAnnotation(Order.class);

                if (o1 == null || o2 == null)
                    return -1;

                return o1.value() - o2.value();
			}
		});
		return frameworkMethods;

	}

}
