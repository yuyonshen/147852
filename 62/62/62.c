#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
struct student{
	char name[20];
	int count;
};
int main(){
	struct student Student[3] = { { "wang", 0 }, { "haha", 0 }, { "heihei", 0 } };
	char name[10];
	int i;
	int j;
	for (i = 0; i < 10; i++){
		scanf("%s",name);
		for (j = 0; j < 3; j++){
			if (strcmp(Student[j].name, name) == 0){
				Student[j].count++;
			}
		}
	}
	for (i = 0; i<3; i++)
	{
		printf("%s,%d\n", Student[i].name, Student[i].count);
	}
	system("pause");
	return 0;
}