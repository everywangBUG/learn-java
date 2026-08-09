
package com.houseRent;
import java.util.Scanner;

public class HouseView {
    private boolean loop = true; //循环变量
    private char key; //用户输入字符
    private HouseService houseService = new HouseService(10);
    public void initMenu() {
        houseService.setHouseList(2);
        do {
            this.initInterface();
            Scanner sc = new Scanner(System.in);
            int key = sc.nextInt();
            switch(key) {
                case 1:
                    addHouse();
                    break;
                case 2:
                    searchHouseInfo();
                    break;
                case 3:
                    deleteHouseInfo();
                    break;
                case 4:
                    updateHouseInfo();
                    break;
                case 5:
                    showHouseList();
                    break;
                case 6:
                    Utility.readConfirmSelection("请输入Y或者N");
                    System.out.println("您已退出系统~");
                    loop = false;
                    break;
            }
        } while(loop);
    }

    public void initInterface() {
        System.out.println("====================房屋出租系统====================");
        System.out.println("                    1.新 增 房 源");
        System.out.println("                    2.查 找 房 源");
        System.out.println("                    3.删 除 房 源");
        System.out.println("                    4.修 改 房 屋 信 息");
        System.out.println("                    5.房 屋 列 表");
        System.out.println("                    6.退 出");
        System.out.println("请输入你的选择");
    }

    // 查看房屋列表
    public void showHouseList() {
        System.out.println("====================房屋列表====================");
        System.out.println("id\t\t业主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houseList = houseService.getHouseList();
        for (int i = 0; i < houseList.length; i++) {
            if (houseList[i] == null) {
                break;
            }
            System.out.println(houseList[i]);
        }
    }

    // 根据id属性查找某个房屋信息
    public void searchHouseInfo() {
        System.out.println("====================查找房屋====================");

        int searchId = Utility.readInt("请输入查询id：");
        House searchedHouse = houseService.searchHouseById(searchId);
        if (searchedHouse != null) {
            System.out.println("====================查找房屋成功====================");
            System.out.println(searchedHouse);
        }
    }

    // 根据id删除某个房屋信息
    public void deleteHouseInfo() {
        System.out.println("====================删除房屋====================");
        int deleteId = Utility.readInt("请输入删除房屋id：");
        boolean isDeleteSuccess = houseService.deleteHouseById(deleteId);
        if (isDeleteSuccess) {
            System.out.println("====================删除房屋成功====================");
            House[] houseList = houseService.getHouseList();
            for (int i = 0; i < houseList.length; i++) {
                System.out.println(houseList[i]);
            }
        } else {
            System.out.println("====================未找到房屋id删除失败====================");
        }
    }

    public void updateHouseInfo() {
        System.out.println("====================修改房屋信息====================");
        int houseId = Utility.readInt("请输入房屋编号id(-1表示退出)");
        if (houseId == -1) {
            System.out.println("输入的房屋编号不存在");
        }
        House house = houseService.searchHouseById(houseId);
        String name = Utility.readString("请输入业主姓名：" + "(" + house.getHouseMaster() + ")", "");
        if (!"".equals(name)) {
            house.setHouseMaster(name);
        }
        String phone = Utility.readString("请输入业主电话：" + "(" + house.getPhone() + ")", "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }
        String address = Utility.readString("请输入地址：" + "(" + house.getAddress() + ")", "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }
        String monthlyRent = Utility.readString("请输入月租：" + "(" + house.getMonthlyRent() + ")", "");
        if (!"".equals(monthlyRent)) {
            house.setMonthlyRent(monthlyRent);
        }
        String status = Utility.readString("请输入状态：" + "(" + house.getStatus() + ")", "");
        if (!"".equals(status)) {
            house.setStatus(status);
        }
        System.out.println("====================修改房屋信息成功====================");
    }

    public void addHouse() {
        String name = Utility.readString("请输入姓名");
        String phone = Utility.readString("请输入电话");
        String address = Utility.readString("请输入地址");
        String rent = Utility.readString("请输入月租");
        String status = Utility.readString("请输入状态");
        House house = new House(1, name, phone, address, rent, status);
        boolean isAddSuccess = houseService.addHouseList(house);
        System.out.println(isAddSuccess ? "====================添加房屋成功====================" : "====================添加房屋失败====================");
    }
}
