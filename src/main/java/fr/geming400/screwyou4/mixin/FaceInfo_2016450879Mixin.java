package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.FaceInfo.class)
public class FaceInfo_2016450879Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/FaceInfo;", cancellable = true)
    private static void values_1083873238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1083873238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/FaceInfo;", cancellable = true)
    private static void valueOf__1686866605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1686866605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromFacing(Lnet/minecraft/core/Direction;)Lnet/minecraft/client/renderer/FaceInfo;", cancellable = true)
    private static void fromFacing__932056815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932056815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVertexInfo(I)Lnet/minecraft/client/renderer/FaceInfo$VertexInfo;", cancellable = true)
    private void getVertexInfo__1854836020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1854836020L))
            info.setReturnValue(null);
    }


}
