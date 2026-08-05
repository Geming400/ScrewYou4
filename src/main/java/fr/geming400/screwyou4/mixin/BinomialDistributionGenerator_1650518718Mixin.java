package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.number.BinomialDistributionGenerator.class)
public class BinomialDistributionGenerator_1650518718Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1258936320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1258936320L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_515058742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(515058742L))
            info.setReturnValue(">");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1688781459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1688781459L))
            info.setReturnValue(-649283273);
    }

    @Inject(at = @At("HEAD"), method = "getInt(Lnet/minecraft/world/level/storage/loot/LootContext;)I", cancellable = true)
    private void getInt__726446718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-726446718L))
            info.setReturnValue(-1352272808);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Lnet/minecraft/world/level/storage/loot/LootContext;)F", cancellable = true)
    private void getFloat__726449601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-726449601L))
            info.setReturnValue(6.987988E8F);
    }

    @Inject(at = @At("HEAD"), method = "n()Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;", cancellable = true)
    private void n__13138929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-13138929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__1067817888(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1067817888L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "p()Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;", cancellable = true)
    private void p__13138929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-13138929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__908594855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-908594855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "binomial(IF)Lnet/minecraft/world/level/storage/loot/providers/number/BinomialDistributionGenerator;", cancellable = true)
    private static void binomial_1770971992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1770971992L))
            info.setReturnValue(null);
    }


}
