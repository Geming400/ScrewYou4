package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.FunctionInstantiationException.class)
public class FunctionInstantiationException_391043852Mixin {
        @Inject(at = @At("HEAD"), method = "messageComponent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void messageComponent__1785865314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1785865314L))
            info.setReturnValue(null);
    }


}
