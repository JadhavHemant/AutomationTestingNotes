package UtilityLayer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformerSetUp implements IAnnotationTransformer {


	
	// override the transform() method

		@Override
		public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

			annotation.setRetryAnalyzer(RetryAnalyzerSetUp.class);
		}

	}
