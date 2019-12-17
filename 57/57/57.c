#include<stdio.h>
#include<stdlib.h>

union Category
{
	int iClass;		/*�༶*/
	char position[20];	/*ְ��*/
};

struct Person
{
	char cJob;							/*ְҵ*/
	char cName[20];						/*����*/
	int iNumber;						/*���*/
	char cSex;

	union Category Position;
};

void DisplayStudent(struct Person person)
{
	printf("Job :%c\n", person.cJob);
	printf("Name :%s\n", person.cName);
	printf("Number :%d\n", person.iNumber);
	printf("Sex :%c\n", person.cSex);

	printf("Class :%d\n", person.Position.iClass);
}

void DisplayTeacher(struct Person person)
{
	printf("Job :%c\n", person.cJob);
	printf("Name :%s\n", person.cName);
	printf("Number :%d\n", person.iNumber);
	printf("Sex :%c\n", person.cSex);

	printf("Position :%s\n", person.Position.position);
}

int main()
{
	struct Person person[100];

	person[0].cJob = 'S';
	strcpy(person[0].cName, "LiuWen");
	person[0].cSex = 'G';
	person[0].iNumber = '1';
	person[0].Position.iClass = 1;

	person[1].cJob = 'T';
	strcpy(person[1].cName, "ZhouYu");
	person[1].cSex = 'G';
	person[1].iNumber = 1010;
	strcpy(person[1].Position.position, "Chinese teacher");

	DisplayStudent(person[0]);
	DisplayTeacher(person[1]);
	return 0;
}
#include<stdio.h>

enum Color{ Red = 1, Blue, Green } color;/*����ö�ٱ���������ʼ��*/
int main()
{
	int icolor;			/*�������ͱ���*/
	scanf("%d", &icolor);	/*��������*/
	switch (icolor)		/*�ж�icolorֵ*/
	{
	case Red:		/*ö�ٳ�����Red��ʾ1*/
		printf("the choice is Red\n");
		break;
	case Blue:		/*ö�ٳ�����Blue��ʾ2*/
		printf("the choice is Blue\n");
		break;
	case Green:		/*ö�ٳ�����Green��ʾ3*/
		printf("the choice is Green\n");
		break;
	default:
		printf("???\n");
		break;
	}
	return 0;
}
