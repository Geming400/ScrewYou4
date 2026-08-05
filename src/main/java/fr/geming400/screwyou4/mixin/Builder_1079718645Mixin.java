package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootPool.Builder.class)
public class Builder_1079718645Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer$Builder;)Lnet/minecraft/world/level/storage/loot/LootPool$Builder;", cancellable = true)
    private void add_185207134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185207134L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootPool.Builder());
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction$Builder;)Lnet/minecraft/world/level/storage/loot/LootPool$Builder;", cancellable = true)
    private void apply__592592618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-592592618L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootPool.Builder());
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction$Builder;)Lnet/minecraft/world/level/storage/loot/functions/FunctionUserBuilder;", cancellable = true)
    private void apply_1348069125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1348069125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addAll(Ljava/util/List;)Lnet/minecraft/world/level/storage/loot/LootPool$Builder;", cancellable = true)
    private void addAll__2085387625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2085387625L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootPool.Builder());
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lnet/minecraft/world/level/storage/loot/functions/FunctionUserBuilder;", cancellable = true)
    private void unwrap__1882872680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1882872680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lnet/minecraft/world/level/storage/loot/LootPool$Builder;", cancellable = true)
    private void unwrap__885100381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-885100381L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootPool.Builder());
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lnet/minecraft/world/level/storage/loot/predicates/ConditionUserBuilder;", cancellable = true)
    private void unwrap_501776436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(501776436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/LootPool;", cancellable = true)
    private void build_1926470831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1926470831L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "when(Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/ConditionUserBuilder;", cancellable = true)
    private void when_1733968283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1733968283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "when(Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/world/level/storage/loot/LootPool$Builder;", cancellable = true)
    private void when__1974145508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1974145508L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootPool.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setRolls(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/LootPool$Builder;", cancellable = true)
    private void setRolls__20040795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-20040795L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootPool.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setBonusRolls(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/LootPool$Builder;", cancellable = true)
    private void setBonusRolls_49252960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(49252960L))
            info.setReturnValue(null);
    }


}
