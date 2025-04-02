@echo off
echo Running InputGenerator...
java -cp target/os-coursework1-1.0-SNAPSHOT.jar InputGenerator experiment1/input_parameters.prp experiment1/inputs.in

echo Running Simulator...
java -cp target/os-coursework1-1.0-SNAPSHOT.jar Simulator experiment1/simulator_parameters.prp experiment1/output.out experiment1/inputs.in

echo Process Completed!
pause
