module "network" {
  source       = "./modules/network"
  vpc_cidr     = var.vpc_cidr
  public_subnets = var.public_subnets
}

module "server" {
  source    = "./modules/server"
  subnet_id = module.network.public_subnet_ids[0]
  vpc_id    = module.network.vpc_id

}
