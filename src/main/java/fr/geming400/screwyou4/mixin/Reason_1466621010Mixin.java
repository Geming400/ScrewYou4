package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.LevelLoadingScreen.Reason.class)
public class Reason_1466621010Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/screens/LevelLoadingScreen$Reason;", cancellable = true)
    private static void values_1099790840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099790840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/LevelLoadingScreen$Reason;", cancellable = true)
    private static void valueOf__393824523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-393824523L))
            info.setReturnValue(net.minecraft.client.gui.screens.LevelLoadingScreen.Reason.NETHER_PORTAL);
    }


}
