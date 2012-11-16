from webinacan import app, g

from flask import Flask, request, session, g, redirect, url_for, \
     abort, render_template, flash
     
class Service(object):
    def __init__(self):
        self.wsdl = None
        self.bindings = None
        self.examples = None

@app.route('/services')
def show_services():
    return "Use Service"
    
@app.route('/services/<service>')
def show_service(service):
    return service
    
@app.route('/services/<service>/bindings')
def show_service_bindings(service):
    return service
    
@app.route('/services/<service>/examples')
def show_service_bindings(service):
    return service
    
@app.route('/services/<service>/projects')
def show_service_bindings(service):
    return service
    
@app.route('/services/<service>/tests')
def show_service_bindings(service):
    return service
    
@app.route('/suggest/wsdl')
def suggest_wsdl():
    return url_for("/suggest/wsdl/bindings")
    
@app.route('/suggest/freeform')
def suggest_freeform():
    return ""
    
@app.route('/user/add')
def user_add():
    return ""

@app.route('/')
def show_entries():
    cur = g.db.execute('select username, visible_name from users order by username desc')
    entries = [dict(title=row[0], text=row[1]) for row in cur.fetchall()]
    return render_template('show_entries.html', entries=entries)
    
    
