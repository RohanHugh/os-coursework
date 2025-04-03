import java.util.LinkedList;
import java.util.Properties;
import java.util.Queue;

// Priority queue.
// Check when process is finished & Check if it blocks (Non-premptive)
// Burst time

/**
 * Ideal Shortest Job First Scheduler
 * 
 * @version 2017
 */
public class IdealSJFScheduler extends AbstractScheduler {

  // TODO
  private Queue<Process> readyQueue = new LinkedList<>();


  /**
   * Adds a process to the ready queue.
   * usedFullTimeQuantum is true if process is being moved to ready
   * after having fully used its time quantum.
   */
  public void ready(Process process, boolean usedFullTimeQuantum) {

    // TODO
    readyQueue.add(process);

  }

  /**
   * Removes the next process to be run from the ready queue 
   * and returns it. 
   * Returns null if there is no process to run.
   */
  public Process schedule() {

    // TODO

    return null;
  }

  public boolean isPremptive(){
    return false;
  }

}
