package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.npc.BabyVillagerModel.class)
public class BabyVillagerModel2127537215Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyModel()Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createBodyModel__550730783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-550730783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNoHatModel()Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createNoHatModel__550730783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-550730783L))
            info.setReturnValue(null);
    }


}
