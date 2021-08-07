public void add(String item){
	
	Node current=head;
	Node n=new Node();
	n.value=item;
	String stringInNode="";
	if(current.next==null){
		current.next=n;
		n.previous=current;
		current.next=null;
	}
	else{
		stringInNode=current.next.value;
		if(item.compareTo(stringInNode)<0){
			n.next=current.next;
			n.previous=current;
			current.next=n;
			current.next.previous=n;
		}else if((item<string)>0){
			current=current.next;
			n.next=current.next;
			n.previous=current;
			if(current.next!=null)
				current.next.previous=n;
			current.next=n;
			
			
			
		}
		else
	}
	
	
	
}