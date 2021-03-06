package com.afunms.monitor.item;

import java.util.List;

import com.afunms.monitor.item.base.MonitoredItem;
import com.afunms.topology.model.NodeMonitor;

@SuppressWarnings("unchecked")
public class UPSItem extends MonitoredItem {
	private List phasesList;
	private int devicesNumber; // 连接设备数
	private int batteryLevel; // 电池蓄电
	private int batteryVoltage; // 电池电压
	private int upsLoad; // ups负载，为输出三相负载之和(功率W)
	private int upsRatedLoad; // 额定负载(功率W)
	private int batteryTime; // 断电时，ups能供电的时间
	private int lowBatteryLevel; // 蓄电下降到多少后，ups准备关闭
	private boolean batteryFault; // 电池是否有故障
	private boolean batteryLow; // 电池低电量
	private boolean batteryChargerFault; // 电池充电器是否有故障
	// ---------最重要的两个参数--------------
	private boolean outputOnBattery; // 如果电池在用,说明市电断电
	private boolean outputOnByPass; // 如果旁路在用,说明UPS有故障
	private boolean overLoad; // 输出(功率)是否超载

	public UPSItem() {
	}

	public int getBatteryLevel() {
		return batteryLevel;
	}

	public int getBatteryTime() {
		return batteryTime;
	}

	public int getBatteryVoltage() {
		return batteryVoltage;
	}

	public int getDevicesNumber() {
		return devicesNumber;
	}

	public int getLowBatteryLevel() {
		return lowBatteryLevel;
	}

	public List getPhasesList() {
		return phasesList;
	}

	public int getUpsLoad() {
		return upsLoad;
	}

	public int getUpsRatedLoad() {
		return upsRatedLoad;
	}

	public boolean isBatteryChargerFault() {
		return batteryChargerFault;
	}

	public boolean isBatteryFault() {
		return batteryFault;
	}

	public boolean isBatteryLow() {
		return batteryLow;
	}

	public boolean isOutputOnBattery() {
		return outputOnBattery;
	}

	public boolean isOutputOnByPass() {
		return outputOnByPass;
	}

	public boolean isOverLoad() {
		return overLoad;
	}

	@Override
	public void loadSelf(NodeMonitor nm) {
		loadCommon(nm);
	}

	public void setBatteryChargerFault(boolean batteryChargerFault) {
		this.batteryChargerFault = batteryChargerFault;
	}

	public void setBatteryFault(boolean batteryFault) {
		this.batteryFault = batteryFault;
	}

	public void setBatteryLevel(int batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	public void setBatteryLow(boolean batteryLow) {
		this.batteryLow = batteryLow;
	}

	public void setBatteryTime(int batteryTime) {
		this.batteryTime = batteryTime;
	}

	public void setBatteryVoltage(int batteryVoltage) {
		this.batteryVoltage = batteryVoltage;
	}

	public void setDevicesNumber(int devicesNumber) {
		this.devicesNumber = devicesNumber;
	}

	public void setLowBatteryLevel(int lowBatteryLevel) {
		this.lowBatteryLevel = lowBatteryLevel;
	}

	public void setOutputOnBattery(boolean outputOnBattery) {
		this.outputOnBattery = outputOnBattery;
	}

	public void setOutputOnByPass(boolean outputOnByPass) {
		this.outputOnByPass = outputOnByPass;
	}

	public void setOverLoad(boolean overLoad) {
		this.overLoad = overLoad;
	}

	public void setPhasesList(List phasesList) {
		this.phasesList = phasesList;
	}

	public void setUpsLoad(int upsLoad) {
		this.upsLoad = upsLoad;
	}

	public void setUpsRatedLoad(int upsRatedLoad) {
		this.upsRatedLoad = upsRatedLoad;
	}
}
