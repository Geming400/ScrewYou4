package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.number.BinomialDistributionGenerator.class)
public class BinomialDistributionGenerator_1650518718Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_741892449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(741892449L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1874025054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1874025054L))
            info.setReturnValue("M%\u75B767\u43025[GP]pMUj;F\u1E10=X^Cp\u9B60Y=z\u115CA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2087096488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2087096488L))
            info.setReturnValue(-898600755);
    }

    @Inject(at = @At("HEAD"), method = "getInt(Lnet/minecraft/world/level/storage/loot/LootContext;)I", cancellable = true)
    private void getInt__1912489239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1912489239L))
            info.setReturnValue(996741502);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Lnet/minecraft/world/level/storage/loot/LootContext;)F", cancellable = true)
    private void getFloat_1421047897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1421047897L))
            info.setReturnValue(4.277928E8F);
    }

    @Inject(at = @At("HEAD"), method = "n()Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;", cancellable = true)
    private void n_1475469181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1475469181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_631799946(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(631799946L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "p()Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;", cancellable = true)
    private void p_1502534783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1502534783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1578003325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1578003325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "binomial(IF)Lnet/minecraft/world/level/storage/loot/providers/number/BinomialDistributionGenerator;", cancellable = true)
    private static void binomial_286451369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286451369L))
            info.setReturnValue(null);
    }


}
