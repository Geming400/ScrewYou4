package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.SetBlockCommand.Mode.class)
public class Mode_1861671701Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/commands/SetBlockCommand$Mode;", cancellable = true)
    private static void values_1678372059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1678372059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/commands/SetBlockCommand$Mode;", cancellable = true)
    private static void valueOf_1721324258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1721324258L))
            info.setReturnValue(net.minecraft.server.commands.SetBlockCommand.Mode.DESTROY);
    }


}
