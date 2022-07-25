// Dependencies
import { resolve } from 'path';


// Ensure NODE_ENV env variable is set.
process.env.NODE_ENV = process.env.NODE_ENV || 'production';

export default {
  alias: {
    '~': resolve(__dirname, './.'),
  },

  env: {
    NODE_ENV: process.env.NODE_ENV,
    PORT: process.env.PORT || 3000,
  },

  buildModules: [
    '@nuxt/typescript-build',
    '@nuxtjs/eslint-module',
    'nuxt-compress',
  ],

  // Build Configuration: https://go.nuxtjs.dev/config-build
  build: {
    extend(config: any, { isClient } : { [key: string]: any }) {
      // Extend only webpack config for client-bundle
      if (isClient) {
        config.devtool = 'source-map';
      }
    },
    loaders: {
      stylus: {
        stylusOptions: {
          // globaly load mixins
        },
      },
    },
    extractCSS: process.env.NODE_ENV === 'production',
  },

  css: [
  ],

  modern: process.env.NODE_ENV === 'local' ? false : 'client',

  render: {
    static: {
      maxAge: '180d',
    },
  },

  server: {
    timing: {
      total: true,
    },
  },

  telemetry: false,
};
