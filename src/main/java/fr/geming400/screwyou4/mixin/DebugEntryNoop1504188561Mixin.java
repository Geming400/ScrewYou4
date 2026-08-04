package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntryNoop.class)
public class DebugEntryNoop1504188561Mixin {
        @Inject(at = @At("HEAD"), method = "display(Lnet/minecraft/client/gui/components/debug/DebugScreenDisplayer;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/chunk/LevelChunk;Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void display__571660555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-571660555L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "category()Lnet/minecraft/client/gui/components/debug/DebugEntryCategory;", cancellable = true)
    private void category_1786725649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1786725649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAllowed(Z)Z", cancellable = true)
    private void isAllowed__1561158062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1561158062L))
            info.setReturnValue(null);
    }


}
