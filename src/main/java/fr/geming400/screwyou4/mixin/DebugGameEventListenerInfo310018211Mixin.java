package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugGameEventListenerInfo.class)
public class DebugGameEventListenerInfo310018211Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__598608057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-598608057L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1080441736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1080441736L))
            info.setReturnValue("s0\u67BCT\u9C34/A:T+HIKPB&r`Yef9 T!5ggBx$M?Jc^Hp&:Y>&VAN+x>W8usSn-nXj\uAE54<w.o:C\u3532h=\uB242.(4LCLR\uB9EBzwkli");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_867370302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867370302L))
            info.setReturnValue(-947497956);
    }

    @Inject(at = @At("HEAD"), method = "listenerRadius()I", cancellable = true)
    private void listenerRadius__1423073309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1423073309L))
            info.setReturnValue(-1097811194);
    }


}
