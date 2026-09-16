package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.flat.FlatLayerInfo.class)
public class FlatLayerInfo_1508941480Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2015602788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2015602788L))
            info.setReturnValue("=tW$.mvz\u5DF8eksd_hnq4\u7096kp+e\u6CCA\u9AA9 kC]kt>\u9B87:n85H\u691C+C7aFc\"g5\uB500Yk*G<8FdD");
    }

    @Inject(at = @At("HEAD"), method = "getBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__175851761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-175851761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heightLimited(I)Lnet/minecraft/world/level/levelgen/flat/FlatLayerInfo;", cancellable = true)
    private void heightLimited__195837600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-195837600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__216675696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-216675696L))
            info.setReturnValue(890045987);
    }


}
