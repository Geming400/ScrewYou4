package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.CustomHeadLayer.Transforms.class)
public class Transforms_1662747573Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1246707465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1246707465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_527287597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(527287597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1701010314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701010314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yOffset()F", cancellable = true)
    private void yOffset_1701006935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701006935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontalScale()F", cancellable = true)
    private void horizontalScale_1701006935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701006935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "skullYOffset()F", cancellable = true)
    private void skullYOffset_1701006935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701006935L))
            info.setReturnValue(null);
    }


}
