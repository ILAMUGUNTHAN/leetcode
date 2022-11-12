void swap(int *p1,int *p2){
    int temp=*p1;
    *p1=*p2;
    *p2=temp;
}
void reverse(int *a,int s,int e){
    while(s<e){
        swap(&a[s++],&a[e--]);
    }
}
void rotate(int* a, int n, int k){
    k=k%n;
    reverse(a,0,n-k-1);
    reverse(a,n-k,n-1);
    reverse(a,0,n-1);
}