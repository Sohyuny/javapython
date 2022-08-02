from openpyxl import load_workbook

wb=load_workbook('c.xlsx')
ws=wb.active
# 한줄삽입
# ws.apeedn([11,22,33,44,55,66,77,88,99])

wb.save('c.xlsx')
wb.close()