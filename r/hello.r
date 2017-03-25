
library(shiny)
#runExample("01_hello")

library(RMySQL)
con <- dbConnect(MySQL(),
user = 'droptables',
password = 'g6P3QV6Y#^8j',
host = 'hk-data.chtlgfr8b1iu.us-east-1.rds.amazonaws.com',
dbname='hkdatadatadata')

dbGetQuery(conn = con, statement = "select * from match_details_new limit 900;")

