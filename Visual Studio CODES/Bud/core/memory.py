import sqlite3

class Memory:
    def __init__(self):
        self.db = sqlite3.connect("bud_memory.db")
        self.cur = self.db.cursor()
        self.cur.execute(
            "CREATE TABLE IF NOT EXISTS memory (key TEXT PRIMARY KEY, value TEXT)"
        )
        self.db.commit()

    def remember(self, key, value):
        self.cur.execute(
            "INSERT OR REPLACE INTO memory VALUES (?, ?)", (key, value)
        )
        self.db.commit()

    def recall(self, key):
        self.cur.execute("SELECT value FROM memory WHERE key=?", (key,))
        r = self.cur.fetchone()
        return r[0] if r else None
