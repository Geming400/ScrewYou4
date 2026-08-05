package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.input.KeyEvent.class)
public class KeyEvent_1518194297Mixin {
        @Inject(at = @At("HEAD"), method = "modifiers()I", cancellable = true)
    private void modifiers_1556456542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556456542L))
            info.setReturnValue(647578695);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1391260741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1391260741L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_382734321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(382734321L))
            info.setReturnValue("[繄0抍#mڨ`A/j'q,Q_駫ᰁF┈驌Pt");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1556457038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556457038L))
            info.setReturnValue(444431275);
    }

    @Inject(at = @At("HEAD"), method = "key()I", cancellable = true)
    private void key_1556456542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556456542L))
            info.setReturnValue(647578695);
    }

    @Inject(at = @At("HEAD"), method = "input()I", cancellable = true)
    private void input_1556456542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556456542L))
            info.setReturnValue(647578695);
    }

    @Inject(at = @At("HEAD"), method = "scancode()I", cancellable = true)
    private void scancode_1556456542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556456542L))
            info.setReturnValue(647578695);
    }


}
