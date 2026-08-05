package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootPool.Builder.class)
public class Builder_1079718645Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer$Builder;)Lnet/minecraft/world/level/storage/loot/LootPool$Builder;", cancellable = true)
    private void add__714569155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714569155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction$Builder;)Lnet/minecraft/world/level/storage/loot/LootPool$Builder;", cancellable = true)
    private void apply_1949461416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1949461416L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootPool$Builder());
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction$Builder;)Lnet/minecraft/world/level/storage/loot/functions/FunctionUserBuilder;", cancellable = true)
    private void apply_666270131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666270131L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addAll(Ljava/util/List;)Lnet/minecraft/world/level/storage/loot/LootPool$Builder;", cancellable = true)
    private void addAll_880292823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(880292823L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootPool$Builder());
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lnet/minecraft/world/level/storage/loot/functions/FunctionUserBuilder;", cancellable = true)
    private void unwrap_1768600053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768600053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lnet/minecraft/world/level/storage/loot/LootPool$Builder;", cancellable = true)
    private void unwrap_729673766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(729673766L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootPool$Builder());
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lnet/minecraft/world/level/storage/loot/predicates/ConditionUserBuilder;", cancellable = true)
    private void unwrap_578792017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(578792017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/LootPool;", cancellable = true)
    private void build_835664477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(835664477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "when(Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/ConditionUserBuilder;", cancellable = true)
    private void when_1645549461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1645549461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "when(Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/world/level/storage/loot/LootPool$Builder;", cancellable = true)
    private void when__74701982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-74701982L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootPool$Builder());
    }

    @Inject(at = @At("HEAD"), method = "setRolls(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/LootPool$Builder;", cancellable = true)
    private void setRolls__1290129543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1290129543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBonusRolls(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/LootPool$Builder;", cancellable = true)
    private void setBonusRolls__1290129543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1290129543L))
            info.setReturnValue(null);
    }


}
