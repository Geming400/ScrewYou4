package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntrySectionPosition.class)
public class DebugEntrySectionPosition1085354561Mixin {
        @Inject(at = @At("HEAD"), method = "display(Lnet/minecraft/client/gui/components/debug/DebugScreenDisplayer;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/chunk/LevelChunk;Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void display__990494555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-990494555L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAllowed(Z)Z", cancellable = true)
    private void isAllowed__1979992062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1979992062L))
            info.setReturnValue(false);
    }


}
