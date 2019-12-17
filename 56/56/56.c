//链表
//链表储存数据最大的好处是不受限制
//链表这种数据结构中，必须利用指针才能实现，因此链表中的节点应该包含一个指针变量来保存下一个节点
//malloc函数是一个动态函数
//void *malloc（unsigned int size
#include<stdio.h>
#define  _CRT_SECURE_NO_WARNINGS
struct person
{
	char name[20];
	int count;
};

int main()
{
	struct person Person[3] = { { "Wang", 0 }, { "Liu", 0 }, { "Su", 0 } };
	char name[10];
	int i, j;
	for (i = 0; i<10; i++)
	{
		scanf("%s", name);
		for (j = 0; j<3; j++)
		{
			if (strcmp(Person[j].name, name) == 0)
			{
				Person[j].count++;
			}
		}
	}

	for (i = 0; i<3; i++)
	{
		printf("%s,%d\n", Person[i].name, Person[i].count);
	}
	return 0;
}