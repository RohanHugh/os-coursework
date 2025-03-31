Useful links:

* Discussion https://canvas.sussex.ac.uk/courses/32016/discussion_topics/422539

* Assignment https://canvas.sussex.ac.uk/courses/32016/pages/assignment-brief-cpu-scheduling

* Report https://docs.google.com/document/d/13I0oWljWTlyUC_2-FGeXO28japALxIxC8xjj9gVMDso/edit?tab=t.0

User threads & Kernal threads

Goals:

    Report
    Implement schedule algorithms - All seem to relate back to abstract scheduler

Important Points about Implementation:

    Non-Preemptive vs. Preemptive: Pay close attention to whether an algorithm should be preemptive or non-preemptive. The assignment clarifies that RR should be treated as non-preemptive in their simulator.

    Parameters: Make sure you read the required parameters (e.g., timeQuantum, initialBurstEstimate, alphaBurstEstimate) from the simulator's .prp file.

    Override Abstract Methods: All abstract methods in AbstractScheduler must be overridden in your concrete scheduler implementations.

    Don't Alter Class Structure: You should not change the overall structure of the provided classes. Only add/modify code within the existing structure where needed.

    Debugging: I can add print statements to System.out for debugging, but remove or comment them out before submitting.

Your Experiments:


    Design Three Experiments: You need to design three experiments, each investigating a different aspect of CPU scheduling. The assignment gives some general example questions to guide you, such as:
        How do process characteristics (e.g., burst lengths, arrival times) affect algorithm performance?
        How does the overall workload (CPU utilization) affect performance?
        How do the algorithm parameters (e.g., timeQuantum in RR, alpha in SJF) affect performance?
        How does the overhead of running the scheduler (interruptTime) affect performance?

    Clear Purpose: For each experiment, you must clearly state its purpose/objective in your report.

    Vary Parameters: Within each experiment, you'll vary the parameters in either the input generator's .prp file or the simulator's .prp file to create different scenarios.

    Run All Schedulers: Each experiment should involve running all the scheduling algorithms (FCFS, RR, Ideal SJF, Feedback RR, SJF with exponential averaging) under the same conditions so you can directly compare them.

    Multiple Seeds: Crucially, for each set of parameters, you should run the simulation multiple times with different random seeds in the input generator. This will give you more robust, averaged results. They suggest 5 different seeds.

    CPU Utilization: Pay attention to the CPU utilization of the system. You may need to configure parameters to get appropriate workload percentages.


Report Writing:

Your report should follow this structure:


    Introduction: Briefly describe the goal of the overall assignment and what you are trying to achieve.

    Methodology: This is the most important part. For each experiment:
        State the objective of the experiment clearly (what question are you trying to answer?)
        List the exact parameters you used for the input generator (.prp file) and the simulator (.prp file). Include all parameters, even if you only changed a few. Include the filenames too.
        Explain how you validated that your experimental setup and results are reasonable. This could involve running simple test cases or comparing your results to known theoretical behaviors.
        Describe the metrics you used (turnaround time, waiting time, response time, CPU utilization, throughput) and the rationale for why you chose them.

    Results:
        Present your results in a clear, visual way. Graphs are strongly preferred. Use tables to support the graphs if needed. Make sure your graphs have labels and clear legends. Use averaged results of your simulations.

    Discussion:
        Explain what your results mean. Do they support or contradict your initial hypotheses? Refer explicitly to the graphs and tables in your Results section to support your claims. Explain why you think the algorithms behaved the way they did.

    Threats to Validity: Discuss limitations of your experiments. Are there factors that could have affected your results? Are there any biases in your setup?

    Conclusions: Summarize your findings and the insights you gained about the different scheduling algorithms.


Submission:


    Single .zip file: Create a .zip file named cand_num.zip (replace cand_num with your candidate number).

    Contents:
        report.pdf: Your report in PDF format.
        os-coursework1/:
            experiment1/, experiment2/, experiment3/: Each folder should contain:
                All .prp files (input generator and simulator) used in that experiment.
                All .in input files generated for that experiment (with different seeds).
                All .out output files produced by the simulator for that experiment.
            src/:
                All .java files from the original os-coursework1.zip, including the five files you modified (Process.java, RRScheduler.java, IdealSJFScheduler.java, FeedbackRRScheduler.java, SJFScheduler.java).
            run.sh or run.bat: A script that can automatically re-run your experiments and generate the output files from the input files and parameter files.

Use 5 different seeds as testing

For example, you can use the workloads discussed during the lectures. ??? Find link to this lecture(s)

Go through and comment the meaning of each line in input and simulator parameters

Time unit is in ms (10: CREATE process 2) e.g: 10ms