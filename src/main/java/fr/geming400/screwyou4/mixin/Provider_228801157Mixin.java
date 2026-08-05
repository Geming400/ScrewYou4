package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.Brain.Provider.class)
public class Provider_228801157Mixin {
        @Inject(at = @At("HEAD"), method = "makeBrain(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/ai/Brain$Packed;)Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void makeBrain_23020787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(23020787L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }


}
