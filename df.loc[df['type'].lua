df.loc[df['type'].isnull()] = df['chlorides'].median()
df.loc[df['fixed acidity'].isnull()] = df['fixed acidity'].median()
df.loc[df['volatile acidity'].isnull()] = df['volatile acidity'].median()
df.loc[df['citric acid'].isnull()] = df['citric acid'].median()
df.loc[df['residual sugar'].isnull()] = df['residual sugar'].median()
df.loc[df['chlorides'].isnull()] = df['chlorides'].median()
df.loc[df['free sulfur dioxide'].isnull()] = df['free sulfur dioxide'].median()
df.loc[df['total sulfur dioxide'].isnull()] = df['total sulfur dioxide'].median()
df.loc[df['density'].isnull()] = df['density'].median()
df.loc[df['pH'].isnull()] = df['pH'].median()
df.loc[df['sulphates'].isnull()] = df['sulphates'].median()
df.loc[df['alcohol'].isnull()] = df['alcohol'].median()
df.loc[df['quality'].isnull()] = df['quality'].median()


df_red = df.loc[(df['type']=='red')]

X_red = df_red[['fixed acidity', 'volatile acidity', 'citric acid', 'residual sugar', 'chlorides', 'free sulfur dioxide', 'total sulfur dioxide', 'density', 'sulphates']]
y_red = df_red['quality']

X_r_train, X_r_test, y_r_train, y_r_test = train_test_split(X_red,y_red,test_size=0.2)


mse1 = mean_squared_error(y_w_test, y_w_pred)
mse2 = mean_squared_error(y_r_test, y_r_pred)

r2 = r2_score(y_w_test, y_w_pred)
r2 = r2_score(y_r_test, y_r_pred)

print(f'El error cuadratico medio para el primer modelo es: {mse}')
print(f'El error cuadratico medio para el segundo modelo es: {mse1}')
print(f'El coeficiente de determinacion en r2 para el primer modelo es: {r2w}')
print(f'El coeficiente de determinacion en r2 para el segundo modelo es: {r2r}')