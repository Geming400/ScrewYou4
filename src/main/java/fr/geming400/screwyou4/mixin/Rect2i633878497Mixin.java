package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.Rect2i.class)
public class Rect2i633878497Mixin {
        @Inject(at = @At("HEAD"), method = "contains(II)Z", cancellable = true)
    private void contains__1902996039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1902996039L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY_1537315812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1537315812L))
            info.setReturnValue(1516782692);
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_1508686661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508686661L))
            info.setReturnValue(-1747705283);
    }

    @Inject(at = @At("HEAD"), method = "intersect(Lnet/minecraft/client/renderer/Rect2i;)Lnet/minecraft/client/renderer/Rect2i;", cancellable = true)
    private void intersect_589779583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(589779583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth__1304017993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1304017993L))
            info.setReturnValue(1760577830);
    }

    @Inject(at = @At("HEAD"), method = "setY(I)V", cancellable = true)
    private void setY_540256772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(540256772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setX(I)V", cancellable = true)
    private void setX__347246909(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-347246909L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPosition(II)V", cancellable = true)
    private void setPosition_666120105(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(666120105L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWidth(I)V", cancellable = true)
    private void setWidth__1055319407(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1055319407L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHeight(I)V", cancellable = true)
    private void setHeight__382106506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-382106506L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__1091738678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1091738678L))
            info.setReturnValue(1723205937);
    }


}
