#include <iostream>
using namespace std;
int main(void)
{
    //시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
    int grade;
    cin>>grade;
    if(grade>=90 && grade<=100)
        cout<<"A";
    else if(grade>=80 && grade<90)
        cout<<"B";
    else if(grade>=70 && grade<80)
        cout<<"C";
    else if(grade>=60 && grade<70)
        cout<<"D";
    else
        cout<<"F";
}