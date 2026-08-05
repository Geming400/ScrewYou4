package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.WaypointArgument.class)
public class WaypointArgument2022691976Mixin {
        @Inject(at = @At("HEAD"), method = "getWaypoint(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/waypoints/WaypointTransmitter;", cancellable = true)
    private static void getWaypoint__546115939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-546115939L))
            info.setReturnValue(null);
    }


}
