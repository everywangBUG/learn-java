
package com.houseRent;
import java.util.Scanner;

public class HouseView {
    private boolean loop = true; //循环变量
    private char key; //用户输入字符
    private HouseService houseService = new HouseService(10);
    public void initMenu() {
        do {
            this.initInterface();
            Scanner sc = new Scanner(System.in);
            int key = sc.nextInt();
            houseService.setHouseList(2);
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
                    System.out.println("4");
                    break;
                case 5:
                    showHouseList();
                    break;
                case 6:
                    System.out.println("退出系统成功");
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

        String searchId = Utility.readString("请输入查询id：", 10, 10, "int");
        House searchedHouse = houseService.searchHouseById(searchId);
        if (searchedHouse != null) {
            System.out.println("====================查找房屋成功====================");
            System.out.println(searchedHouse);
        }
    }

    // 根据id删除某个房屋信息
    public void deleteHouseInfo() {
        System.out.println("====================删除房屋====================");
        String deleteId = Utility.readString("请输入删除房屋id：", 10, 10, "int");
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

    public void addHouse() {
        String name = Utility.readString("请输入姓名",1, 10, "string");
        String phone = Utility.readString("请输入电话",1, 11, "string");
        String address = Utility.readString("请输入地址",1, 100, "string");
        String rent = Utility.readString("请输入月租",1, 100, "string");
        String status = Utility.readString("请输入状态",1, 3, "string");
        House house = new House(1, name, phone, address, rent, status);
        boolean isAddSuccess = houseService.addHouseList(house);
        System.out.println(isAddSuccess ? "====================添加房屋成功====================" : "====================添加房屋失败====================");
    }
}
