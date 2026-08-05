package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.server.PackLoadFeedback.Update.class)
public class Update_492163757Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/server/PackLoadFeedback$Update;", cancellable = true)
    private static void values_818267770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(818267770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/server/PackLoadFeedback$Update;", cancellable = true)
    private static void valueOf_1284908563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1284908563L))
            info.setReturnValue(net.minecraft.client.resources.server.PackLoadFeedback.Update.ACCEPTED);
    }


}
