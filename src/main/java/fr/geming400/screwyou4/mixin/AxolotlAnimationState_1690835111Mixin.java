package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.axolotl.Axolotl.AxolotlAnimationState.class)
public class AxolotlAnimationState_1690835111Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/axolotl/Axolotl$AxolotlAnimationState;", cancellable = true)
    private static void values_2226512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2226512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/axolotl/Axolotl$AxolotlAnimationState;", cancellable = true)
    private static void valueOf_1928752553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1928752553L))
            info.setReturnValue(net.minecraft.world.entity.animal.axolotl.Axolotl.AxolotlAnimationState.ON_GROUND);
    }


}
