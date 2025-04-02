import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Queue;
import java.util.LinkedList;
// Time quantum, basically run for a set amount of time, because it's non-preemptive will do time quantum or until
// it finishes it work

/**
 * Round Robin Scheduler
 * 
 * @version 2017
 */
public class RRScheduler extends AbstractScheduler {

  private Queue<Process> readyQueue;
  private int timeQuantum;

  // TODO
  public RRScheduler() {
    this.readyQueue = new LinkedList<>();
    this.timeQuantum = loadTimeQuantumFromFile();
  }

  private int loadTimeQuantumFromFile(){
    Properties properties = new Properties();
    try{
      FileInputStream input = new FileInputStream("experiment1/simulator_parameters.prp");
      properties.load(input);

      String timeQuantumStr = properties.getProperty("timeQuantum");
      System.out.println(Integer.parseInt(timeQuantumStr));
      return Integer.parseInt(timeQuantumStr); // conver to string
    }
    catch (IOException | NumberFormatException e) {
      e.printStackTrace();

      // For whatever reason if it's not set
      return 20;
    }
  }

  /**
   * Adds a process to the ready queue.
   * usedFullTimeQuantum is true if process is being moved to ready
   * after having fully used its time quantum.
   */
  public void ready(Process process, boolean usedFullTimeQuantum) {

    // TODO


  }

  /**
   * Removes the next process to be run from the ready queue 
   * and returns it. 
   * Returns null if there is no process to run.
   */
  public Process schedule() {

    // TODO
    if (readyQueue.isEmpty()){
      return null; // No process to schedule
    }
    Process currentProcess = readyQueue.poll();

    runProcess(currentProcess);

    if (!currentProcess.isFinished()){
      readyQueue.offer(currentProcess);
    }
    return currentProcess;
  }
}