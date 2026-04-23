def solution(numbers, target):
    
    arr = []
    arr.append(numbers[0])
    arr.append(-numbers[0])
    
    for i in range(1,len(numbers)):
        
        temp = []
        
        for num in arr:
            
            temp.append(num + numbers[i])
            temp.append(num - numbers[i])
        
        arr = temp
    
    return(arr.count(target))
            
            
        
        
        
        # 4 -> 3,5 -> 1,5,3,7 -> 0,2,4,6,2,4,6,8