package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction.Builder.class)
public class Builder556686770Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__156873384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-156873384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOptions(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/level/storage/loot/functions/EnchantRandomlyFunction$Builder;", cancellable = true)
    private void withOptions__155566786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155566786L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "allowingIncompatibleEnchantments()Lnet/minecraft/world/level/storage/loot/functions/EnchantRandomlyFunction$Builder;", cancellable = true)
    private void allowingIncompatibleEnchantments_726718835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726718835L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "withOneOf(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/level/storage/loot/functions/EnchantRandomlyFunction$Builder;", cancellable = true)
    private void withOneOf__155566786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155566786L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "includeAdditionalCostComponent()Lnet/minecraft/world/level/storage/loot/functions/EnchantRandomlyFunction$Builder;", cancellable = true)
    private void includeAdditionalCostComponent_726718835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726718835L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "withEnchantment(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/storage/loot/functions/EnchantRandomlyFunction$Builder;", cancellable = true)
    private void withEnchantment_1631598980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1631598980L))
            info.setReturnValue(null);
    }


}
