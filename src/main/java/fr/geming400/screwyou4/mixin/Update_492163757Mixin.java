package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.server.PackLoadFeedback.Update.class)
public class Update_492163757Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/server/PackLoadFeedback$Update;", cancellable = true)
    private static void values__225863080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-225863080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/server/PackLoadFeedback$Update;", cancellable = true)
    private static void valueOf__659955653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659955653L))
            info.setReturnValue(net.minecraft.client.resources.server.PackLoadFeedback.Update.ACCEPTED);
    }


}
