long maxAddress=256256256256;
vector<int> digits;
long res;

void utilIPV4(int i,int cnt,int n) {
    if(i==n && cnt==4) {
        res++;
        return ;
    }
    
    if(i>=n || cnt>=4)
        return;
    
    //one digit
    utilIPV4(i+1,cnt+1,n);

    //two digit
    utilIPV4(i+2,cnt+1,n);

    //three digit
    int number=digits[i]*100+digits[i+1]*10+digits[i+2];
    if(number>=0 && number<=255)
        utilIPV4(i+3,cnt+1,n);
}

long numberOfIPV4(int n) {  
    res=0;
    if(n>maxAddress && n<1000)
        return 0;   

    int m=n;
    while(m>0) {
        digits.push_back(m%10);
        m=m/10;
    }

    reverse(digits.begin(),digits.end());
    utilIPV4(0,0,digits.size());
    return res;
}