package DCD.domain;

import java.util.Date;

public class Task {

	private String name;
	private Date dueDate;
	private Date createdOn;
	private User createdBy;
	private Date updatedOn;
	private User updatedBy;
	private Folder folder;
	private User creator;
	private User assignee;
}