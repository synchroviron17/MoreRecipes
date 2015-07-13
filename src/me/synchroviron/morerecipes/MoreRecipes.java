package me.blackswiftalpha.morerecipes;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class MoreRecipes extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		// DUMBCRAFT.SHAPELESS \\
		brownMushroomBlock();
		brownMushroomFromBlock();
		redMushroomBlock();
		redMushroomFromBlock();
		string();
		
		// DUMBCRAFT.SHAPED \\
		itemFrame();

		// GUARDIAN.REGULAR \\
		guardianHelmet();
		guardianChestplate();
		guardianLeggings();
		guardianBoots();
		guardianSpikeMace();

		// GUARDIAN.ELDER \\
		elderGuardianHelmet();
		elderGuardianChestplate();
		elderGuardianLeggings();
		elderGuardianBoots();
		elderGuardianAxe();
		
	}

	// DUMBCRAFT.SHAPELESS \\

	public void brownMushroomBlock() {
		ItemStack item = new ItemStack(Material.HUGE_MUSHROOM_1, 1);

		ShapelessRecipe bmushblock = new ShapelessRecipe(item);
		bmushblock.addIngredient(9, Material.BROWN_MUSHROOM);
		Bukkit.getServer().addRecipe(bmushblock);
	}

	public void brownMushroomFromBlock() {
		ItemStack item = new ItemStack(Material.BROWN_MUSHROOM, 9);

		ShapelessRecipe bmushfblock = new ShapelessRecipe(item);
		bmushfblock.addIngredient(1, Material.HUGE_MUSHROOM_1);
		Bukkit.getServer().addRecipe(bmushfblock);
	}

	public void redMushroomBlock() {
		ItemStack item = new ItemStack(Material.HUGE_MUSHROOM_2, 1);

		ShapelessRecipe rmushblock = new ShapelessRecipe(item);
		rmushblock.addIngredient(9, Material.RED_MUSHROOM);
		Bukkit.getServer().addRecipe(rmushblock);
	}

	public void redMushroomFromBlock() {
		ItemStack item = new ItemStack(Material.RED_MUSHROOM, 9);

		ShapelessRecipe rmushfblock = new ShapelessRecipe(item);
		rmushfblock.addIngredient(1, Material.HUGE_MUSHROOM_2);
		Bukkit.getServer().addRecipe(rmushfblock);
	}

	public void string() {
		ItemStack item = new ItemStack(Material.STRING, 4);

		ShapelessRecipe string = new ShapelessRecipe(item);
		string.addIngredient(1, Material.WOOL);
		Bukkit.getServer().addRecipe(string);
	}
	
	// DUMBCRAFT.SHAPED \\

	public void itemFrame() {
		ItemStack item = new ItemStack(Material.ITEM_FRAME, 1);

		ShapedRecipe iframe = new ShapedRecipe(item);
		iframe.shape(new String[] { "///", "/*/", "///" })
				.setIngredient('/', Material.STICK)
				.setIngredient('*', Material.RABBIT_HIDE);
		Bukkit.getServer().addRecipe(iframe);
	}

	// GUARDIAN.REGULAR \\

	public void guardianHelmet() {
		ItemStack item = new ItemStack(Material.LEATHER_HELMET, 1);
		LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();

		im.setDisplayName("§2§lGuardian Helmet");

		im.addEnchant(Enchantment.OXYGEN, 2, true);
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		im.addEnchant(Enchantment.THORNS, 5, true);
		im.addEnchant(Enchantment.WATER_WORKER, 5, true);

		List<String> lore = new ArrayList<String>();
		lore.add("§8§oMade from the scales of a Guardian");
		im.setLore(lore);

		im.setColor(Color.fromRGB(77, 184, 255));

		im.spigot().setUnbreakable(true);

		item.setItemMeta(im);

		ShapedRecipe ghelmet = new ShapedRecipe(item);
		ghelmet.shape(new String[] { "ooo", "o o" }).setIngredient('o',
				Material.PRISMARINE_CRYSTALS);
		Bukkit.getServer().addRecipe(ghelmet);
	}

	private void guardianChestplate() {
		ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();

		im.setDisplayName("§2§lGuardian Chestplate");

		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		im.addEnchant(Enchantment.THORNS, 5, true);

		List<String> lore = new ArrayList<String>();
		lore.add("§8§oMade from the scales of a Guardian");
		im.setLore(lore);

		im.setColor(Color.fromRGB(77, 184, 255));

		im.spigot().setUnbreakable(true);

		item.setItemMeta(im);

		ShapedRecipe gchestplate = new ShapedRecipe(item);
		gchestplate.shape(new String[] { "o o", "ooo", "ooo" }).setIngredient(
				'o', Material.PRISMARINE_CRYSTALS);
		Bukkit.getServer().addRecipe(gchestplate);
	}

	private void guardianLeggings() {
		ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS, 1);
		LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();

		im.setDisplayName("§2§lGuardian Leggings");

		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		im.addEnchant(Enchantment.THORNS, 5, true);

		List<String> lore = new ArrayList<String>();
		lore.add("§8§oMade from the scales of a Guardian");
		im.setLore(lore);

		im.setColor(Color.fromRGB(77, 184, 255));

		im.spigot().setUnbreakable(true);

		item.setItemMeta(im);

		ShapedRecipe gleggings = new ShapedRecipe(item);
		gleggings.shape(new String[] { "ooo", "o o", "o o" }).setIngredient(
				'o', Material.PRISMARINE_CRYSTALS);
		Bukkit.getServer().addRecipe(gleggings);
	}

	private void guardianBoots() {
		ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
		LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();

		im.setDisplayName("§2§lGuardian Boots");

		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		im.addEnchant(Enchantment.THORNS, 5, true);
		im.addEnchant(Enchantment.DEPTH_STRIDER, 5, true);
		im.addEnchant(Enchantment.PROTECTION_FALL, 5, true);

		List<String> lore = new ArrayList<String>();
		lore.add("§8§oMade from the scales of a Guardian");
		im.setLore(lore);

		im.setColor(Color.fromRGB(77, 184, 255));

		im.spigot().setUnbreakable(true);

		item.setItemMeta(im);

		ShapedRecipe gboots = new ShapedRecipe(item);
		gboots.shape(new String[] { "o o", "o o" }).setIngredient('o',
				Material.PRISMARINE_CRYSTALS);
		Bukkit.getServer().addRecipe(gboots);
	}

	private void guardianSpikeMace() {
		ItemStack item = new ItemStack(Material.STONE_PICKAXE, 1);
		ItemMeta im = item.getItemMeta();

		im.setDisplayName("§2§lGuardian Spike Mace");
		im.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		im.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
		im.addEnchant(Enchantment.KNOCKBACK, 5, true);
		im.addEnchant(Enchantment.DIG_SPEED, 5, true);

		List<String> lore = new ArrayList<String>();
		lore.add("§8§oMade from the spikes of a Guardian");
		im.setLore(lore);

		im.spigot().setUnbreakable(true);

		item.setItemMeta(im);

		ShapedRecipe gmace = new ShapedRecipe(item);
		gmace.shape(new String[] { "ooo", "o/o", " / " })
				.setIngredient('/', Material.STICK)
				.setIngredient('o', Material.PRISMARINE_CRYSTALS);
		Bukkit.getServer().addRecipe(gmace);
	}

	// GUARDIAN.ELDER \\

	public void elderGuardianHelmet() {
		ItemStack item = new ItemStack(Material.LEATHER_HELMET, 1);
		LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();

		im.setDisplayName("§7§lElder Guardian Helmet");

		im.addEnchant(Enchantment.OXYGEN, 5, true);
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
		im.addEnchant(Enchantment.THORNS, 10, true);
		im.addEnchant(Enchantment.WATER_WORKER, 10, true);

		List<String> lore = new ArrayList<String>();
		lore.add("§8§oMade from the scales of the Elder Guardian");
		im.setLore(lore);

		im.setColor(Color.fromRGB(204, 204, 204));

		im.spigot().setUnbreakable(true);

		item.setItemMeta(im);

		ShapedRecipe eghelmet = new ShapedRecipe(item);
		eghelmet.shape(new String[] { "0o0", "o o" })
				.setIngredient('o', Material.PRISMARINE_CRYSTALS)
				.setIngredient('0', Material.PRISMARINE_SHARD);
		Bukkit.getServer().addRecipe(eghelmet);
	}

	private void elderGuardianChestplate() {
		ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();

		im.setDisplayName("§7§lElder Guardian Chestplate");

		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
		im.addEnchant(Enchantment.THORNS, 10, true);

		List<String> lore = new ArrayList<String>();
		lore.add("§8§oMade from the scales of the Elder Guardian");
		im.setLore(lore);

		im.setColor(Color.fromRGB(204, 204, 204));

		im.spigot().setUnbreakable(true);

		item.setItemMeta(im);

		ShapedRecipe egchestplate = new ShapedRecipe(item);
		egchestplate.shape(new String[] { "0 0", "0o0", "000" })
				.setIngredient('o', Material.PRISMARINE_CRYSTALS)
				.setIngredient('0', Material.PRISMARINE_SHARD);
		Bukkit.getServer().addRecipe(egchestplate);
	}

	private void elderGuardianLeggings() {
		ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS, 1);
		LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();

		im.setDisplayName("§7§lElder Guardian Leggings");

		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
		im.addEnchant(Enchantment.THORNS, 10, true);

		List<String> lore = new ArrayList<String>();
		lore.add("§8§oMade from the scales of the Elder Guardian");
		im.setLore(lore);

		im.setColor(Color.fromRGB(204, 204, 204));

		im.spigot().setUnbreakable(true);

		item.setItemMeta(im);

		ShapedRecipe egleggings = new ShapedRecipe(item);
		egleggings.shape(new String[] { "000", "o o", "0 0" })
				.setIngredient('o', Material.PRISMARINE_CRYSTALS)
				.setIngredient('0', Material.PRISMARINE_SHARD);
		Bukkit.getServer().addRecipe(egleggings);
	}

	private void elderGuardianBoots() {
		ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
		LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();

		im.setDisplayName("§7§lElder Guardian Boots");

		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
		im.addEnchant(Enchantment.THORNS, 10, true);
		im.addEnchant(Enchantment.DEPTH_STRIDER, 10, true);
		im.addEnchant(Enchantment.PROTECTION_FALL, 10, true);

		List<String> lore = new ArrayList<String>();
		lore.add("§8§oMade from the scales of the Elder Guardian");
		im.setLore(lore);

		im.setColor(Color.fromRGB(204, 204, 204));

		im.spigot().setUnbreakable(true);

		item.setItemMeta(im);

		ShapedRecipe egboots = new ShapedRecipe(item);
		egboots.shape(new String[] { "o o", "0 0" })
				.setIngredient('o', Material.PRISMARINE_CRYSTALS)
				.setIngredient('0', Material.PRISMARINE_SHARD);
		Bukkit.getServer().addRecipe(egboots);
	}

	private void elderGuardianAxe() {
		ItemStack item = new ItemStack(Material.STONE_AXE, 1);
		ItemMeta im = item.getItemMeta();

		im.setDisplayName("§7§lElder Guardian Battle Axe");

		im.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
		im.addEnchant(Enchantment.LOOT_BONUS_MOBS, 10, true);
		im.addEnchant(Enchantment.KNOCKBACK, 10, true);
		im.addEnchant(Enchantment.DIG_SPEED, 10, true);

		List<String> lore = new ArrayList<String>();
		lore.add("§8§oMade from the scales of the Elder Guardian");
		im.setLore(lore);

		im.spigot().setUnbreakable(true);

		item.setItemMeta(im);

		ShapedRecipe egaxe = new ShapedRecipe(item);
		egaxe.shape(new String[] { "0o0", "0/0", " / " })
				.setIngredient('/', Material.STICK)
				.setIngredient('o', Material.PRISMARINE_CRYSTALS)
				.setIngredient('0', Material.PRISMARINE_SHARD);
		Bukkit.getServer().addRecipe(egaxe);
	}

	public void onDisable() {
		Bukkit.getServer().clearRecipes();
	}
}

