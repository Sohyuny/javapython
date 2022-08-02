import pyautogui
import pyperclip
'''

'''
a='mspaint'
pyperclip.copy(a)

pyautogui.hotkey('win','r')
pyautogui.hotkey('ctrl','v')
# pyautogui.write('C:\Program Files\Microsoft Office\root\Office16\EXCEL.EXE')
pyautogui.hotkey('enter')

pyautogui.sleep(2)
img = pyautogui.locateOnScreen('./pyauto_work/a.png',confidence=0.9)
pyautogui.click(img)

pyautogui.move(0,300,duration=1)
pyautogui.click()

pyautogui.write('abced')
pyautogui.sleep(1)

win1 = pyautogui.getActiveWindow()
win1.close()

pyautogui.sleep(2)
pyautogui.write('n')