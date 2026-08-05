package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntrySimplePerformanceImpactors.class)
public class DebugEntrySimplePerformanceImpactors_1162372453Mixin {
        @Inject(at = @At("HEAD"), method = "display(Lnet/minecraft/client/gui/components/debug/DebugScreenDisplayer;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/chunk/LevelChunk;Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void display__2101041910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2101041910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAllowed(Z)Z", cancellable = true)
    private void isAllowed__61708861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-61708861L))
            info.setReturnValue(true);
    }


}
