package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.TradeRebalanceChestLoot.class)
public class TradeRebalanceChestLoot1377729190Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1531725847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1531725847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_242269215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(242269215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1415991932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1415991932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate__360421700(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-360421700L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries_1064521857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1064521857L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pillagerOutpostLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void pillagerOutpostLootTable_644351054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(644351054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jungleTempleLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void jungleTempleLootTable_644351054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(644351054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ancientCityLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void ancientCityLootTable_644351054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(644351054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "desertPyramidLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void desertPyramidLootTable_644351054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(644351054L))
            info.setReturnValue(null);
    }


}
