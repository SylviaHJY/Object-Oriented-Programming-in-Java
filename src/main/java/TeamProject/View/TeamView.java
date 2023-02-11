package TeamProject.View;

import TeamProject.Service.NameListService;
import TeamProject.Service.TeamException;
import TeamProject.Service.TeamService;
import TeamProject.Util.TSUtility;
import TeamProject.domain.Employee;
import TeamProject.domain.Programmer;

public class TeamView {
    private NameListService listService = new NameListService();
    private TeamService teamService = new TeamService();

    public void enterMainMenu(){
        boolean loopFlag = true;
        char menu = 0;
        while(loopFlag){
            if(menu != '1'){ //先给menu赋值为0；当选择1的时候不展示；
                listAllEmployees();
            }
            System.out.println("1-TeamList 2-AddTeamMember 3-DeleteMember 4-Exit (Please select 1-4): ");
            menu = TSUtility.readMenuSelection();
            switch (menu){
                case'1': //是char, 加了''单引号
                  getTeam();
                  break;

                case'2':
                    addMember();
                    break;

                case'3':
                    deleteMember();
                    break;

                case'4':
                    System.out.println("Are you sure you want to exit (Y/N) : ");
                    char isExit = TSUtility.readConfirmSelection();
                    if(isExit == 'Y'){
                        loopFlag = false;
                    }
                    break;
            }
        }
    }

    // 显示公司所有的员工信息：
    private void listAllEmployees(){
        System.out.println("---------------------Develop Team Application--------------------\n");
        Employee[] employees = listService.getAllEmployees();
        System.out.println("ID\tName\tAge\tSalary\tPosition\tStatus\tBonus\tStock\tEquipment");
        for(int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
        }
        System.out.println("--------------------------------------------------------------------");
    }

    //查看开发团队情况：
    private void getTeam(){
        System.out.println("---------------------Developers Team--------------------------------");
        Programmer[] team = teamService.getTeam();
        if(team == null || team.length == 0){
            System.out.println("There's no developers!");
        }else{
            System.out.println("TID/ID\tName\tAge\tSalary\tPosition\tBonus\tStock\n");
            for(int i = 0; i <team.length; i++){
                System.out.println(team[i].getDetailsForTeam());
            }
        }
        System.out.println("---------------------------------------------------------------------");
    }

    private void addMember(){
        System.out.println("---------------------Adding Members-------------------------------\n");
        System.out.println("Input EmployeeID: ");
        int id = TSUtility.readInt();

        try{
            Employee e = listService.getEmployee(id);
            teamService.addMember(e);
            System.out.println("Employee Added!");
        }catch(TeamException e){
            System.out.println("Cannot be added: " + e.getMessage());
        }
        // 按回车键继续：
        TSUtility.readReturn();

    }

    private void deleteMember(){
        System.out.println("---------------------Deleting Members-------------------------------\n");
        System.out.println("Input TeamMemberID: ");
        int id = TSUtility.readInt();
        System.out.println("Are you sure you want to delete this member?(Y/N): ");
        char isDeleted = TSUtility.readConfirmSelection();
        if(isDeleted == 'N'){
            return;
        }
        try{
            teamService.removeMember(id);
            System.out.println("Employee Deleted!");
        }catch(TeamException e){
            System.out.println("Cannot be deleted: " + e.getMessage());
        }
        TSUtility.readReturn();
    }

    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();
    }
}
