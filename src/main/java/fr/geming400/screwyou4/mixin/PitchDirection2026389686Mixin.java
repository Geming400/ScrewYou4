package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.waypoints.TrackedWaypoint.PitchDirection.class)
public class PitchDirection2026389686Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/waypoints/TrackedWaypoint$PitchDirection;", cancellable = true)
    private static void values_308263565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(308263565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/waypoints/TrackedWaypoint$PitchDirection;", cancellable = true)
    private static void valueOf__1616346156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616346156L))
            info.setReturnValue(net.minecraft.world.waypoints.TrackedWaypoint.PitchDirection.NONE);
    }


}
