package pageHandle;

import base.BaseDriver;
import pageOperate.*;
import utils.TimeWaitingMethod;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public class WorkOrderPageHandle {
    private WorkOrderCommonPageOperation workOrderCommonPageOperation;
    private WorkOrderMyUnResolvePageOperation workOrderMyUnResolvePageOperation;
    private WorkOrderMyResolvePageOperation workOrderMyResolvePageOperation;
    private WorkOrderMyCreatePageOperation workOrderMyCreatePageOperation;
    private WorkOrderAllPageOperation workOrderAllPageOperation;
    private CreateNewWorkOrderPageOperation createNewWorkOrderPageOperation;
    private ModifyWorkOrderPageOperation modifyWorkOrderPageOperation;

    public WorkOrderPageHandle(BaseDriver baseDriver){
        this.workOrderAllPageOperation = new WorkOrderAllPageOperation(baseDriver);
        this.workOrderCommonPageOperation = new WorkOrderCommonPageOperation(baseDriver);
        this.workOrderMyCreatePageOperation = new WorkOrderMyCreatePageOperation(baseDriver);
        this.workOrderMyResolvePageOperation = new WorkOrderMyResolvePageOperation(baseDriver);
        this.workOrderMyUnResolvePageOperation = new WorkOrderMyUnResolvePageOperation(baseDriver);
        this.createNewWorkOrderPageOperation = new CreateNewWorkOrderPageOperation(baseDriver);
        this.modifyWorkOrderPageOperation = new ModifyWorkOrderPageOperation(baseDriver);
    }
    public void createNewOrder(String theme, String desc, String receiver, String status){
        workOrderCommonPageOperation.clickCreateWorkOrderButton();
        TimeWaitingMethod.TimeWaiting(3000);
        createNewWorkOrderPageOperation.sendKeysToThemeInput(theme);
        createNewWorkOrderPageOperation.sendKeysToDescInput(desc);
        createNewWorkOrderPageOperation.clickReceiverDownList();
        createNewWorkOrderPageOperation.selectOneReceiver(receiver);
        createNewWorkOrderPageOperation.clickStatusDownList();
        TimeWaitingMethod.TimeWaiting();
        createNewWorkOrderPageOperation.selectOneStatus(status);
        createNewWorkOrderPageOperation.clickSubmit();
    }
    public void ModifyWorkOrder(String theme, String desc, String receiver, String status, int index){
        workOrderCommonPageOperation.clickAllMenu();
        TimeWaitingMethod.TimeWaiting(3000);
        workOrderCommonPageOperation.clickOneOperation("编辑", index);
        TimeWaitingMethod.TimeWaiting(3000);
        modifyWorkOrderPageOperation.sendKeysToTheme(theme);
        modifyWorkOrderPageOperation.sendKeysToDesc(desc);
        modifyWorkOrderPageOperation.clickReceiverDownList();
        modifyWorkOrderPageOperation.selectOneReceiver(receiver);
        modifyWorkOrderPageOperation.clickStatusDownList();
        modifyWorkOrderPageOperation.selectOneStatus(status);
        modifyWorkOrderPageOperation.clickReply();
        TimeWaitingMethod.TimeWaiting(2000);
        modifyWorkOrderPageOperation.clickSystemInfo();
        modifyWorkOrderPageOperation.clickEmailInfo();
        modifyWorkOrderPageOperation.sendKeysToReplyInput("回复测试");
        modifyWorkOrderPageOperation.clickConfirmYes();
        TimeWaitingMethod.TimeWaiting(3000);
        modifyWorkOrderPageOperation.clickSubmit();

    }
}
