/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dikshadesai
 */
public class WorkQueue {
    
    private List<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public List<WorkRequest> getWorkRequestList() {
        if(workRequestList == null){
            workRequestList = new ArrayList();
        }
        return workRequestList;
    }
}
