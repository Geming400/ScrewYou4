package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.equine.BabyHorseModel.class)
public class BabyHorseModel_1470650998Mixin {
        @Inject(at = @At("HEAD"), method = "createBabyMesh(Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createBabyMesh_803670309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803670309L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.MeshDefinition());
    }


}
