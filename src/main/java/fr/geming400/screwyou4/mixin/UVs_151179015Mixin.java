package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.CuboidFace.UVs.class)
public class UVs_151179015Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1536691273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1536691273L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__984280961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-984280961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_189441756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(189441756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxV()F", cancellable = true)
    private void maxV_189438377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(189438377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxU()F", cancellable = true)
    private void maxU_189438377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(189438377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minV()F", cancellable = true)
    private void minV_189438377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(189438377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minU()F", cancellable = true)
    private void minU_189438377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(189438377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVertexU(I)F", cancellable = true)
    private void getVertexU_1365080610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1365080610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVertexV(I)F", cancellable = true)
    private void getVertexV_1365080610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1365080610L))
            info.setReturnValue(null);
    }


}
