package org.emoflon.ibex.tgg.run.adaptationrules;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.commons.lang3.NotImplementedException;

import org.emoflon.ibex.tgg.operational.strategies.cc.CC;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import contextML.impl.ContextMLPackageImpl;
import essentialIFML.impl.EssentialIFMLPackageImpl;

public class CC_App extends CC {

	public CC_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(projectName, workspacePath, debug);
		registerPatternMatchingEngine(new DemoclesEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		CC_App cc = new CC_App("AdaptationRules", "./../", false);
		
		logger.info("Starting CC");
		long tic = System.currentTimeMillis();
		cc.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed CC in: " + (toc - tic) + " ms");
		cc.saveModels();
		cc.terminate();
	}

	protected void registerUserMetamodels() throws IOException {
		// Load and register source and target metamodels
		ContextMLPackageImpl.init();
		EssentialIFMLPackageImpl.init();
		//throw new NotImplementedException("Please check that your source and target metamodels are loaded and registered.");
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
}
