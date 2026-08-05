package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CrossbowItem.ChargingSounds.class)
public class ChargingSounds621053766Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2006566025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2006566025L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__514406209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-514406209L))
            info.setReturnValue("WNEo\uB425B");
    }

    @Inject(at = @At("HEAD"), method = "mid()Ljava/util/Optional;", cancellable = true)
    private void mid_866515188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866515188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_659316508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659316508L))
            info.setReturnValue(-1443453270);
    }

    @Inject(at = @At("HEAD"), method = "end()Ljava/util/Optional;", cancellable = true)
    private void end_866515188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866515188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start()Ljava/util/Optional;", cancellable = true)
    private void start_866515188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866515188L))
            info.setReturnValue(null);
    }


}
