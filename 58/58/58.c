//����Ĵ��������
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
struct student{
	char name[20];
	int num;
	struct student* pnext;
};
int count;
struct student* create(){//��������
	struct student* phead = NULL;
	struct student* pend, *pnew;
	count = 0;
	pend = pnew = (struct student*)malloc(sizeof(struct student));
	printf("please first enter name,then num\n");
	scanf("%s", &pnew->name);
	scanf("%d", &pnew->num);
	while (pnew->num != 0){
		count++;
		if (count == 1){
			pnew->pnext = phead;
			pend = pnew;
			phead = pnew;
		}
		else{
			pnew->pnext = NULL;
			pend->pnext = pnew;
			pend = pnew;
		}
		pnew=(struct student*)malloc(sizeof(struct student));
		scanf("%s", &pnew->name);
		scanf("%d", &pnew->num);
	}
	free(pnew); 
	return phead;
}
void print(struct student* phead){//�������
	struct student *ptemp;
	int ilndex = 1;
	printf("---the list has %d members:---\n", count);
	printf("\n");
	ptemp = phead;
	while (ptemp != NULL){
		printf("the no%d members is:\n", ilndex);
		printf("the name is:%s\n", ptemp->name);
		printf("the number is:%d\n", ptemp->num);
		printf("\n");
		ptemp = ptemp->pnext;
		ilndex++;
	}
}
int main(){//������
	struct student* phead;
	phead = create();
	print(phead);
	system("pause");
	return 0;
}