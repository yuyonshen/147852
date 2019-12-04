#include<stdio.h>
struct student//结构体与函数
{
	int num;
	char *name;
	char sex;
	float score;
	char *rank;
};
void grade(struct student *p)
{
	if (p->score < 60)
		p->rank = "PAIL";
	else
		p->rank = "SUCCESS";
}
void print(struct student s)
{
	printf("num=%d\nname=%s\nsex=%c\nscore=%f\nrank=%s\n\n", s.num, s.name, s.sex, s.score, s.rank);

}
void main(){
	struct student stu1 = { 102, "zhang ping", 'M', 78.5 };
	grade(&stu1);
	print(stu1);
	system("pause");
}