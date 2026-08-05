package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.waypoints.Waypoint.Icon.class)
public class Icon300672822Mixin {
        @Inject(at = @At("HEAD"), method = "copyFrom(Lnet/minecraft/world/waypoints/Waypoint$Icon;)V", cancellable = true)
    private void copyFrom__109364303(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-109364303L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasData()Z", cancellable = true)
    private void hasData__1201855991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1201855991L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "cloneAndAssignStyle(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/waypoints/Waypoint$Icon;", cancellable = true)
    private void cloneAndAssignStyle__1158990844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1158990844L))
            info.setReturnValue(null);
    }


}
