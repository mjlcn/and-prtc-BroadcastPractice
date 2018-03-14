package com.jialin.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Administrator on 2018/3/12 0012.
 */

public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finshAll(){
        for(Activity activity:activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }

}
