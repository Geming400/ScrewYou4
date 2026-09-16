package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.EmptyArea.class)
public class EmptyArea1224738364Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_316112096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(316112096L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1995161889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1995161889L))
            info.setReturnValue("amf:5lw=lG8J:A5P\u1823 :bqQ|;?2kx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1782090455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1782090455L))
            info.setReturnValue(1051573781);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x_403528551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(403528551L))
            info.setReturnValue(3.026039E8F);
    }

    @Inject(at = @At("HEAD"), method = "advance()F", cancellable = true)
    private void advance__354866787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-354866787L))
            info.setReturnValue(3.03603E8F);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y_432157702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432157702L))
            info.setReturnValue(3.03603E8F);
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void style_310648332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(310648332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()F", cancellable = true)
    private void height_139386904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139386904L))
            info.setReturnValue(3.03603E8F);
    }

    @Inject(at = @At("HEAD"), method = "activeLeft()F", cancellable = true)
    private void activeLeft__945470254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945470254L))
            info.setReturnValue(3.03603E8F);
    }

    @Inject(at = @At("HEAD"), method = "activeTop()F", cancellable = true)
    private void activeTop__1997006384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1997006384L))
            info.setReturnValue(3.03603E8F);
    }

    @Inject(at = @At("HEAD"), method = "ascent()F", cancellable = true)
    private void ascent_1176149061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1176149061L))
            info.setReturnValue(3.03603E8F);
    }

    @Inject(at = @At("HEAD"), method = "activeBottom()F", cancellable = true)
    private void activeBottom__1516666194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516666194L))
            info.setReturnValue(3.03603E8F);
    }

    @Inject(at = @At("HEAD"), method = "activeRight()F", cancellable = true)
    private void activeRight_409717737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409717737L))
            info.setReturnValue(3.03603E8F);
    }


}
