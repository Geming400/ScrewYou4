package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.EmptyArea.class)
public class EmptyArea1224738364Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1684716673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1684716673L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_89278389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(89278389L))
            info.setReturnValue("@O4|9k.6H-6Qe@d7d*=죆r!m$8>x{KB:Y<C轧2OVTLOb#4+wlpBhwIꚄ2=DL=oퟋS");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1263001106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263001106L))
            info.setReturnValue(-923361899);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x_1262997727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262997727L))
            info.setReturnValue(8.522854E8F);
    }

    @Inject(at = @At("HEAD"), method = "advance()F", cancellable = true)
    private void advance_1262997727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262997727L))
            info.setReturnValue(8.532858E8F);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y_1262997727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262997727L))
            info.setReturnValue(8.532858E8F);
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void style_915131675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(915131675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ascent()F", cancellable = true)
    private void ascent_1262997727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262997727L))
            info.setReturnValue(8.532858E8F);
    }

    @Inject(at = @At("HEAD"), method = "height()F", cancellable = true)
    private void height_1262997727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262997727L))
            info.setReturnValue(8.532858E8F);
    }

    @Inject(at = @At("HEAD"), method = "activeBottom()F", cancellable = true)
    private void activeBottom_1262997727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262997727L))
            info.setReturnValue(8.532858E8F);
    }

    @Inject(at = @At("HEAD"), method = "activeRight()F", cancellable = true)
    private void activeRight_1262997727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262997727L))
            info.setReturnValue(8.532858E8F);
    }

    @Inject(at = @At("HEAD"), method = "activeLeft()F", cancellable = true)
    private void activeLeft_1262997727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262997727L))
            info.setReturnValue(8.532858E8F);
    }

    @Inject(at = @At("HEAD"), method = "activeTop()F", cancellable = true)
    private void activeTop_1262997727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262997727L))
            info.setReturnValue(8.532858E8F);
    }


}
