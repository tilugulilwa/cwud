
package CourseInterface;
import helper.StudentView;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
//Interface which defines remote methods.
public interface CourseInterface extends Remote{
    public  ArrayList<StudentView > diplayStudentScores (String paramRegNumber,int paramYear, int paramSemester) throws RemoteException;
    public  ArrayList<StudentView > displayStudentsPerCourse (String paramCourseCode,int paramYear, int paramSemester) throws RemoteException;
}
