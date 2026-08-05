package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.GameProfileArgument.SelectorResult.class)
public class SelectorResult1075395230Mixin {
        @Inject(at = @At("HEAD"), method = "getNames(Lnet/minecraft/commands/CommandSourceStack;)Ljava/util/Collection;", cancellable = true)
    private void getNames__1182344774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1182344774L))
            info.setReturnValue(null);
    }


}
