package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugBeeInfo.class)
public class DebugBeeInfo869023113Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__39603155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-39603155L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1639446638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1639446638L))
            info.setReturnValue("KB5fN\u7CEEj\u8E3B7Y50A]6\u0F71^bZwq/m3\u476FB6N\u5D68\uB354@Rn*NWiGdnk\u22B11`k\uAFD8,a' 73g_[\uCEEA7'(!.mG\"<@(btJ,\u5C62?:\u18EFJ`.CTFa?]nPQ97B=b@.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1426375204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426375204L))
            info.setReturnValue(582465221);
    }

    @Inject(at = @At("HEAD"), method = "blacklistedHives()Ljava/util/List;", cancellable = true)
    private void blacklistedHives__854385632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-854385632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "travelTicks()I", cancellable = true)
    private void travelTicks__744944269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744944269L))
            info.setReturnValue(226575138);
    }

    @Inject(at = @At("HEAD"), method = "hivePos()Ljava/util/Optional;", cancellable = true)
    private void hivePos_761235451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761235451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasHive(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void hasHive_1148041150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1148041150L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "flowerPos()Ljava/util/Optional;", cancellable = true)
    private void flowerPos__573738448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-573738448L))
            info.setReturnValue(null);
    }


}
