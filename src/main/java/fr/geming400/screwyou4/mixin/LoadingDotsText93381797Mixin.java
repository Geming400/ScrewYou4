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
            info.setReturnValue("e䯵/pOs+鲪J=袕_xv$E)[`86㓥:!'C(r$x6N^}.YlnIB]]D?왽kg9Rot9Bㇽ\"UVkpRC\"Q^*T,䀶vZ⋂/Y)YA햼][1-_@f姯z琄䞚");
    }


}
