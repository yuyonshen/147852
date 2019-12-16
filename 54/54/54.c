//指向结构体数组的指针
/*#include<stdio.h>
struct student{
	char name[20];
	int num;
	char sex;
	int grade;
}student[5] = { { "wangjiaheng", 123, 'm', 3 },
				{ "yulongjiao", 34567, 'w', 3 },
				{ "jiangxuehuan", 65432, 'w', 3 },
				{ "zhangmeng", 9876543, 'w', 3 },
				{ "hanliang", 765432, 'm', 3 } };
int main(){
	struct student* pstruct;
	int index;
	pstruct = student;
	for (index = 0; index < 5; index++){
		printf("No%d student:\n", index + 1);
		printf("name:%s,num:%d\n", pstruct->name, pstruct->num);
		printf("sex:%c,grade:%d\n", pstruct->sex, pstruct->grade);
		printf("\n");
	}
	system("pause");
	return 0;
}*/
//结构体作为函数的参数；
#include<stdlib.h>
#include<stdio.h>
struct student{
	char name[20];
	float score[3];
}student = { "suyuqun", 98.5f, 89.0, 93.5f };
void Display(struct student stu){
	printf("---information---\n");
	printf("name:%s\n", stu.name);
	printf("chinese:%2f\n", stu.score[0]);
	printf("math:%2f\n", stu.score[1]);
	printf("english:%2f\n", stu.score[2]);
	printf("average score:%2f\n", (stu.score[0] + stu.score[1] + stu.score[2]) / 3);

}
int main(){
	Display(student);
	system("pause");
	return 0;
}