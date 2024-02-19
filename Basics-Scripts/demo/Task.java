  

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Task implements Priority, Complexity, Comparable{

    private Integer priorityNum;
    private String thingToBeDone;
    private int thingComplexity;

    public Task(String task){
        thingToBeDone = task;
    }

    public void setPriority(int priority){
        priorityNum = priority;
    }

    public int getPriority(){
        return priorityNum;
    }

    public String getTask(){
        return thingToBeDone;
    }

    public void setComplexity(int complexity){
        thingComplexity = complexity;
    }

    public int getComplexity(){
        return thingComplexity;
    }

    public int compareTo(Object obj){
        Task thisTask = (Task)obj;
        return (this.priorityNum).compareTo(thisTask.priorityNum);
    }

}