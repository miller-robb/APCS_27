public class StepTracker(){
    int steps;
    int days;
    int active;
    int minimum;
    

    public StepTracker(int min){
        minimum=min;
        steps=0;
        days=0;
        active=0;

    }
    public boolean addDailySteps(int step){
        steps=steps+step;
        if(steps>=minimum){
           days=days+1;
            active=active+1;
        }
        else{
            days=days+1
        }
    }
    public int activeDays(){
        return active;
    }
    public double averageSteps(){
        double average=steps/days;
        return average;
    }
    



}