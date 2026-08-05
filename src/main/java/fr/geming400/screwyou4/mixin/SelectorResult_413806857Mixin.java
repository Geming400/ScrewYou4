package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ScoreHolderArgument.SelectorResult.class)
public class SelectorResult_413806857Mixin {
        @Inject(at = @At("HEAD"), method = "getNames(Lnet/minecraft/commands/CommandSourceStack;Ljava/util/function/Supplier;)Ljava/util/Collection;", cancellable = true)
    private void getNames_2068433208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2068433208L))
            info.setReturnValue(null);
    }


}
