package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.tooltip.ClientActivePlayersTooltip.ActivePlayersTooltip.class)
public class ActivePlayersTooltip_552945149Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__355681120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-355681120L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1323368673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1323368673L))
            info.setReturnValue("^#VZZ\u5CDDxSU+C!v(f\uB6BB\u5D90i`o\u0DDB\uC59E;^3,OD$dX^[C%Jmm{#KN;#;\u4A99#GAfNKaa,Sm$];[_%=`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1110297239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1110297239L))
            info.setReturnValue(467842728);
    }

    @Inject(at = @At("HEAD"), method = "profiles()Ljava/util/List;", cancellable = true)
    private void profiles_1089783574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1089783574L))
            info.setReturnValue(null);
    }


}
