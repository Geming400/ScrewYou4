package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.TextDisplay.class)
public class TextDisplay2076481869Mixin {
        @Inject(at = @At("HEAD"), method = "setFlags(B)V", cancellable = true)
    private void setFlags_1392985447(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1392985447L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setText(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setText_561905397(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(561905397L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getText()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getText__271938125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-271938125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlags()B", cancellable = true)
    private void getFlags__1214243669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1214243669L))
            info.setReturnValue(-31);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1511751079(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1511751079L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLineWidth(I)V", cancellable = true)
    private void setLineWidth_929523289(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(929523289L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cacheDisplay(Lnet/minecraft/world/entity/Display$TextDisplay$LineSplitter;)Lnet/minecraft/world/entity/Display$TextDisplay$CachedInfo;", cancellable = true)
    private void cacheDisplay_70321221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(70321221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLineWidth()I", cancellable = true)
    private void getLineWidth__1454774489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1454774489L))
            info.setReturnValue(1911776150);
    }

    @Inject(at = @At("HEAD"), method = "setTextOpacity(B)V", cancellable = true)
    private void setTextOpacity__1282969282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1282969282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBackgroundColor()I", cancellable = true)
    private void getBackgroundColor_1830958052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1830958052L))
            info.setReturnValue(1889722922);
    }

    @Inject(at = @At("HEAD"), method = "getTextOpacity()B", cancellable = true)
    private void getTextOpacity__1892199692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892199692L))
            info.setReturnValue(-72);
    }

    @Inject(at = @At("HEAD"), method = "setBackgroundColor(I)V", cancellable = true)
    private void setBackgroundColor__2016097732(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2016097732L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textRenderState()Lnet/minecraft/world/entity/Display$TextDisplay$TextRenderState;", cancellable = true)
    private void textRenderState__1393349177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1393349177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAlign(B)Lnet/minecraft/world/entity/Display$TextDisplay$Align;", cancellable = true)
    private static void getAlign__1609083591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1609083591L))
            info.setReturnValue(net.minecraft.world.entity.Display.TextDisplay.Align.LEFT);
    }


}
