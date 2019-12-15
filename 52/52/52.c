//结构体和共用体
/*#include<stdio.h>
#include<stdlib.h>
struct student{
	char name[20];
	char sex;
	int grade;
}student1 = { "hanxue", 'w', 3 };
int main(){
	struct student student2 = { "wangxaio", 'm', 3 };
	printf("the student1's information:\n");
	printf("name.%s\n", student1.name);
	printf("sex.%c\n", student1.sex);
	printf("grade.%d\n", student1.grade);

	printf("the student2's information:\n");
	printf("name.%s\n", student2.name);
	printf("sex.%c\n", student2.sex);
	printf("grade.%d\n", student2.grade);
	system("pause");
	return 0;

}*/
#include<stdio.h>

struct Student								/*学生结构*/
{
	char cName[20];						/*姓名*/
	int  iNumber;						/*学号*/
	char cSex;							/*性别*/
	int iGrade;								/*年级*/
} student[5] = { { "WangJiasheng", 12062212, 'M', 3 },
{ "YuLongjiao", 12062213, 'W', 3 },
{ "JiangXuehuan", 12062214, 'W', 3 },
{ "ZhangMeng", 12062215, 'W', 3 },
{ "HanLiang", 12062216, 'M', 3 } };	/*定义数组并设置初始值*/

int main()
{
	int i;					/*循环控制变量*/
	for (i = 0; i<5; i++)		/*使用for进行5次循环*/
	{
		printf("NO%d student:\n", i + 1);		/*首先输出学生的名次*/
		printf("Name: %s, Number: %d\n", student[i].cName, student[i].iNumber);/*使用变量i做下标，输出数组中的元素数据*/
		printf("Sex: %c, Grade: %d\n", student[i].cSex, student[i].iGrade);
		printf("\n");		/*空格行*/
	}
	system("pause");
	return 0;
}