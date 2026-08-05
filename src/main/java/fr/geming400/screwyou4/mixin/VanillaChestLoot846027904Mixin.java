package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaChestLoot.class)
public class VanillaChestLoot846027904Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2063427133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2063427133L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__289432071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-289432071L))
            info.setReturnValue("ebg?34蓠ퟴ孿<CW={TiSᒞ'+eY;1$dB@Lᩡ&f4CE\"1<?k{fmC2[ꤻ㻞8V_30Alk솊nꀍ9sES$Nj礫@pLL턈_Z<tG/砬燃Nv7㫟滇sib॑kᬾ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_884290646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(884290646L))
            info.setReturnValue(-2124739677);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate__892122986(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-892122986L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ancientCityLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void ancientCityLootTable_112649768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112649768L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "pillagerOutpostLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void pillagerOutpostLootTable_112649768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112649768L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "desertPyramidLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void desertPyramidLootTable_112649768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112649768L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "jungleTempleLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void jungleTempleLootTable_112649768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112649768L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "shipwreckMapLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void shipwreckMapLootTable_112649768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112649768L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "netherBridgeLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void netherBridgeLootTable_112649768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112649768L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "shipwreckSupplyLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void shipwreckSupplyLootTable_112649768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112649768L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "bastionBridgeLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void bastionBridgeLootTable_112649768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112649768L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "spawnerLootTables(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void spawnerLootTables__892122986(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-892122986L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bastionTreasureLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void bastionTreasureLootTable_112649768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112649768L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "woodlandMansionLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void woodlandMansionLootTable_112649768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112649768L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "endCityTreasureLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void endCityTreasureLootTable_112649768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112649768L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "bastionOtherLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void bastionOtherLootTable_112649768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112649768L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "shipwreckTreasureLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void shipwreckTreasureLootTable_112649768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112649768L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "strongholdLibraryLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void strongholdLibraryLootTable_112649768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112649768L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "strongholdCorridorLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void strongholdCorridorLootTable_112649768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112649768L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "bastionHoglinStableLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void bastionHoglinStableLootTable_112649768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112649768L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries_532820571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532820571L))
            info.setReturnValue(null);
    }


}
