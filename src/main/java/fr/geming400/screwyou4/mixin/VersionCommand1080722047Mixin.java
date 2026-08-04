package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.VersionCommand.class)
public class VersionCommand1080722047Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;Z)V", cancellable = true)
    private static void register_1938218686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1938218686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dumpVersion(Ljava/util/function/Consumer;)V", cancellable = true)
    private static void dumpVersion_1761738708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1761738708L))
            info.cancel();
    }


}
