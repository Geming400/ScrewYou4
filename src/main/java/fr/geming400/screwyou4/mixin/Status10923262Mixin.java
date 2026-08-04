package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.boat.AbstractBoat.Status.class)
public class Status10923262Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/vehicle/boat/AbstractBoat$Status;", cancellable = true)
    private static void values__932721346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932721346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/vehicle/boat/AbstractBoat$Status;", cancellable = true)
    private static void valueOf_9842657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(9842657L))
            info.setReturnValue(null);
    }


}
