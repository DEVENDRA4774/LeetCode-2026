class Solution{
 public ListNode insertionSortList(ListNode h){
  ListNode d=new ListNode(0);
  while(h!=null){
   ListNode c=h; h=h.next;
   ListNode p=d;
   while(p.next!=null&&p.next.val<c.val)p=p.next;
   c.next=p.next; p.next=c;
  }
  return d.next;
 }
}
