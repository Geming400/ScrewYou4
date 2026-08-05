package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BoundingBoxRenderable.Mode.class)
public class Mode660040510Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/BoundingBoxRenderable$Mode;", cancellable = true)
    private static void values__2079691293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2079691293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/BoundingBoxRenderable$Mode;", cancellable = true)
    private static void valueOf_855575110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(855575110L))
            info.setReturnValue(net.minecraft.world.level.block.entity.BoundingBoxRenderable.Mode.BOX_AND_INVISIBLE_BLOCKS);
    }


}
