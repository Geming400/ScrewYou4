package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.PublishCommand.class)
public class PublishCommand_1960947672Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register_1842993141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1842993141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSuccessMessage(I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void getSuccessMessage__1161404851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1161404851L))
            info.setReturnValue(null);
    }


}
