//Search an element in sorted and pivoted (rotated) array

//return index of target value
int findTargetInSortedAndRotatedArray(int a[],int n) {
	int l=0;
	int r=n-1;

	while(l<=r) {
		int mid=l+(r-l)/2;
		if(a[mid]==target)
			return mid;

		if(a[mid]<a[0]) { //lie on the left side of rotated array
			if(target<a[mid])
				r=mid-1;
			else if(target>a[mid] && target<a[0])
				l=mid+1;
			else if(target>a[mid] && target>a[0])
				r=mid-1;
		} else {
			if(target>a[mid])
				l=mid+1;
			else if(target<a[mid] && target>a[0])
				r=mid-1;
			else if(target<a[mid] && target<a[0])
				l=mid+1;
		}
	}

	return -1; //Not found
}
