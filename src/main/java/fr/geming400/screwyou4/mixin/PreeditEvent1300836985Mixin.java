package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.input.PreeditEvent.class)
public class PreeditEvent1300836985Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1608618052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1608618052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_165377010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165377010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1339099727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1339099727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blocks()Ljava/util/List;", cancellable = true)
    private void blocks__1367793495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1367793495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "focusedBlock()I", cancellable = true)
    private void focusedBlock_1339099231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1339099231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFromCallback(IJIJII)Lnet/minecraft/client/input/PreeditEvent;", cancellable = true)
    private static void createFromCallback__1672377259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672377259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fullText()Ljava/lang/String;", cancellable = true)
    private void fullText_165376514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165376514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toFormattedText(Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void toFormattedText_2129895396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2129895396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "caretPosition()I", cancellable = true)
    private void caretPosition_1339099231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1339099231L))
            info.setReturnValue(null);
    }


}
