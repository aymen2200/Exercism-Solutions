//
// This is only a SKELETON file for the 'Bob' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const hey = (message) => {
  message = message.trim()
  if(message[message.length - 1] ==='?' && message === message.toUpperCase()&& message !== message.toLowerCase()) return "Calm down, I know what I'm doing!"
  if(message[message.length - 1] ==='?') return "Sure."
  if(message === message.toUpperCase() && message !== message.toLowerCase()) return "Whoa, chill out!"
  
  if(message.replace(/\s+/g, "") === "") return "Fine. Be that way!" 
  return "Whatever."
};
