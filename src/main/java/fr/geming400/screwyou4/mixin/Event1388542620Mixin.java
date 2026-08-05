package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.timers.TimerQueue.Event.class)
public class Event1388542620Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1520912417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520912417L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_253082645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253082645L))
            info.setReturnValue("1rKj3⠖&dNV곿'jpO.>k칎[DሼC2 __ J羺%䖑Jm_]Mo嬼iPAp/bpd墻X谁,3|fY롺gY,f53l@0eV}wkﺒSYt1[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1426805362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426805362L))
            info.setReturnValue(-1880021405);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_253082149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253082149L))
            info.setReturnValue("O`<A❎&YUA?熡mwЙllXY{|#椖_,<$");
    }

    @Inject(at = @At("HEAD"), method = "callback()Lnet/minecraft/world/level/timers/TimerCallback;", cancellable = true)
    private void callback__609777595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609777595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerTime()J", cancellable = true)
    private void triggerTime_1426805827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426805827L))
            info.setReturnValue(6850223680151332543L);
    }

    @Inject(at = @At("HEAD"), method = "sequentialId()Lcom/google/common/primitives/UnsignedLong;", cancellable = true)
    private void sequentialId_547619880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(547619880L))
            info.setReturnValue(null);
    }


}
