package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.WallAndGroundTransformations.class)
public class WallAndGroundTransformations_426954984Mixin {
        @Inject(at = @At("HEAD"), method = "wallTransformation(Lnet/minecraft/core/Direction;)Ljava/lang/Object;", cancellable = true)
    private void wallTransformation_223309302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(223309302L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "freeTransformations(I)Ljava/lang/Object;", cancellable = true)
    private void freeTransformations_2000738089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2000738089L))
            info.setReturnValue(new java.lang.Object());
    }


}
