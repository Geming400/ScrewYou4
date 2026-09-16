package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.FaceInfo.Extent.class)
public class Extent_840537075Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/FaceInfo$Extent;", cancellable = true)
    private static void values__706817456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706817456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/FaceInfo$Extent;", cancellable = true)
    private static void valueOf_1638630377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1638630377L))
            info.setReturnValue(net.minecraft.client.renderer.FaceInfo.Extent.MIN_Y);
    }

    @Inject(at = @At("HEAD"), method = "select(FFFFFF)F", cancellable = true)
    private void select_530587737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530587737L))
            info.setReturnValue(4.042631E8F);
    }

    @Inject(at = @At("HEAD"), method = "select(Lorg/joml/Vector3fc;Lorg/joml/Vector3fc;)F", cancellable = true)
    private void select__1414854499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1414854499L))
            info.setReturnValue(4.042631E8F);
    }


}
