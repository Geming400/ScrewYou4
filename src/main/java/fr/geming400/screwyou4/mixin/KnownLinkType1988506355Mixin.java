package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerLinks.KnownLinkType.class)
public class KnownLinkType1988506355Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/ServerLinks$KnownLinkType;", cancellable = true)
    private static void values__1882031617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1882031617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/ServerLinks$KnownLinkType;", cancellable = true)
    private static void valueOf_2107374470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2107374470L))
            info.setReturnValue(net.minecraft.server.ServerLinks.KnownLinkType.SUPPORT);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/net/URI;)Lnet/minecraft/server/ServerLinks$Entry;", cancellable = true)
    private void create__1334626641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1334626641L))
            info.setReturnValue(null);
    }


}
