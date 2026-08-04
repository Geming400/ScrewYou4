package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.selector.options.SetOnceOptionState.class)
public class SetOnceOptionState290496721Mixin {
        @Inject(at = @At("HEAD"), method = "canParse()Z", cancellable = true)
    private void canParse_328775304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(328775304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markParsed()V", cancellable = true)
    private void markParsed_328771460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(328771460L))
            info.cancel();
    }


}
