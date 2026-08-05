package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.narration.NarratedElementType.class)
public class NarratedElementType1309436723Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/narration/NarratedElementType;", cancellable = true)
    private static void values_1332577392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1332577392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/narration/NarratedElementType;", cancellable = true)
    private static void valueOf_272404215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(272404215L))
            info.setReturnValue(net.minecraft.client.gui.narration.NarratedElementType.HINT);
    }


}
