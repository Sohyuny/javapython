from flask import Flask

app=Flask(__name__)

@app.route("/")
def index():
    return "index"

app.run(host="192.168.0.3",port=5000)