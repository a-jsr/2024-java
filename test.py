import requests

url = "https://www.bbc.com/news"  # Remplace par l'URL du site voulu
headers = {"User-Agent": "Mozilla/5.0"}  # Évite d’être bloqué par certains sites

response = requests.get(url, headers=headers)

if response.status_code == 200:
    print("Page récupérée avec succès !")
    print(response.text[:500])  # Affiche les 500 premiers caractères du HTML
else:
    print(f"Échec de la requête. Code HTTP : {response.status_code}")
