package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.zombie.BabyZombieVillagerModel.class)
public class BabyZombieVillagerModel1821831257Mixin {
        @Inject(at = @At("HEAD"), method = "createNoHatLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createNoHatLayer__2093720376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2093720376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__81823352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81823352L))
            info.setReturnValue(null);
    }


}
