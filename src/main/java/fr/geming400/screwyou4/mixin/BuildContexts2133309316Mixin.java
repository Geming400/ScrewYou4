package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.tasks.BuildContexts.class)
public class BuildContexts2133309316Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_997848845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(997848845L))
            info.setReturnValue(null);
    }


}
