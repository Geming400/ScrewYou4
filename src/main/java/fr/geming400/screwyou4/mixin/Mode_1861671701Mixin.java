package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.SetBlockCommand.Mode.class)
public class Mode_1861671701Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/commands/SetBlockCommand$Mode;", cancellable = true)
    private static void values__1532766275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1532766275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/commands/SetBlockCommand$Mode;", cancellable = true)
    private static void valueOf_345268666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345268666L))
            info.setReturnValue(null);
    }


}
