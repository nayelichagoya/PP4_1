import java.text.DecimalFormat;
public class GoodStudentDriver
{
    // Instance variables
    private double GPA;
    private String firstName;
    private String lastName;
    private int ID;
    private boolean CSS;

    // Constructors
    public GoodStudentDriver(double GPA, String firstName, String lastName, int ID, boolean CSS)
    {
        this.GPA = GPA;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.CSS = CSS;
    } //end full constructor


    //Brain Methods
    public String CreateID ()
    {
        String nums = String.valueOf(ID);
        String firstInitial = firstName.substring(0, 1);
        return firstInitial + lastName + nums.substring(nums.length()-3);
    } // end create id
    //Getters

    public String getfirstName()
    {
        return firstName;
    } //end first name getter

    public String getlastName()
    {
        return lastName;
    } //end last name getter
    public double getGPA()
    {
        return GPA;
    } // end gpa getter
    public int getID()
    {
        return ID;
    } // end ID getter

    public boolean getCSS()
    {
        return CSS;
    } // end CS student


    //Setters
    public void setID(int setID)
    {
        ID = setID;
    }// end ID setter

    public void setGPA(double setGPA)
    {
        GPA = setGPA;
    }// end ID setter


    public double CSGPA ()
    {
        DecimalFormat fmt = new DecimalFormat("0.##");
        if(CSS == true)
        {
            return Double.parseDouble(fmt.format(GPA * 0.15 + GPA));
        }
        return GPA;
    } // end create id


    //  To String
    public String toString()
    {
        String output = "First name: " + firstName +
                "\nLast name: " + lastName +
                "\nGPA: " + GPA +
                "\nID: " + CreateID() +
                "\nCS student: " + CSS;

        return output;
    }
}