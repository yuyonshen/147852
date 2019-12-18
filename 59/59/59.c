//链表的插入使用
//链表的删除使用
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
struct student{
	char name[20];
	int num;
	struct student* pnext;
};
int count;
struct student* create(){
	struct student* phead = NULL;
	struct student* pend, *pnew;
	count=0;
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
			phead = pnew;
		}
		pnew = (struct student*)malloc(sizeof(struct student));
		scanf("%s", &pnew->name);
		scanf("%d", &pnew->num);
	}
	free(pnew);
	return phead;
}
void print(struct student* phead){
	struct student* ptemp;
	int ilndex = 1;
	printf("---the list has %d members:---\n", count);
	printf("\n");
	ptemp = phead;
	while (ptemp != NULL){
		printf("the no %d member is:\n", ilndex);
		printf("the name is:%s\n", ptemp->name);
		printf("the number is:%d\n", ptemp->num);
		printf("\n");
		ptemp = ptemp->pnext;
		ilndex++;
	}
}
struct student* insert(struct student* phead){
	struct student* pnew;
	printf("---insert member at first---\n");
	pnew = (struct student*)malloc(sizeof(struct student));
	scanf("%s", &pnew->name);
	scanf("%d", &pnew->num);
	pnew->pnext = phead;
	phead = pnew;
	count++;
	return phead;
}
void Delete(struct student* phead, int ilndex){
	int i;
	struct student* ptemp;
	struct student* ppre;
	ptemp = phead;
	ppre = ptemp;
	printf("---delete no%d mumber---\n", ilndex);
	for (i =1; i < ilndex; i++){
		ppre = ptemp;
		ptemp = ptemp->pnext;

	}
	ppre->pnext = ptemp->pnext;
	free(ptemp);
	count--;

}
int main(){
	struct student* phead;
	phead = create();
	phead = insert(phead);
	Delete(phead, 2);
	print(phead);
	system("pause");
	return 0;
}
