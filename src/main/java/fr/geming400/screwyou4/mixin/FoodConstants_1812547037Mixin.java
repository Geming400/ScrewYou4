package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.food.FoodConstants.class)
public class FoodConstants_1812547037Mixin {
        @Inject(at = @At("HEAD"), method = "saturationByModifier(IF)F", cancellable = true)
    private static void saturationByModifier_813881876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813881876L))
            info.setReturnValue(null);
    }


}
