//�ṹ��͹�����
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

struct Student								/*ѧ���ṹ*/
{
	char cName[20];						/*����*/
	int  iNumber;						/*ѧ��*/
	char cSex;							/*�Ա�*/
	int iGrade;								/*�꼶*/
} student[5] = { { "WangJiasheng", 12062212, 'M', 3 },
{ "YuLongjiao", 12062213, 'W', 3 },
{ "JiangXuehuan", 12062214, 'W', 3 },
{ "ZhangMeng", 12062215, 'W', 3 },
{ "HanLiang", 12062216, 'M', 3 } };	/*�������鲢���ó�ʼֵ*/

int main()
{
	int i;					/*ѭ�����Ʊ���*/
	for (i = 0; i<5; i++)		/*ʹ��for����5��ѭ��*/
	{
		printf("NO%d student:\n", i + 1);		/*�������ѧ��������*/
		printf("Name: %s, Number: %d\n", student[i].cName, student[i].iNumber);/*ʹ�ñ���i���±꣬��������е�Ԫ������*/
		printf("Sex: %c, Grade: %d\n", student[i].cSex, student[i].iGrade);
		printf("\n");		/*�ո���*/
	}
	system("pause");
	return 0;
}