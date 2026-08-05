package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.FaceBakery.class)
public class FaceBakery467767577Mixin {
        @Inject(at = @At("HEAD"), method = "bakeQuad(Lnet/minecraft/client/resources/model/ModelBaker;Lorg/joml/Vector3fc;Lorg/joml/Vector3fc;Lnet/minecraft/client/resources/model/cuboid/CuboidFace;Lnet/minecraft/client/resources/model/sprite/Material$Baked;Lnet/minecraft/core/Direction;Lnet/minecraft/client/renderer/block/dispatch/ModelState;Lnet/minecraft/client/resources/model/cuboid/CuboidRotation;ZI)Lnet/minecraft/client/resources/model/geometry/BakedQuad;", cancellable = true)
    private static void bakeQuad__1831626312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1831626312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bakeQuad(Lnet/minecraft/client/resources/model/ModelBaker$Interner;Lorg/joml/Vector3fc;Lorg/joml/Vector3fc;Lnet/minecraft/client/resources/model/cuboid/CuboidFace$UVs;Lcom/mojang/math/Quadrant;Lnet/minecraft/client/resources/model/geometry/BakedQuad$MaterialInfo;Lnet/minecraft/core/Direction;Lnet/minecraft/client/renderer/block/dispatch/ModelState;Lnet/minecraft/client/resources/model/cuboid/CuboidRotation;)Lnet/minecraft/client/resources/model/geometry/BakedQuad;", cancellable = true)
    private static void bakeQuad_2089558995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2089558995L))
            info.setReturnValue(null);
    }


}
