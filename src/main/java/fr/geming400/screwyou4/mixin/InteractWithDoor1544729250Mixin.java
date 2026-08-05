package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.InteractWithDoor.class)
public class InteractWithDoor1544729250Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_804592938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(804592938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "closeDoorsThatIHaveOpenedOrPassedThrough(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;Ljava/util/Set;Ljava/util/Optional;)V", cancellable = true)
    private static void closeDoorsThatIHaveOpenedOrPassedThrough__1780760538(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1780760538L))
            info.cancel();
    }


}
