package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.GuiItemAtlas.SlotView.class)
public class SlotView1591034772Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_682408504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(682408504L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1933508999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1933508999L))
            info.setReturnValue("GB\u7B54KfJNXu\uFFA9^=\uBF8C\uAB3B&o8kyJ3OMIHh\uB0ED^\"c^\u73DA&s\u8C74c\u5B1D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2146580433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2146580433L))
            info.setReturnValue(-1654741269);
    }

    @Inject(at = @At("HEAD"), method = "v1()F", cancellable = true)
    private void v1_383374492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(383374492L))
            info.setReturnValue(1.599121E8F);
    }

    @Inject(at = @At("HEAD"), method = "u1()F", cancellable = true)
    private void u1__504129189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-504129189L))
            info.setReturnValue(1.599121E8F);
    }

    @Inject(at = @At("HEAD"), method = "v0()F", cancellable = true)
    private void v0_354745341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(354745341L))
            info.setReturnValue(1.599121E8F);
    }

    @Inject(at = @At("HEAD"), method = "u0()F", cancellable = true)
    private void u0__532758340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532758340L))
            info.setReturnValue(1.599121E8F);
    }

    @Inject(at = @At("HEAD"), method = "textureView()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void textureView__1655371486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1655371486L))
            info.setReturnValue(null);
    }


}
