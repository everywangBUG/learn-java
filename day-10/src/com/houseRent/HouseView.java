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
            switch(key) {
                case 1:
                    addHouse();
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    showHouseList();
                    break;
                case 6:
                    System.out.println("6");
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

    // 查看房屋信息
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

    public void addHouse() {
        String name = Utility.readString("请输入姓名",1, 10);
        String phone = Utility.readString("请输入电话",1, 11);
        String address = Utility.readString("请输入地址",1, 100);
        String rent = Utility.readString("请输入月租",1, 100);
        String status = Utility.readString("请输入状态",1, 3);
        House house = new House(1, name, phone, address, rent, status);
        boolean isAddSuccess = houseService.addHouseList(house);
        System.out.println(isAddSuccess ? "====================添加房屋成功====================" : "====================添加房屋失败====================");
    }
}
