package Model.Service;

import Model.Entity.PlanEntity;
import Model.Entity.UserEntity;
import Model.Repository.UserRepo;

import java.sql.SQLException;

public class UserService {
    private static UserService instance = new UserService();
    private UserService() {}
    public static UserService getInstance() {
        return instance;
    }
    public boolean userExists(UserEntity userEntity)  {
        UserRepo userRepo = new UserRepo();
        if(userRepo.getUserStatus(userEntity)==null){
            return false;
        }else{return true;}
    }
    public int userData(UserEntity userEntity){
        UserRepo userRepo = new UserRepo();
        int d =userRepo.getUserStatus(userEntity).getSize();
        return  d;
    }
    public int userCash(UserEntity userEntity){
        UserRepo userRepo = new UserRepo();
        return  userRepo.getUserStatus(userEntity).getPrice();
    }
    public void addPlan(UserEntity userEntity, PlanEntity planEntity){
        UserRepo userRepo = new UserRepo();
        try {
            userRepo.addPlan(userEntity,planEntity);
            userRepo.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
