package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.Player.BedSleepingProblem.class)
public class BedSleepingProblem_1901934816Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1007520222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1007520222L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_766474840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(766474840L))
            info.setReturnValue("'4+B7py)x:u}:bx}Gl앁VE&Iy}vRBQr'd%:%,n'jw17PK7Fp<eC貟)tr");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1940197557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1940197557L))
            info.setReturnValue(172006432);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void message__274974350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-274974350L))
            info.setReturnValue(null);
    }


}
