package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntryChunkSourceStats.class)
public class DebugEntryChunkSourceStats_1929867386Mixin {
        @Inject(at = @At("HEAD"), method = "display(Lnet/minecraft/client/gui/components/debug/DebugScreenDisplayer;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/chunk/LevelChunk;Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void display__145981731(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-145981731L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAllowed(Z)Z", cancellable = true)
    private void isAllowed__1135479238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1135479238L))
            info.setReturnValue(false);
    }


}
