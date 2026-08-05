package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.Rect2i.class)
public class Rect2i633878497Mixin {
        @Inject(at = @At("HEAD"), method = "contains(II)Z", cancellable = true)
    private void contains__361997128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-361997128L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY_672140743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672140743L))
            info.setReturnValue(719626475);
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_672140743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672140743L))
            info.setReturnValue(719626475);
    }

    @Inject(at = @At("HEAD"), method = "intersect(Lnet/minecraft/client/renderer/Rect2i;)Lnet/minecraft/client/renderer/Rect2i;", cancellable = true)
    private void intersect__1517517984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1517517984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setWidth(I)V", cancellable = true)
    private void setWidth_1847795469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1847795469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHeight(I)V", cancellable = true)
    private void setHeight_1847795469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1847795469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_672140743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672140743L))
            info.setReturnValue(719626475);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_672140743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672140743L))
            info.setReturnValue(719626475);
    }

    @Inject(at = @At("HEAD"), method = "setY(I)V", cancellable = true)
    private void setY_1847795469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1847795469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setX(I)V", cancellable = true)
    private void setX_1847795469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1847795469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPosition(II)V", cancellable = true)
    private void setPosition__362000972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-362000972L))
            info.cancel();
    }


}
