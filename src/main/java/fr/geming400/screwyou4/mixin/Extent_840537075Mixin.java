package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.FaceInfo.Extent.class)
public class Extent_840537075Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/FaceInfo$Extent;", cancellable = true)
    private static void values_2127700526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127700526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/FaceInfo$Extent;", cancellable = true)
    private static void valueOf_176721425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(176721425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(FFFFFF)F", cancellable = true)
    private void select_646515413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646515413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Lorg/joml/Vector3fc;Lorg/joml/Vector3fc;)F", cancellable = true)
    private void select__388606951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-388606951L))
            info.setReturnValue(null);
    }


}
