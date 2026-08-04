package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.LoadingDotsText.class)
public class LoadingDotsText93381797Mixin {
        @Inject(at = @At("HEAD"), method = "get(J)Ljava/lang/String;", cancellable = true)
    private static void get_929423468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929423468L))
            info.setReturnValue(null);
    }


}
