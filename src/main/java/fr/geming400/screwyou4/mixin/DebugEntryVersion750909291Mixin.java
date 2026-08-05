package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntryVersion.class)
public class DebugEntryVersion750909291Mixin {
        @Inject(at = @At("HEAD"), method = "display(Lnet/minecraft/client/gui/components/debug/DebugScreenDisplayer;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/chunk/LevelChunk;Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void display__1324939825(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1324939825L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAllowed(Z)Z", cancellable = true)
    private void isAllowed_1980529964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980529964L))
            info.setReturnValue(true);
    }


}
