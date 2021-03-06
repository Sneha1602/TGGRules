package org.emoflon.ibex.tgg.run.adaptationrules;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import contextML.impl.ContextMLPackageImpl;
import essentialIFML.impl.EssentialIFMLPackageImpl;

public class MODELGEN_App extends MODELGEN {

	public MODELGEN_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(projectName, workspacePath, debug);
		registerPatternMatchingEngine(new DemoclesEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		MODELGEN_App generator = new MODELGEN_App("AdaptationRules", "./../", true);
		
		MODELGENStopCriterion stop = new MODELGENStopCriterion(generator.getTGG());
		stop.setTimeOutInMS(1000);
		stop.setMaxRuleCount("Context2EssentialIFML", 1);
		stop.setMaxRuleCount("CreateWindowsAndLinks", 1);
		//stop.setMaxRuleCount("CreateUserWindow", 0);
		generator.setStopCriterion(stop);
		
		logger.info("Starting MODELGEN");
		long tic = System.currentTimeMillis();
		generator.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed MODELGEN in: " + (toc - tic) + " ms");
		
		generator.saveModels();
		generator.terminate();
	}

	protected void registerUserMetamodels() throws IOException {
		// Load and register source and target metamodels		
		// Register correspondence metamodel last
		ContextMLPackageImpl.init();
		EssentialIFMLPackageImpl.init();
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
}
