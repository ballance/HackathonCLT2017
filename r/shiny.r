library(shiny)
library(DBI)

ui <- fluidPage(
numericInput("nrows", "Enter the number of rows to display:", 5),
tableOutput("tbl")
)

server <- function(input, output, session) {
    output$tbl <- renderTable({
        conn <- dbConnect(
        drv = RMySQL::MySQL(),
        user = 'droptables',
        password = 'g6P3QV6Y#^8j',
        host = 'hk-data.chtlgfr8b1iu.us-east-1.rds.amazonaws.com',
        dbname='hkdatadatadata')
        on.exit(dbDisconnect(conn), add = TRUE)
        dbGetQuery(conn, paste0(
        "select * from match_details_new limit ", input$nrows, ";"))
    })
}

shinyApp(ui, server)