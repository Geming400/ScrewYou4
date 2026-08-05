package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fox.Fox.FoxAlertableEntitiesSelector.class)
public class FoxAlertableEntitiesSelector1527745622Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/server/level/ServerLevel;)Z", cancellable = true)
    private void test_2169248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2169248L))
            info.setReturnValue(false);
    }


}
