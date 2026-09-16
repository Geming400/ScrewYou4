package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.input.KeyEvent.class)
public class KeyEvent_1518194297Mixin {
        @Inject(at = @At("HEAD"), method = "modifiers()I", cancellable = true)
    private void modifiers_2049259874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049259874L))
            info.setReturnValue(1864217483);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_609568028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609568028L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2006349475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2006349475L))
            info.setReturnValue("\u01B2ln'G/\"\u6113N69L\uB458TX\uA1DCuRt% l\uAE93<0m\u35E65X\u1E3E&RDw@9-O\u1C23]-)\u4D7B\u3256BhSTT!R5>$jT*L");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2075546387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2075546387L))
            info.setReturnValue(-1085996494);
    }

    @Inject(at = @At("HEAD"), method = "key()I", cancellable = true)
    private void key_1966287199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1966287199L))
            info.setReturnValue(-1264244762);
    }

    @Inject(at = @At("HEAD"), method = "input()I", cancellable = true)
    private void input__1443128620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1443128620L))
            info.setReturnValue(-1578778890);
    }

    @Inject(at = @At("HEAD"), method = "scancode()I", cancellable = true)
    private void scancode__1796417356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1796417356L))
            info.setReturnValue(-1965400071);
    }


}
