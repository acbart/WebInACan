from __future__ import with_statement

# Import database call
import sqlalchemy
from contextlib import closing

# Flask stuff
from flask import Flask, request, session, g, redirect, url_for, \
     abort, render_template, flash
     
from flask_bootstrap import Bootstrap
     
# Configuration constants are in the config module
import config

# Actual app creation
app = Flask(__name__)
app.config.from_object(config)
Bootstrap(app)

def connect_db():
    return sqlite3.connect(app.config['DATABASE'])
    
def init_db():
    with closing(connect_db()) as db:
        with app.open_resource('schema.sql') as f:
            db.cursor().executescript(f.read())
        db.commit()
init_db()
        
@app.before_request
def before_request():
    g.db = connect_db()

@app.teardown_request
def teardown_request(exception):
    g.db.close()
    
import webinacan.views    
