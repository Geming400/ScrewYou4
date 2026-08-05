package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.Commands.CommandSelection.class)
public class CommandSelection_249313881Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/commands/Commands$CommandSelection;", cancellable = true)
    private static void values_877508907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(877508907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/commands/Commands$CommandSelection;", cancellable = true)
    private static void valueOf__709036814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-709036814L))
            info.setReturnValue(net.minecraft.commands.Commands.CommandSelection.ALL);
    }


}
