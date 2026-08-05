package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugGameEventListenerInfo.class)
public class DebugGameEventListenerInfo310018211Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1695530470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1695530470L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__825441764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-825441764L))
            info.setReturnValue("v)I\u2838F{\"XpZ&]7]M\uA688o\u550DCnK\u52E1>9KZdw)W'\u7AA1qa&u^tbM\u4AA6jbv\u01C1Zj$I@:\u1E66}l\uFD9B}@s@}\uF9FF'g59\u9F4E\u7E0C\uCEBB!y5\u996AG\u0D41+Z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_348280953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348280953L))
            info.setReturnValue(-290266936);
    }

    @Inject(at = @At("HEAD"), method = "listenerRadius()I", cancellable = true)
    private void listenerRadius_348280457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348280457L))
            info.setReturnValue(-1589179222);
    }


}
