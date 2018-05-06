INSERT INTO tblAddress (Line1, Line2, City, RegionCode, PostalCode, CountryCode)
VALUES ('2018 SARAH STREET',NULL,'PITTSBURGH','PA','15203','US')

INSERT INTO tblAddress (Line1, Line2, City, RegionCode, PostalCode, CountryCode)
VALUES ('45 ANYSTREET DRIVE','APT 2','PITTSBURGH','PA','15203','US')

INSERT INTO tblContact (eMail, LName, FNAME, PhonePrimary, PhoneSecond)
VALUES ('jamberin+NewsBoySetup@gmail.com','BERINGER','JAMES','7248317326','8888888888')

INSERT INTO tblContact (eMail, LName, FNAME, PhonePrimary, PhoneSecond)
VALUES ('fake.email@no-site.net','TEST','USER','4444444444','8888888888')

INSERT INTO tblRobust (CustomerNotes)
VALUES('TEST USER 1')

INSERT INTO tblRobust (CustomerNotes)
VALUES('TEST USER 2')

UPDATE tblContact 
SET AddressID = 1, RobustID = 1
WHERE eMail = 'jamberin+NewsBoySetup@gmail.com'

UPDATE tblContact 
SET AddressID = 2, RobustID = 2
WHERE eMail = 'fake.email@no-site.net'