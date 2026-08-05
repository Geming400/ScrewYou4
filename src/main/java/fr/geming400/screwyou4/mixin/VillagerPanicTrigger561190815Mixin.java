package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.VillagerPanicTrigger.class)
public class VillagerPanicTrigger561190815Mixin {
        @Inject(at = @At("HEAD"), method = "isHurt(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void isHurt_882858238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(882858238L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasHostile(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void hasHostile_882858238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(882858238L))
            info.setReturnValue(true);
    }


}
