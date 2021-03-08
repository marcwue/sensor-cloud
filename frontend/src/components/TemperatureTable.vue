<template>
  <div class="hello">
    <ul>
      <li v-for="(temperature, index) in temperatures" :key="temperature.date">
        {{ index + 1 }}. {{ temperature.date }}: {{ temperature.celsius }}
      </li>
    </ul>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'TemperatureTable',
  props: {
    msg: String
  },
  data() {
    return {
      temperatures: []
    }
  },
  created() {
    axios.get('http://localhost:8200/temperature?day=06.03.2021')
    .then(response => {
      this.temperatures = response.data.temperatureViewModels
    })
    .catch(e => {
      this.errors.push(e)
    })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
ul {
  list-style-type: none;
  padding: 0;
}
li {
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
