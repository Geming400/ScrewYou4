package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapFrame.class)
public class MapFrame102449367Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1487961626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487961626L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1033010608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033010608L))
            info.setReturnValue("7\u97F1`9OmW-\"0,\u8B320T\u972C&#=Qe<LU-h<.C(JQ^rHw/|WK_\u5DDF<TH\u724Ad`?1||0F\"\u2B7F1@EGoc]_n+u\u150A$X\u3063}\u44E3bCdCs\u02E2LuJ)MKp1P?I*Vy");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_140712109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(140712109L))
            info.setReturnValue(-280050549);
    }

    @Inject(at = @At("HEAD"), method = "getId()Ljava/lang/String;", cancellable = true)
    private void getId__1033011104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033011104L))
            info.setReturnValue(";LR\u65C2{$,bs3Ph>\u2806YV4l_N.mWsN9C)eH.q0jj\uA4B4x\uD005{6)x");
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1790937512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790937512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityId()I", cancellable = true)
    private void entityId_140711613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(140711613L))
            info.setReturnValue(-1652834624);
    }

    @Inject(at = @At("HEAD"), method = "rotation()I", cancellable = true)
    private void rotation_140711613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(140711613L))
            info.setReturnValue(-1652834624);
    }

    @Inject(at = @At("HEAD"), method = "frameId(Lnet/minecraft/core/BlockPos;)Ljava/lang/String;", cancellable = true)
    private static void frameId_1074019844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1074019844L))
            info.setReturnValue("T\uC9E24`\u62F6(O3hD\"o(y)W!]}TBPM'WxfZ,S!m))SCXBRPG;-9ZaP4xlF8\u296B6&6\u31AAE{yJ");
    }


}
