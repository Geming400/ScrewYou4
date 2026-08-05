package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.BlockStateModelWrapper.Unbaked.class)
public class Unbaked1503696102Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1405758935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1405758935L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_368236127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(368236127L))
            info.setReturnValue("XbV*Gp^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1541958844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1541958844L))
            info.setReturnValue(1431077646);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void model__792062764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-792062764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation_1749157524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1749157524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/block/model/BlockModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void bake_2101786555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101786555L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tints()Ljava/util/List;", cancellable = true)
    private void tints__1164934378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1164934378L))
            info.setReturnValue(null);
    }


}
