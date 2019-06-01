def binarySearch(find):
    low = 0
    high = len(arr) - 1

    while (high - low >= 0):
        mid = (low + high) // 2
        
        if (arr[mid] == find):
            return (mid)
        if (arr[mid] > find):
            high = mid - 1
        if (arr[mid] < find):
            low = mid + 1
    return -1

arr = [3,6,8,15,20,23]
index = binarySearch(23)
print (index)