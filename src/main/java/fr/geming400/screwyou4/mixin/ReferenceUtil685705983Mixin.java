package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.api.ReferenceUtil.class)
public class ReferenceUtil685705983Mixin {
        @Inject(at = @At("HEAD"), method = "createLocalReference(Ljava/lang/String;)Ljava/net/URI;", cancellable = true)
    private static void createLocalReference__602652790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-602652790L))
            info.setReturnValue(null);
    }


}
