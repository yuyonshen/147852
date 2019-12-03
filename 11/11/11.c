#include<stdio.h>
struct student//指向结构体变量的指针使用
{
	int num;
	char *name;
	char sex;
	float score;
}stu1 = { 102, "zhangping", 'M', 78.5 },*pstu;
void main(){
	pstu = &stu1;
	printf("Number=%d\nName=%s\n", stu1.num, stu1.name);
	printf("Sex=%c\nScore=%f\n\n", stu1.sex, stu1.score);
	printf("Number=%d\nName=%s\n", (*pstu).num, (*pstu).name);
	printf("Sex=%c\nScore=%f\n\n", (*pstu).sex, (*pstu).score);
	printf("Number=%d\nName=%s\n", pstu->num, pstu->name);
	printf("Sex=%c\nScore=%f\n\n", pstu->sex, pstu->score);
	system("pause");
}