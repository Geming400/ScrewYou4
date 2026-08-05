package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.zombie.BabyZombieVillagerModel.class)
public class BabyZombieVillagerModel1821831257Mixin {
        @Inject(at = @At("HEAD"), method = "createNoHatLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createNoHatLayer_1107699093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1107699093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_1107699093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1107699093L))
            info.setReturnValue(null);
    }


}
