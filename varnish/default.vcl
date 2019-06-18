vcl 4.0;

backend frontend-a {
  .host = "frontend-a";
  .port = "8080";
}

backend frontend-b {
  .host = "frontend-b";
  .port = "8080";
}


sub vcl_recv {
  # URL mapping
  if(req.method == "GET" && req.url ~ "^/a/") {
    set req.backend_hint = frontend-a;
  } else if (req.method == "GET" && req.url ~ "^/b/") {
    set req.backend_hint = frontend-b;
  }
}

sub vcl_backend_response {
  set beresp.do_esi = true; // Do ESI processing
  set beresp.ttl = 10 s;    // Sets the TTL
}