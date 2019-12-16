//包含结构体的结构
#include<stdlib.h>
#include<stdio.h>
struct date{
	int year;
	int month;
	int day;
};
struct student{
	char name[20];
	int num;
	char sex;
	struct date birthday;
}student = { "suyuqun", 1234567, 'w', {1986,12,6} };
int main(){
	printf("---information---\n");
	printf("name:%s\n", student.name);
	printf("num:%d\n", student.num);
	printf("sex:%c\n", student.sex);
	printf("birthday:%d,%d,%d\n", student.birthday.year, student.birthday.month, student.birthday.day);
	system("pause");
	return 0;
}