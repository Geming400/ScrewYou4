package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.CuboidFace.UVs.class)
public class UVs_151179015Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__757447254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-757447254L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_921602539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(921602539L))
            info.setReturnValue("\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_708531105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708531105L))
            info.setReturnValue(-1279815687);
    }

    @Inject(at = @At("HEAD"), method = "maxV()F", cancellable = true)
    private void maxV__412325513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-412325513L))
            info.setReturnValue(6.22599E7F);
    }

    @Inject(at = @At("HEAD"), method = "minU()F", cancellable = true)
    private void minU_331523910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(331523910L))
            info.setReturnValue(6.22599E7F);
    }

    @Inject(at = @At("HEAD"), method = "maxU()F", cancellable = true)
    private void maxU__440954664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-440954664L))
            info.setReturnValue(6.22599E7F);
    }

    @Inject(at = @At("HEAD"), method = "minV()F", cancellable = true)
    private void minV_360153061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(360153061L))
            info.setReturnValue(6.22599E7F);
    }

    @Inject(at = @At("HEAD"), method = "getVertexU(I)F", cancellable = true)
    private void getVertexU__933900067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-933900067L))
            info.setReturnValue(6.22599E7F);
    }

    @Inject(at = @At("HEAD"), method = "getVertexV(I)F", cancellable = true)
    private void getVertexV__46396386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-46396386L))
            info.setReturnValue(6.22599E7F);
    }


}
