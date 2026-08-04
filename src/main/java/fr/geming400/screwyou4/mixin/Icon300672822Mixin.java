package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.waypoints.Waypoint.Icon.class)
public class Icon300672822Mixin {
        @Inject(at = @At("HEAD"), method = "copyFrom(Lnet/minecraft/world/waypoints/Waypoint$Icon;)V", cancellable = true)
    private void copyFrom_1932300466(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1932300466L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasData()Z", cancellable = true)
    private void hasData_338951405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(338951405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cloneAndAssignStyle(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/waypoints/Waypoint$Icon;", cancellable = true)
    private void cloneAndAssignStyle_1202669468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1202669468L))
            info.setReturnValue(null);
    }


}
