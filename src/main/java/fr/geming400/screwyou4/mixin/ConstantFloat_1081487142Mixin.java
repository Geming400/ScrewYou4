package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.ConstantFloat.class)
public class ConstantFloat_1081487142Mixin {
        @Inject(at = @At("HEAD"), method = "value()F", cancellable = true)
    private void value__1223186697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1223186697L))
            info.setReturnValue(6.902807E8F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_172860873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(172860873L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1851910170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1851910170L))
            info.setReturnValue("{8)J^(H4s?J\u63BBV%Dza");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1638839232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1638839232L))
            info.setReturnValue(-650059089);
    }

    @Inject(at = @At("HEAD"), method = "min()F", cancellable = true)
    private void min__339642698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339642698L))
            info.setReturnValue(6.902807E8F);
    }

    @Inject(at = @At("HEAD"), method = "max()F", cancellable = true)
    private void max_1436553956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1436553956L))
            info.setReturnValue(6.902807E8F);
    }

    @Inject(at = @At("HEAD"), method = "of(F)Lnet/minecraft/util/valueproviders/ConstantFloat;", cancellable = true)
    private static void of__1844956901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1844956901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2147034901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2147034901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)F", cancellable = true)
    private void sample_48422290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(48422290L))
            info.setReturnValue(6.912827E8F);
    }


}
