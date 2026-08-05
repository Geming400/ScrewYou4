package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaChestLoot.class)
public class VanillaChestLoot846027904Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__62598364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-62598364L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1616451429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616451429L))
            info.setReturnValue("Q^\uC9D9`anmGzk");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1403379995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403379995L))
            info.setReturnValue(-486403324);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate_583567243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(583567243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnerLootTables(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void spawnerLootTables__1172804405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1172804405L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pillagerOutpostLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void pillagerOutpostLootTable_1777862668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1777862668L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }

    @Inject(at = @At("HEAD"), method = "jungleTempleLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void jungleTempleLootTable__961334556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961334556L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }

    @Inject(at = @At("HEAD"), method = "ancientCityLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void ancientCityLootTable_1629915115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629915115L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }

    @Inject(at = @At("HEAD"), method = "desertPyramidLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void desertPyramidLootTable__81988173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81988173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bastionBridgeLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void bastionBridgeLootTable_1751497117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1751497117L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }

    @Inject(at = @At("HEAD"), method = "bastionOtherLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void bastionOtherLootTable__1695305274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1695305274L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }

    @Inject(at = @At("HEAD"), method = "bastionTreasureLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void bastionTreasureLootTable__964090441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964090441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endCityTreasureLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void endCityTreasureLootTable__1818798535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818798535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "netherBridgeLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void netherBridgeLootTable_179496045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179496045L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }

    @Inject(at = @At("HEAD"), method = "shipwreckTreasureLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void shipwreckTreasureLootTable__2125689079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2125689079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shipwreckMapLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void shipwreckMapLootTable__629490840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-629490840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "strongholdLibraryLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void strongholdLibraryLootTable__1966279191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1966279191L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }

    @Inject(at = @At("HEAD"), method = "woodlandMansionLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void woodlandMansionLootTable_1760146391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1760146391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shipwreckSupplyLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void shipwreckSupplyLootTable__1655456951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1655456951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bastionHoglinStableLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void bastionHoglinStableLootTable__1493882662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493882662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "strongholdCorridorLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void strongholdCorridorLootTable__608355922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608355922L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries__1719697226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1719697226L))
            info.setReturnValue(null);
    }


}
