package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.ScoreboardSaveData.Packed.class)
public class Packed421532523Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1807044782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1807044782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__713927452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-713927452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_459795265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(459795265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "objectives()Ljava/util/List;", cancellable = true)
    private void objectives_2047869339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2047869339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scores()Ljava/util/List;", cancellable = true)
    private void scores_2047869339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2047869339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teams()Ljava/util/List;", cancellable = true)
    private void teams_2047869339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2047869339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displaySlots()Ljava/util/Map;", cancellable = true)
    private void displaySlots__1583091117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1583091117L))
            info.setReturnValue(null);
    }


}
