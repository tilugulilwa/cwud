/*
 * This is class which is imlements all the remote fuctions to be invoked by the remote client.
 * 
 */
package CourseImplementation;

import CourseInterface.CourseInterface;
import helper.StudentView;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class CourseImplementation extends UnicastRemoteObject implements CourseInterface{
String dbUrl = "jdbc:mysql://localhost:3306/cw";
    String usr = "root";
    String pwd = "frank";
    
    public CourseImplementation() throws RemoteException{
        
    }
    
    
    //Check if the file courseCode being loaded does exist in the database.
    public Boolean verify(String paramCourseCode){
        Boolean answer = true;
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection(dbUrl, usr, pwd);
            Statement stmt = con.createStatement();
            
            String sql = "SELECT courseCode, courseName FROM courses WHERE courseCode='"+paramCourseCode+"';";

            ResultSet rs = stmt.executeQuery(sql);
            
            answer = rs.next();
            rs.close();
            stmt.close();
            con.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return answer;
    }
    
    //Function to load courses from the coursework file of a particular subject.
    public Boolean loadCourseWork(String paramRegNumber,String paramCourseCode,
            int paramCalenderYear, int paramSemester,  int paramTest1Score, int paramTest2Score,
            int paramAssignment1Score, int paramAssignment2score, int paramPresentationScore){
        
        Boolean answer = false;
        
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection(dbUrl, usr, pwd);
            Statement stmt = con.createStatement();
            
            String sql ="INSERT INTO scores VALUES( null,'"+paramRegNumber+"', '"+paramCourseCode+"', '"
                    +paramCalenderYear+"',  '"+paramSemester+"', '"
                    +  paramTest1Score+"','"+paramTest2Score+"',\n" +
                " '"+ paramAssignment1Score+"','"+paramAssignment2score+"', '"+paramPresentationScore+"');";
 
           int insert = stmt.executeUpdate(sql);            
           if (insert > 0) {
               
               answer = true;
           }
       
            stmt.close();
            con.close();           
        }catch(Exception e){
            e.printStackTrace();
        } 
        return answer;
    }
    
    //Function to allow overwriting of the loaded file.In case the file has the same semester ,course code ,Year and is am active year or current year.
    public void clearRecords(String paramCourseCode, int paramYear, int paramSemester){
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection(dbUrl, usr, pwd);
            Statement stmt = con.createStatement(); 
            
            String sql = "DELETE scores FROM scores INNER JOIN calenderYear ON"
                    + " scores.calenderyear=calenderyear.calenderyear \n" +
                "AND scores.semester = calenderyear.semester\n" +
                "WHERE calenderyear.active=1 AND calenderyear.semester='"+paramSemester+"' "
                    + "AND scores.courseCode='"+paramCourseCode+"' AND scores.calenderyear='"+paramYear+"';";
            
            stmt.executeUpdate(sql);

            stmt.close();
            con.close();            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    //Function to check if the semester is active or not.
    public Boolean isSemesterActive(int paramYear, int paramSemester){
        
        Boolean activeStatus = false;
        
        try{
       
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection(dbUrl, usr, pwd);
            Statement stmt = con.createStatement(); 
            
            String sql = "SELECT active FROM calenderYear WHERE "
                    + "calenderYear='"+paramYear+"' "
                    + "and semester = '"+paramSemester+"' AND "
                    + "active=1";
            
            ResultSet rs = stmt.executeQuery(sql);
            
            activeStatus=rs.next();
            rs.close();
            stmt.close();
            con.close();            
        }catch(Exception e){
            e.printStackTrace();
        }    
        return activeStatus;
    }
    
    //Display particular students course work.
    public  ArrayList<StudentView > diplayStudentScores
        (String paramRegNumber,int paramYear, int paramSemester) throws RemoteException{
        
        ArrayList<StudentView> objList = new ArrayList<StudentView>();
        
        try{
       
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection(dbUrl, usr, pwd);
            Statement stmt = con.createStatement(); 
            
            String sql = "SELECT CONCAT(students.lastname,' ',students.firstname) AS names,"
                    + "courseCode,test1score,test2score,assignment1Score, assignment2Score ,presentationScore "
                    + "FROM scores,students "
                    + "WHERE students.registrationNumber=scores.registrationNumber "
                    + "AND scores.registrationNumber ='"+paramRegNumber+"' "
                    + "AND scores.calenderYear ='"+paramYear+"'  "
                    + "AND scores.semester= '"+paramSemester+"';";

            
            ResultSet rs = stmt.executeQuery(sql);
            
            
            while(rs.next()){
                StudentView objStudView = new StudentView();
                objStudView.setNames(rs.getString("names"));
                objStudView.setCourseCode(rs.getString("courseCode"));
                objStudView.setTest1Score(rs.getInt("test1score"));
                objStudView.setTest2Score(rs.getInt("test2score"));
                objStudView.setAssignment1Score(rs.getInt("assignment1Score"));
                objStudView.setAssignment2score(rs.getInt("assignment2Score"));
                objStudView.setPresentationScore(rs.getInt("presentationScore"));
                objList.add(objStudView);
            }
            rs.close();
            stmt.close();
            con.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }          
        
        return objList;
    } 

    //Function to display course work of students per course,year,Semester
    public  ArrayList<StudentView > displayStudentsPerCourse
        (String paramCourseCode,int paramYear, int paramSemester) throws RemoteException{
        
        ArrayList<StudentView> objList = new ArrayList<StudentView>();
        
        try{
       
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection(dbUrl, usr, pwd);
            Statement stmt = con.createStatement(); 
            
            String sql = "SELECT CONCAT(students.lastname,' ',students.firstname) AS names,"
                    + "courseCode,test1score,test2score,assignment1Score, assignment2Score ,presentationScore "
                    + "FROM scores,students "
                    + "WHERE students.registrationNumber=scores.registrationNumber "
                    + "AND scores.courseCode ='"+paramCourseCode+"' "
                    + "AND scores.calenderYear ='"+paramYear+"'  "
                    + "AND scores.semester= '"+paramSemester+"';";
            
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                StudentView objStudView = new StudentView();
                objStudView.setNames(rs.getString("names"));
                objStudView.setCourseCode(rs.getString("courseCode"));
                objStudView.setTest1Score(rs.getInt("test1score"));
                objStudView.setTest2Score(rs.getInt("test2score"));
                objStudView.setAssignment1Score(rs.getInt("assignment1Score"));
                objStudView.setAssignment2score(rs.getInt("assignment2Score"));
                objStudView.setPresentationScore(rs.getInt("presentationScore"));
                objList.add(objStudView);
            }
            rs.close();
            stmt.close();
            con.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }        
        return objList;
    }       
}
