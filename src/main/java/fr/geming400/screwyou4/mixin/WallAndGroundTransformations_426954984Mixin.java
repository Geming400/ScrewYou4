package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.WallAndGroundTransformations.class)
public class WallAndGroundTransformations_426954984Mixin {
        @Inject(at = @At("HEAD"), method = "wallTransformation(Lnet/minecraft/core/Direction;)Ljava/lang/Object;", cancellable = true)
    private void wallTransformation_1371222505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1371222505L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "freeTransformations(I)Ljava/lang/Object;", cancellable = true)
    private void freeTransformations__129556757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-129556757L))
            info.setReturnValue(new java.lang.Object());
    }


}
