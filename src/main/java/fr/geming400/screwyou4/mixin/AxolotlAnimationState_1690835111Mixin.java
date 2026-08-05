package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.axolotl.Axolotl.AxolotlAnimationState.class)
public class AxolotlAnimationState_1690835111Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/axolotl/Axolotl$AxolotlAnimationState;", cancellable = true)
    private static void values_1204621230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1204621230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/axolotl/Axolotl$AxolotlAnimationState;", cancellable = true)
    private static void valueOf__1327131183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1327131183L))
            info.setReturnValue(net.minecraft.world.entity.animal.axolotl.Axolotl.AxolotlAnimationState.IN_AIR);
    }


}
