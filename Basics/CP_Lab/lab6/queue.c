#include<stdio.h>
#include<stdlib.h>

struct Queue{
    int size;
    int f;
    int r;
    int* arr;
};

int isFull(struct queue q){
    if(q.r == q.size - 1) return 1;
    else return 0;
}

int isEmpty(struct queue* q){
    if(q->r == q->f) return 1;
    else return 0;
}

void enqueue(struct queue* q, int val){
    if (isFull(&q)){
        printf("No space available!");
    }

    q->r = q->r + 1;
    q->arr[q->r] = val;
}

int dequeue(struct queue* q){
    int a = -1;
    if (isEmpty(q)){
        printf("No elemet to dequeue!");
    }
    
    q->f = q->f + 1;
    a = q->arr[q->f];

    return a;
}

int main(){
    struct queue q;
    q.size = 100;
    q.f = -1;
    q.r = -1;
    arr = (int*)malloc(q.size * sizeof(int));

    enqueue(&q, 2);
    enqueue(&q, 40);
    enqueue(&q, 40123);
    enqueue(&q, 4032);
}