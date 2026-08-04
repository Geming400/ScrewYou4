package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerLinks.KnownLinkType.class)
public class KnownLinkType1988506355Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/ServerLinks$KnownLinkType;", cancellable = true)
    private static void values_88679905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88679905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/ServerLinks$KnownLinkType;", cancellable = true)
    private static void valueOf__262130082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-262130082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/net/URI;)Lnet/minecraft/server/ServerLinks$Entry;", cancellable = true)
    private void create__429913933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429913933L))
            info.setReturnValue(null);
    }


}
