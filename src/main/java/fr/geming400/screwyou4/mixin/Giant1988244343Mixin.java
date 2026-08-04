package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Giant.class)
public class Giant1988244343Mixin {
        @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue__2092411982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2092411982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1288025898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1288025898L))
            info.setReturnValue(null);
    }


}
