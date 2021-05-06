<template>
  <div class="hello">
    <b-table striped hover :items="temperatures"></b-table>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'SensorTable',
  props: {
    msg: String
  },
  data() {
    return {
      temperatures: []
    }
  },
  created() {
    let today = new Date().toISOString().slice(0, 10)
    axios.get('http://sensor-service:8200/temperature?day=' + today)
    .then(response => {
      this.temperatures = response.data.temperatureViewModels
    })
    .catch(e => {
      console.log(e)
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
