package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.EnchantWithLevelsFunction.class)
public class EnchantWithLevelsFunction_1634321704Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1472973895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1472973895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__1084014902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1084014902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "enchantWithLevels(Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/functions/EnchantWithLevelsFunction$Builder;", cancellable = true)
    private static void enchantWithLevels__1152219604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1152219604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__924791869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-924791869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__194713783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-194713783L))
            info.setReturnValue(null);
    }


}
