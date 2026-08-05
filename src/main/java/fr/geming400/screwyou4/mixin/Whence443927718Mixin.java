package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.Whence.class)
public class Whence443927718Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/components/Whence;", cancellable = true)
    private static void values__2141874894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2141874894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/components/Whence;", cancellable = true)
    private static void valueOf_1169355321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1169355321L))
            info.setReturnValue(net.minecraft.client.gui.components.Whence.END);
    }


}
