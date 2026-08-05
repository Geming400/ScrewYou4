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
            info.setReturnValue("7韱`9OmW-\"0,謲0T霬&#=Qe<LU-h<.C(JQ^rHw/|WK_巟<TH牊d`?1||0F\"⭿1@EGoc]_n+uᔊ$Xっ}䓣bCdCsˢLuJ)MKp1P?I*Vy");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_140712109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(140712109L))
            info.setReturnValue(149104951);
    }

    @Inject(at = @At("HEAD"), method = "getId()Ljava/lang/String;", cancellable = true)
    private void getId__1033011104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033011104L))
            info.setReturnValue(";LR旂{$,bs3Ph>⠆YV4l_N.mWsN9C)eH.q0jj꒴x퀅{6)x");
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1790937512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790937512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation()I", cancellable = true)
    private void rotation_140711613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(140711613L))
            info.setReturnValue(-1223679124);
    }

    @Inject(at = @At("HEAD"), method = "entityId()I", cancellable = true)
    private void entityId_140711613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(140711613L))
            info.setReturnValue(-1223679124);
    }

    @Inject(at = @At("HEAD"), method = "frameId(Lnet/minecraft/core/BlockPos;)Ljava/lang/String;", cancellable = true)
    private static void frameId_1074019844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1074019844L))
            info.setReturnValue("T짢4`拶(O3hD\"o(y)W!]}TBPM'WxfZ,S!m))SCXBRPG;-9ZaP4xlF8⥫6&6ㆪE{yJ");
    }


}
