package model;

import java.util.Date;

public interface Employee {
	void doTask();

	void join(Date joinDate);

	void terminate(Date terminateDate);
}
