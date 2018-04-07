-- Deleting previous tables that may already exist

DROP TABLE IF EXISTS Attendance;
DROP TABLE IF EXISTS Contract;
DROP TABLE IF EXISTS Child;
DROP TABLE IF EXISTS OffDay;
DROP TABLE IF EXISTS Nursery;

-- Tables' creation

CREATE TABLE Nursery (
	nurseryName VARCHAR(50) PRIMARY KEY,
    passwd VARCHAR(30) NOT NULL
);

CREATE TABLE OffDay (
	nurseryName VARCHAR(30) REFERENCES Nursery(nurseryName) ON DELETE CASCADE ON UPDATE CASCADE,
	offDate DATE, 
    halfday ENUM('MORNING', 'AFTERNOON'),
    PRIMARY KEY(nurseryName, offDate, halfday)
);

CREATE TABLE Child (
	childId INT AUTO_INCREMENT PRIMARY KEY,
    firstname VARCHAR(20) NOT NULL,
    lastname VARCHAR(20) NOT NULL,
    age INT NOT NULL								-- in months
);

CREATE TABLE Contract (
	contractId INT,
    nurseryName VARCHAR(30) REFERENCES Nursery(nurseryName) ON DELETE CASCADE ON UPDATE CASCADE,
    beginDate DATE NOT NULL,
    endDate DATE NOT NULL,
    pricePerHour REAL NOT NULL,						-- in euros
    email VARCHAR(50) NULL,
    phoneNumber CHAR(10) NOT NULL,
    contractType ENUM('REGULAR', 'TEMPORARY') NOT NULL, 
    childId INT REFERENCES Child(childId) ON DELETE CASCADE ON UPDATE CASCADE, 
    PRIMARY KEY(contractId, nurseryName)
);

CREATE TABLE Attendance (
    nurseryName VARCHAR(30),
	contractId INT,
	attendanceDate DATE, 
    halfday ENUM('MORNING', 'AFTERNOON'),
    state ENUM('HERE_REGULAR', 'BOOKED_TEMPORARY', 'ABSCENT_REGULAR', 'PRESENT', 'EXCUSED', 'UNEXCUSED', 'CANCELED') NOT NULL,
    FOREIGN KEY(nurseryName, contractId) REFERENCES Contract ON DELETE CASCADE ON UPDATE CASCADE,
    PRIMARY KEY(nurseryName, contractId, attendanceDate, halfday) 
);

