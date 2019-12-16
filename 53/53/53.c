//结构体指针
//结构体类型 *指针名
//引用方法（*指针名）.成员名
/*#include<stdio.h>
int main(){
	struct student{
	char name[20];
	int num;
	int sex;
	int grade;
}student = { "suyuqun", 12234, 'w', 2 };
	struct student*pstruct;
	pstruct = &student;
	printf("----the student's information---\n");
	printf("name:%s\n", (*pstruct).name);
	printf("num:%d\n", (*pstruct).num);
	printf("sex:%c\n", (*pstruct). sex);
	printf("grade:%d\n", (*pstruct).grade);
	system("pause");
	return 0;
}*/
//student.成员名；
//(*pstruct).成员名；
//pstruct->成员名；
//这三个表示方法是等价的；
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>
struct student{
	char name[20];
	int num;
	char sex;
	int grade;
}student;
int main(){
	struct student* pstruct;
	pstruct = &student;
	strcpy(pstruct->name, "suyuqun");
	pstruct->num = 1324;
	pstruct->sex = 'w';
	pstruct->grade = 2;
	printf("---the student information\n");
	printf("name:%s\n", student.name);
	printf("num:%d\n", student.num);
	printf("sex:%c\n", student.sex);
	printf("grade:%d\n", student.grade);
	system("pause");
	return 0;
}