package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntrySimplePerformanceImpactors.class)
public class DebugEntrySimplePerformanceImpactors_1162372453Mixin {
        @Inject(at = @At("HEAD"), method = "display(Lnet/minecraft/client/gui/components/debug/DebugScreenDisplayer;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/chunk/LevelChunk;Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void display__913476664(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-913476664L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAllowed(Z)Z", cancellable = true)
    private void isAllowed__1902974171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1902974171L))
            info.setReturnValue(true);
    }


}
