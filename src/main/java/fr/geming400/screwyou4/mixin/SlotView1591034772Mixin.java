package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.GuiItemAtlas.SlotView.class)
public class SlotView1591034772Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1318420265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1318420265L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_455574797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(455574797L))
            info.setReturnValue("\u9BE4+O^9U6w\uB518\u3D9Fa``qT$YNyp@C1y\uAC0F9^c9N.W9'Ro}VXIyZXTu\uA733A[pA6lt%/,\uBAC9\"NxpHTL");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1629297514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629297514L))
            info.setReturnValue(8638789);
    }

    @Inject(at = @At("HEAD"), method = "v1()F", cancellable = true)
    private void v1_1629294135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629294135L))
            info.setReturnValue(3.686629E8F);
    }

    @Inject(at = @At("HEAD"), method = "u1()F", cancellable = true)
    private void u1_1629294135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629294135L))
            info.setReturnValue(3.686629E8F);
    }

    @Inject(at = @At("HEAD"), method = "v0()F", cancellable = true)
    private void v0_1629294135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629294135L))
            info.setReturnValue(3.686629E8F);
    }

    @Inject(at = @At("HEAD"), method = "u0()F", cancellable = true)
    private void u0_1629294135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629294135L))
            info.setReturnValue(3.686629E8F);
    }

    @Inject(at = @At("HEAD"), method = "textureView()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void textureView__809579838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-809579838L))
            info.setReturnValue(null);
    }


}
