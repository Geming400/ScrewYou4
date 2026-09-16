package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.pip.GuiEntityRenderState.class)
public class GuiEntityRenderState1030075169Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_121448901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(121448901L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1800498694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1800498694L))
            info.setReturnValue("\uB1B6ZNW\u078F:MpR`vvsEE-fX&hgFc2[Am($QjHZaCU\u41E8\u5C192=+eRvof$?:d],\u5816n\u3050;\u5D76H\u319F!;c8)>(&]\"ZaK{}1WgG");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1587427260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1587427260L))
            info.setReturnValue(541231097);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale__1393642822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1393642822L))
            info.setReturnValue(3.964938E8F);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds__1436857180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1436857180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_1597425134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1597425134L))
            info.setReturnValue(-1642618764);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1__1810038481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1810038481L))
            info.setReturnValue(1449111428);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_1568795983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1568795983L))
            info.setReturnValue(-35213138);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0__1838667632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1838667632L))
            info.setReturnValue(-1227677273);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lorg/joml/Quaternionfc;", cancellable = true)
    private void rotation__749110580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-749110580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void renderState_289400864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289400864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translation()Lorg/joml/Vector3fc;", cancellable = true)
    private void translation__211200173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-211200173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea__1494825136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1494825136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideCameraAngle()Lorg/joml/Quaternionfc;", cancellable = true)
    private void overrideCameraAngle__370792824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-370792824L))
            info.setReturnValue(null);
    }


}
