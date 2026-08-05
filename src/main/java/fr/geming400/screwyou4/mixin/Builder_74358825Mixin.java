package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootTable.Builder.class)
public class Builder_74358825Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction$Builder;)Lnet/minecraft/world/level/storage/loot/functions/FunctionUserBuilder;", cancellable = true)
    private void apply_342709305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(342709305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction$Builder;)Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void apply_1300395744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1300395744L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lnet/minecraft/world/level/storage/loot/functions/FunctionUserBuilder;", cancellable = true)
    private void unwrap_1406734796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1406734796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void unwrap_822589683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(822589683L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/LootTable;", cancellable = true)
    private void build__976735755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-976735755L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setParamSet(Lnet/minecraft/util/context/ContextKeySet;)Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void setParamSet__1003632847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1003632847L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setRandomSequence(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void setRandomSequence__1550352530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1550352530L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }

    @Inject(at = @At("HEAD"), method = "withPool(Lnet/minecraft/world/level/storage/loot/LootPool$Builder;)Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void withPool__1345127575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1345127575L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }


}
