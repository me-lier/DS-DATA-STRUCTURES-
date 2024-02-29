def bsort(arr, n):
  for i in range(n):
    for j in range(n-i-1):
      if(arr[j]>arr[j+1]):
        arr[j], arr[j+1] = arr[j+1], arr[j]
arr=[]
n=int(input("Enter The Size of Array:->"))
for i in range(n):
  e=int(input())
  arr.append(e)

bsort(arr, n)
for i in range(n):
  print(arr[i])
