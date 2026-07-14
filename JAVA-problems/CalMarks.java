class CalMarks{
    int phy;
    int chem;
    int math;
    int bio;
    int social;

double total(int phy, int chem, int math, int bio, int social){
    return phy+chem+math+bio+social;
}
public static void main(String[]args){
    CalMarks marks=new CalMarks();
    marks.phy=90;
    marks.chem=80;
    marks.math=70;
    marks.bio=60;
    marks.social=50;
    double totalMarks=marks.total(marks.phy, marks.chem, marks.math, marks.bio, marks.social);
    System.out.println("Total marks: "+totalMarks);
    }
}