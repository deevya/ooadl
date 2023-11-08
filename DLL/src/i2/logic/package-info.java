package i2.logic;
System.out.print("          Which element you want to delete ? ");
String key1 = inp3.next();

// check if list is empty

if (list.head == null) {
	System.out.print("          The list is empty ... ");
} else {

	if (key1 == list.head.data) {

		System.out.println("          This is head node of the list . \n Do you want to delete head node ?");
		System.out.println("          1. yes \n 2. No ");
		int ch3 = inp3.nextInt();

		switch (ch3) {

		case 1:

			current_node = list.head;
			current_node = current_node.next;
			list.head.next = null;
			list.head.prev = null;
			list.head = current_node;
			current_node.prev = null;

			obj.displayDLL(list);

			break;

		case 2:
			break;

		}

	} else {

		current_node = list.head;

		while (current_node.next != null) {

			if (current_node.data == key1) {

				if (current_node.next != null) {

					temp = current_node.prev;
					temp.next = current_node.next;
					temp.next.prev = temp;
					current_node.next = null;
					current_node.prev = null;

				} else {

					current_node.prev.next = null;

				}

			}

			current_node = current_node.next;

		}

	}

}

return list;