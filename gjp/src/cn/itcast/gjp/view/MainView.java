package cn.itcast.gjp.view;

import cn.itcast.gjp.controller.ZhangWuController;
import cn.itcast.gjp.domain.ZhangWu;

import java.util.List;
import java.util.Scanner;

public class MainView {
    private ZhangWuController controller = new ZhangWuController();
    public void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("-------account software-------");
            System.out.println("1.add 2.edit 3. delete 4.search 5.exit");
            System.out.println("please input the function number");
            int choose = sc.nextInt();
            switch(choose){
                case 1:
                    addZhangWu();
                    break;
                case 2:
                    editZhangWu();
                    break;
                case 3:
                    deleteZhangWu();
                    break;
                case 4:
                    selectZhangWu();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
    public void selectZhangWu(){
        System.out.println("1.search all 2.condition search");
        Scanner sc = new Scanner(System.in);
        int selectChooser = sc.nextInt();
        switch(selectChooser){
            case 1:
                selectAll();
                break;
            case 2:
                select();
                break;
        }
    }
    public void selectAll(){
        List<ZhangWu> list = controller.selectAll();
        print(list);
    }

    private void print(List<ZhangWu> list) {
        System.out.println("ID\t\tclass\t\t\taccount\t\t\tmoney\t\ttime\t\t\tdescription");
        for (ZhangWu zw : list) {
            System.out.println(zw.getZwid() + "\t" + zw.getFlname() + "\t\t\t\t" + zw.getZhanghu() + "\t\t" + zw.getMoney() + "\t\t" + zw.getCreatetime() + "\t" + zw.getDescription());
        }
    }

    public void select(){
        System.out.println("xxxx-xx-xx");
        Scanner sc = new Scanner(System.in);
        System.out.println("start date");
        String startDate = sc.nextLine();
        System.out.println("end time");
        String endDate = sc.nextLine();
        List<ZhangWu> list = controller.select(startDate, endDate);
        if(list.size() != 0){
            print(list);
        }else System.out.println("no result");


    }

    public void addZhangWu(){
        System.out.println("add");
        Scanner sc = new Scanner(System.in);
        System.out.println("input flname");
        String flname = sc.nextLine();
        System.out.println("input money");
        double money = sc.nextDouble();
        System.out.println("input account");
        sc.nextLine();//
        String zhanghu = sc.nextLine();
        System.out.println("input date:xxxx-xx-xx");
        String createtime = sc.nextLine();
        System.out.println("input description");
        String description = sc.nextLine();
        ZhangWu zw = new ZhangWu(0,flname,money,zhanghu,createtime,description);
        controller.addZhangWu(zw);
        System.out.println("successfully add");
    }
    public void editZhangWu(){
        selectAll();
        System.out.println("please input data");
        Scanner sc = new Scanner(System.in);
        System.out.println("input ID");
        int zwid = sc.nextInt();
        System.out.println("input flname");
        sc.nextLine();
        String flname = sc.nextLine();
        System.out.println("input money");
        double money = sc.nextDouble();
        System.out.println("input account");
        sc.nextLine();
        String zhanghu = sc.nextLine();
        System.out.println("input date:xxxx-xx-xx");
        String createtime = sc.nextLine();
        System.out.println("input description");
        String description = sc.nextLine();
        ZhangWu zw = new ZhangWu(zwid,flname,money,zhanghu,createtime,description);
        controller.editZhangWu(zw);
        System.out.println("successfully edit");
    }
    public void deleteZhangWu(){
        selectAll();
        System.out.println("input id");
        int zwid = new Scanner(System.in).nextInt();
        controller.deleteZhangWu(zwid);
    }
}
