package copy.localc;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class TaskDriver{


    public static void main(String[] args){
        Task wakeUp = new Task("Wake up");
        Task goToSchool = new Task("Go to School");
        Task goToWork = new Task("Go to Work");
        Task goToGym = new Task("Go to the Gym");
        Task doSchoolStuff = new Task("Do School Stuff");
        Task sleep = new Task("Go to sleep");
        ArrayList taskList = new ArrayList();

        taskList.add(wakeUp);
        taskList.add(sleep);
        taskList.add(goToSchool);
        taskList.add(goToWork);
        taskList.add(goToGym);
        taskList.add(doSchoolStuff);

        wakeUp.setPriority(1);
        wakeUp.setComplexity(10);

        doSchoolStuff.setPriority(5);
        doSchoolStuff.setComplexity(9);

        goToWork.setPriority(3);
        goToWork.setComplexity(7);

        goToGym.setPriority(4);
        goToGym.setComplexity(6);

        goToSchool.setPriority(2);
        goToSchool.setComplexity(4);

        sleep.setPriority(6);
        sleep.setComplexity(0);

        System.out.println("Rank by Task Complexity:\n");
        System.out.println("Task: " + sleep.getTask() + "\nPriority: " + sleep.getPriority()  + "\nComplexity: " + sleep.getComplexity() + "\n");
        System.out.println("Task: " + goToSchool.getTask() + "\nPriority: " + goToSchool.getPriority()  + "\nComplexity: " + goToSchool.getComplexity() + "\n");
        System.out.println("Task: " + goToGym.getTask() + "\nPriority: " + goToGym.getPriority()  + "\nComplexity: " + goToGym.getComplexity() + "\n");
        System.out.println("Task: " + goToWork.getTask() + "\nPriority: " + goToWork.getPriority()  + "\nComplexity: " + goToWork.getComplexity() + "\n");
        System.out.println("Task: " + doSchoolStuff.getTask() + "\nPriority: " + doSchoolStuff.getPriority()  + "\nComplexity: " + doSchoolStuff.getComplexity() + "\n");
        System.out.println("Task: " + wakeUp.getTask() + "\nPriority: " + wakeUp.getPriority()  + "\nComplexity: " + wakeUp.getComplexity() + "\n");

        System.out.println("//////////////////////////////////////////////////////////////////////\nRank by Task Priority:\n");

        Collections.sort(taskList);
        Iterator iterator = taskList.iterator();
        while(iterator.hasNext()){
            Task task = (Task)iterator.next();
            System.out.println("Task: " + task.getTask() + "\nPriority: " + task.getPriority()  + "\nComplexity: " + task.getComplexity() + "\n");
        }

        System.out.println(wakeUp.compareTo(sleep));
    }
}