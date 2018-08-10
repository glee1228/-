import matplotlib.pyplot as plt
import seaborn as sns
import pandas as pd
import platform

path ="c:/Windows/Fonts/malgun.ttf"
from matplotlib import font_manager,rc

if platform.system() =='Darwin':
    rc('font',family='AppleGothic')
elif platform.system()=='Windows':
    font_name = font_manager.FontProperties(fname=path).get_name()
    rc('font',family=font_name)
else :
    print('Unknown system... sorry')

crime_anal_norm = pd.read_csv('data/crime_in_Seoul_norm.csv',thousands=',', encoding='utf-8')
print(crime_anal_norm)
sns.pairplot(crime_anal_norm,vars=["강도","살인","폭력"],kind='reg',height=3)
plt.show()