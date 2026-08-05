package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.TradeRebalanceChestLoot.class)
public class TradeRebalanceChestLoot1377729190Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_469102922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(469102922L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2146814581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2146814581L))
            info.setReturnValue("e%qwa!YIBydP\uFC25uy:\u069BDS(\uCCE4w<V:W*s]\u8721:42_\u76D5\u51CE/O\u54DC<F\uC0FBcT>` Bh4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1935081281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1935081281L))
            info.setReturnValue(986967402);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate_1115268529(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1115268529L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pillagerOutpostLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void pillagerOutpostLootTable__1985403342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985403342L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }

    @Inject(at = @At("HEAD"), method = "jungleTempleLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void jungleTempleLootTable__429633270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429633270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ancientCityLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void ancientCityLootTable__2133350895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133350895L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }

    @Inject(at = @At("HEAD"), method = "desertPyramidLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void desertPyramidLootTable_449713113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(449713113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries__1187995940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1187995940L))
            info.setReturnValue(null);
    }


}
