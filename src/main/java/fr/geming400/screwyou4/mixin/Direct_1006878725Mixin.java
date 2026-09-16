package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.HolderSet.Direct.class)
public class Direct_1006878725Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_98251960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98251960L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1777301753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1777301753L))
            info.setReturnValue("S\uFE0D\u8865.p$snfaR'9{3c_Yj@Wu]@']mF\u0760mxB\u4100djDB\u9248{e.'T{^z\uD6D2\uB781&O[.A,hRIe,x9,\u77D8-,yh*\u13B4KC<\u04ECI%K>D,\uB34B:DvZje");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1564230319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1564230319L))
            info.setReturnValue(-1215261772);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void contains_807821225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807821225L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void unwrap_476703576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476703576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBound()Z", cancellable = true)
    private void isBound_1828444103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1828444103L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "unwrapKey()Ljava/util/Optional;", cancellable = true)
    private void unwrapKey_1528691374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1528691374L))
            info.setReturnValue(null);
    }


}
