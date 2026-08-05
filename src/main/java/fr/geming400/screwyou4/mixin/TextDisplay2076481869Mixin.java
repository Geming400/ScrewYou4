package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.TextDisplay.class)
public class TextDisplay2076481869Mixin {
        @Inject(at = @At("HEAD"), method = "setFlags(B)V", cancellable = true)
    private void setFlags__1011032606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1011032606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setText(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setText_175303428(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(175303428L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getText()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getText__100426800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-100426800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlags()B", cancellable = true)
    private void getFlags_2114737884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2114737884L))
            info.setReturnValue(-64);
    }

    @Inject(at = @At("HEAD"), method = "setTextOpacity(B)V", cancellable = true)
    private void setTextOpacity__1011032606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1011032606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextOpacity()B", cancellable = true)
    private void getTextOpacity_2114737884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2114737884L))
            info.setReturnValue(-64);
    }

    @Inject(at = @At("HEAD"), method = "setBackgroundColor(I)V", cancellable = true)
    private void setBackgroundColor__1004567959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1004567959L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBackgroundColor()I", cancellable = true)
    private void getBackgroundColor_2114744611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2114744611L))
            info.setReturnValue(436031308);
    }

    @Inject(at = @At("HEAD"), method = "textRenderState()Lnet/minecraft/world/entity/Display$TextDisplay$TextRenderState;", cancellable = true)
    private void textRenderState_1948348313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948348313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cacheDisplay(Lnet/minecraft/world/entity/Display$TextDisplay$LineSplitter;)Lnet/minecraft/world/entity/Display$TextDisplay$CachedInfo;", cancellable = true)
    private void cacheDisplay_1687398757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1687398757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLineWidth(I)V", cancellable = true)
    private void setLineWidth__1004567959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1004567959L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLineWidth()I", cancellable = true)
    private void getLineWidth_2114744611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2114744611L))
            info.setReturnValue(436031308);
    }

    @Inject(at = @At("HEAD"), method = "getAlign(B)Lnet/minecraft/world/entity/Display$TextDisplay$Align;", cancellable = true)
    private static void getAlign__704843800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-704843800L))
            info.setReturnValue(net.minecraft.world.entity.Display.TextDisplay.Align.CENTER);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__572735983(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-572735983L))
            info.cancel();
    }


}
