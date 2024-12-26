class Main {
    public static void main(String[] args) {
        int arr[]={3,4,2,7,8};
        int min=arr[0];
        int min2=arr[0];
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>min2 && arr[i]<min)
            {
                min2=arr[i];
            }
        }
        System.out.println(min2);
    }
}