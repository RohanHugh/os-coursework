Useful links:

* Discussion https://canvas.sussex.ac.uk/courses/32016/discussion_topics/422539

* Assignment https://canvas.sussex.ac.uk/courses/32016/pages/assignment-brief-cpu-scheduling

* Report https://docs.google.com/document/d/13I0oWljWTlyUC_2-FGeXO28japALxIxC8xjj9gVMDso/edit?tab=t.0

* Lectures:
  https://sussex.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=d274c080-0c1e-4b2d-9bc7-b28b00d64645
  https://sussex.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=e905de1e-52b2-47fd-8a07-b28f0135ff7e
  https://sussex.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=c521a89c-0566-4fb0-bb17-b29200f0ce4e

<br>
Goals:

    [] Report
    [] Round Robin (RRScheduler.java) - Read the timeQuantum from the parameters. The scheduler is non-preemptive*.
    [] Ideal Shortest Job First (IdealSJFScheduler.java) - You can use the getNextBurst() method to get the duration of the next burst for each process. The scheduler is non-preemptive.
    [] Multi-level feedback queue with Round Robin (FeedbackRRScheduler.java) - The easiest way to compute a multi-level queue is to use a priority queue where priorities correspond to the levels (lower number means higher priority). Implement the following feedback: a process is demoted if it used its full time slice. The scheduler is preemptive.
    [] Shortest Job First using exponential averaging (SJFScheduler.java) - Read the initialBurstEstimate () and alphaBurstEstimate () from the parameters. For each process,  use exponential averaging to estimate the duration of the process' next burst (which will then define the priority of the process) from its previous burst durations. You can use the getRecentBurst() method to get the duration of the most recent CPU burst of a process. The scheduler is non-preemptive.

Remark: Note that there are placeholders, as TODO comments, in the code, where you are expected to add code. You may have to create new or override existing methods as well - all abstract methods in the AbstractScheduler class must be overridden, otherwise your code won't compile. The implementation of the schedulers should be based on the material discussed in the lectures, where they are clearly defined. Do NOT alter the structure of the given classes but only add code where deemed necessary.

*Important: here we say that the RR scheduler is non-preemptive which contradicts what was presented in the lecture. This is because the simulator considers as preemptive a scheduler that will preempt a running process only when a process (new or previously blocked) appears in the ready queue, but not when the allocated time quantum is consumed by a process. Dealing with completed time quanta is done at a different point in the code (setRunning() in the BurstProcess class). The RR scheduler will therefore be dealt with as non-preemptive here, as described above.

<br>
Important Points about Implementation:

    Non-Preemptive vs. Preemptive: Pay close attention to whether an algorithm should be preemptive or non-preemptive. The assignment clarifies that RR should be treated as non-preemptive in their simulator.

    Parameters: Make sure you read the required parameters (e.g., timeQuantum, initialBurstEstimate, alphaBurstEstimate) from the simulator's .prp file.

    Override Abstract Methods: All abstract methods in AbstractScheduler must be overridden in your concrete scheduler implementations.

    Don't Alter Class Structure: You should not change the overall structure of the provided classes. Only add/modify code within the existing structure where needed.

    Debugging: I can add print statements to System.out for debugging, but remove or comment them out before submitting.

<br>
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

<br>
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

<br>
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

<br>
Use 5 different seeds as testing then calculate mean / median (for outliers)

Time unit is in ms (10: CREATE process 2) e.g: 10ms

Get Excel with Office deployment tool on Windows 10 PC for graphs

Use CTRL + F to find all // TODO's