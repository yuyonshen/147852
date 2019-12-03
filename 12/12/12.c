#include<stdio.h>
struct student{//利用指针变量输出结构体数组
	int num;
	char *name;
	char sex;
	float score;
}stu[3] = { { 101, "zhao lei", 'M', 45 }, { 102, "sun hui", 'M', 62.5 },
{ 103, "li fang", 'F', 92.5 } };
void main(){
	struct student *ps;
	printf("num\tName\t\tSex\tScore\n");
	for (ps = stu; ps < stu + 3; ps++)
		printf("%d\t%s\t\t%c\t%f\n", ps->num, ps->name, ps->sex, ps->score);
	system("pause");
}