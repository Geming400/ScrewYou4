package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.DisplaySlot.class)
public class DisplaySlot_1964726174Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/scores/DisplaySlot;", cancellable = true)
    private static void values__1656461927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1656461927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/scores/DisplaySlot;", cancellable = true)
    private static void valueOf__132234474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-132234474L))
            info.setReturnValue(net.minecraft.world.scores.DisplaySlot.SIDEBAR);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_2002988419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2002988419L))
            info.setReturnValue(1070420589);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_829265702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(829265702L))
            info.setReturnValue("_TOx&/\u6657\u78B7qB0vFKmrZd\u01C9c3");
    }


}
