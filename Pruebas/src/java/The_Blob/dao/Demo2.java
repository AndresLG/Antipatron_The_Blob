package The_Blob.dao;

public class Demo2 {
    
    //llenas tu Experimentcon varias cosas, pero nunca vemos dónde se usa.
    //Todos los pasos posteriores simplemente toman la configuración completa en lugar
    //de las piezas relevantes que necesitan.
    
    String experimentBaseDirectory = args[0];

List<ExperimentProblem<BinarySolution>> problemList = new ArrayList<>();
problemList.add(new ExperimentProblem<>(new ZDT5()));
problemList.add(new ExperimentProblem<>(new OneZeroMax(512)));

List<ExperimentAlgorithm<BinarySolution, List<BinarySolution>>> algorithmList =
        configureAlgorithmList(problemList);

Experiment<BinarySolution, List<BinarySolution>> experiment;
experiment = new ExperimentBuilder<BinarySolution, List<BinarySolution>>("BinaryProblemsStudy")
        .setAlgorithmList(algorithmList)
        .setProblemList(problemList)
        .setExperimentBaseDirectory(experimentBaseDirectory)
        .setOutputParetoFrontFileName("FUN")
        .setOutputParetoSetFileName("VAR")
        .setReferenceFrontDirectory(experimentBaseDirectory+"/referenceFronts")
        .setIndicatorList(Arrays.asList(
                new Epsilon<BinarySolution>(), new Spread<BinarySolution>(), new GenerationalDistance<BinarySolution>(),
                new PISAHypervolume<BinarySolution>(),
                new InvertedGenerationalDistance<BinarySolution>(),
                new InvertedGenerationalDistancePlus<BinarySolution>())
        )
        .setIndependentRuns(INDEPENDENT_RUNS)
        .setNumberOfCores(8)
        .build();

new ExecuteAlgorithms<>(experiment).run();
new GenerateReferenceParetoFront(experiment).run();
new ComputeQualityIndicators<>(experiment).run();
new GenerateLatexTablesWithStatistics(experiment).run();
new GenerateWilcoxonTestTablesWithR<>(experiment).run();
new GenerateFriedmanTestTables<>(experiment).run();
new GenerateBoxplotsWithR<>(experiment).setRows(1).setColumns(2).setDisplayNotch().run();
    
}
