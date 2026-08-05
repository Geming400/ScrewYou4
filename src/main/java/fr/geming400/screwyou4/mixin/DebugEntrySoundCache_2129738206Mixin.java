package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntrySoundCache.class)
public class DebugEntrySoundCache_2129738206Mixin {
        @Inject(at = @At("HEAD"), method = "display(Lnet/minecraft/client/gui/components/debug/DebugScreenDisplayer;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/chunk/LevelChunk;Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void display_53889089(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(53889089L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAllowed(Z)Z", cancellable = true)
    private void isAllowed__935608418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-935608418L))
            info.setReturnValue(false);
    }


}
