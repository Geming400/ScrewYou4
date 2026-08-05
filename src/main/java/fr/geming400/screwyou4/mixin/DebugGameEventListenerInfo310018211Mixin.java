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
            info.setReturnValue("v)I⠸F{\"XpZ&]7]MꚈo唍CnK勡>9KZdw)W'窡qa&u^tbM䪦jbvǁZj$I@:Ṧ}lﶛ}@s@}刺'g59齎縌캻!y5饪Gു+Z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_348280953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348280953L))
            info.setReturnValue(142624364);
    }

    @Inject(at = @At("HEAD"), method = "listenerRadius()I", cancellable = true)
    private void listenerRadius_348280457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348280457L))
            info.setReturnValue(-1156287922);
    }


}
