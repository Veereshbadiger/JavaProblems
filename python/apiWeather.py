# from flask import Flask, request, jsonify
# import requests
# import logging

# app = Flask(__name__)

# API_KEY = '5c61c56f03e0fb107488ad1c76fd6148'  # Replace with your OpenWeatherMap API key

# # Configure logging
# logging.basicConfig(level=logging.DEBUG)

# @app.route('/weather', methods=['GET'])
# def get_weather():
#     city = request.args.get('city')
#     if not city:
#         app.logger.error('City parameter is missing')
#         return jsonify({'error': 'City parameter is required'}), 400

#     app.logger.info(f'Received request for weather in city: {city}')
#     url = f'http://api.openweathermap.org/data/2.5/weather?q={city}&appid={API_KEY}&units=metric'
#     response = requests.get(url)
    
#     if response.status_code != 200:
#         app.logger.error(f'Failed to fetch weather data for city: {city}, status code: {response.status_code}')
#         return jsonify({'error': 'Failed to fetch weather data'}), response.status_code

#     data = response.json()
#     weather = {
#         'city': data['name'],
#         'temperature': data['main']['temp'],
#         'description': data['weather'][0]['description']
#     }

#     app.logger.info(f'Weather data for city {city}: {weather}')
#     return jsonify(weather)

# if __name__ == '__main__':
#     app.run(debug=True)
    
    
# ##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


from openai import OpenAI

client = OpenAI(
  base_url = "https://integrate.api.nvidia.com/v1",
  api_key = "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"
)

completion = client.chat.completions.create(
  model="meta/llama3-70b-instruct",
  messages=[{"role":"user","content":"Write a limerick about the wonders of GPU computing."}],
  temperature=0.5,
  top_p=1,
  max_tokens=1024,
  stream=True
)

for chunk in completion:
  if chunk.choices[0].delta.content is not None:
    print(chunk.choices[0].delta.content, end="")