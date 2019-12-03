#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
struct student{//结构体数组的引用
	int num;
	char name[15];
	int score[3];
}stu[] = { { 1, "david", { 80, 78, 92 } }, { 2, "lily", { 90, 84, 89 } }, { 3, "alice", { 79, 78, 96 } } };
void main(){
	int i, j, num;
	printf("input student's number:");
	scanf("%d", &num);
	for (i = 0; i < 3; i++)
		if (num == stu[i].num)
			break;
			printf("name=%s\n", stu[i].name);
		for (j = 0; j < 3; j++)
			printf("%d ", stu[i].score[j]);
		printf("\n");
	system("pause");
}