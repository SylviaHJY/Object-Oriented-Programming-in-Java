package TeamProject.Service;

import TeamProject.domain.Architect;
import TeamProject.domain.Designer;
import TeamProject.domain.Employee;
import TeamProject.domain.Programmer;

/**
 * 关于开发团队成员的管理、添加、删除等。
 */
public class TeamService {
    private static int counter = 1; //给memberID赋值使用；
    private final int MAX_MEMBER = 5; // 限制开发团队的人数；
    private Programmer[] team = new Programmer[MAX_MEMBER]; //保存开发团队成员；
    private int total; //记录开发团队中实际的人数；

    public TeamService(){
        super();
    }

    //获取开发团队所以的成员：
    public Programmer[] getTeam(){
         Programmer[] team = new Programmer[total]; //原来的数组可能存不满，新造一个数组把现有的团队成员放进来；
         for(int i = 0; i < team.length; i++){
             team[i] = this.team[i];
         }
        return team;
    }

    //将指定的员工添加到开发团队中：
    public void addMember(Employee e) throws TeamException{
//        成员已满，无法添加；
        if(total >= MAX_MEMBER){
            throw new TeamException("Team Full, no available seats!");
        }
//        该成员不是开发人员，无法添加；
        if (!(e instanceof Programmer)){
            throw new TeamException("This member doesn't meet developer requirements.");
        }
//        该员工已在开发团队中；
        if(isExist(e)){ //写个方法遍历开发团队判断是否已经在开发团队中；
            throw new TeamException("This member already exist!");
        }

//        该员工已是某团队成员；//根据状态判断；
//        该员工正在休假，无法添加；
        Programmer p = (Programmer) e; // 能走到这步说明一定是programmer类型，不会出现 ClassCasException,可以强转；
        if("UNAVAILABLE".equalsIgnoreCase(p.getStatus().getNAME())){ //忽略大小写
            throw new TeamException("This member is unavailable.");
        }else if("VACATION".equalsIgnoreCase(p.getStatus().getNAME())){ //忽略大小写
            throw new TeamException("This member is on vacation.");
        }

//        团队中至多只能有一名构造师；
//        团队中至多只能有两名设计师；
//        团队中至多只能有三位程序员；

        int numOfArch = 0, numberOfDes = 0, numberOfPro = 0;
        for(int i = 0; i < total; i++){
            //先判断范围小的：
            if(team[i] instanceof Architect){
                numOfArch++;
            }else if(team[i] instanceof Designer){
                numberOfDes++;
            }else if(team[i] instanceof Programmer){
                numberOfPro++;
            }
        }

        if(p instanceof Architect){
            if(numOfArch >= 1){
                throw new TeamException("One architect position is occupied.");
            }
        }else if(p instanceof Designer){
            if(numberOfDes >= 2){
                throw new TeamException("Two designers positions are occupied.");
            }
        }else if(p instanceof Programmer){
            if(numberOfPro >= 3){
                throw new TeamException("Three programmer positions are occupied.");
            }
        }

        //直到走到这步，将p(或e）添加进Team中：
        team[total++] = p; // 即：team[total] = p; total++; total默认初始值是0；
        //p的属性的赋值：
        p.setStatus(Status.UNAVAILABLE); //Status类调构造器；
        p.setMemberID(counter++);
    }

    //
    public void removeMember(int memberID) throws TeamException{
        int i = 0;
        for(;i < total; i++){
            if(team[i].getMemberID() == memberID){
                team[i].setStatus(Status.AVAILABLE); //删除以后，状态变成available;
                break; //找到以后通过break循环, 没有找到则通过i = total的情况退出循环；
            }
        }

        //未找到指定memberID情况：
        if(i == total){ //如果循环结束后i还是等于total，说明没找到：
            throw new TeamException("This member doesn't exist, cannot be deleted.");
        }

        //后面的元素覆盖前面一个元素实现删除操作，最后一个元素置空：
        for(int j = i; j < total-1; j++){
            team[j] = team[j+1]; //后面的元素往前移；
        }
        team[total - 1] = null; //把最后一个元素设置成null;
        total--; //不要忘记total--;
        // 合写成：team[--total] = null;
    }

    private boolean isExist(Employee e){
        for(int i = 0; i < total; i++){
           return team[i].getId() == e.getId();
        }
        return false;
    }

}
