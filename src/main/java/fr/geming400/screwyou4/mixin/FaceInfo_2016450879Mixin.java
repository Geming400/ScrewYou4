package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.FaceInfo.class)
public class FaceInfo_2016450879Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/FaceInfo;", cancellable = true)
    private static void values__711923212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711923212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/FaceInfo;", cancellable = true)
    private static void valueOf_297525883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(297525883L))
            info.setReturnValue(net.minecraft.client.renderer.FaceInfo.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "getVertexInfo(I)Lnet/minecraft/client/renderer/FaceInfo$VertexInfo;", cancellable = true)
    private void getVertexInfo_732949300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(732949300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromFacing(Lnet/minecraft/core/Direction;)Lnet/minecraft/client/renderer/FaceInfo;", cancellable = true)
    private static void fromFacing_2016927797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2016927797L))
            info.setReturnValue(net.minecraft.client.renderer.FaceInfo.DOWN);
    }


}
