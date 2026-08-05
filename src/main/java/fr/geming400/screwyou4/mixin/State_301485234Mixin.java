package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ServerData.State.class)
public class State_301485234Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/ServerData$State;", cancellable = true)
    private static void values_1607851831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1607851831L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/ServerData$State;", cancellable = true)
    private static void valueOf__330425264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-330425264L))
            info.setReturnValue(net.minecraft.client.multiplayer.ServerData.State.INCOMPATIBLE);
    }


}
