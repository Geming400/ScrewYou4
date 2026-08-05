package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.ModelPart.Cube.class)
public class Cube806988559Mixin {
        @Inject(at = @At("HEAD"), method = "compile(Lcom/mojang/blaze3d/vertex/PoseStack$Pose;Lcom/mojang/blaze3d/vertex/VertexConsumer;III)V", cancellable = true)
    private void compile_2128401896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2128401896L))
            info.cancel();
    }


}
