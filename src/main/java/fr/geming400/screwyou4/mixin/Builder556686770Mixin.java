package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction.Builder.class)
public class Builder556686770Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__1733722326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1733722326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOptions(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/level/storage/loot/functions/EnchantRandomlyFunction$Builder;", cancellable = true)
    private void withOptions_1402967094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1402967094L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "withEnchantment(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/storage/loot/functions/EnchantRandomlyFunction$Builder;", cancellable = true)
    private void withEnchantment_1572695315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1572695315L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "withOneOf(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/level/storage/loot/functions/EnchantRandomlyFunction$Builder;", cancellable = true)
    private void withOneOf_399903093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399903093L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "includeAdditionalCostComponent()Lnet/minecraft/world/level/storage/loot/functions/EnchantRandomlyFunction$Builder;", cancellable = true)
    private void includeAdditionalCostComponent__1112808524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1112808524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowingIncompatibleEnchantments()Lnet/minecraft/world/level/storage/loot/functions/EnchantRandomlyFunction$Builder;", cancellable = true)
    private void allowingIncompatibleEnchantments__1921739135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1921739135L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction.Builder());
    }


}
