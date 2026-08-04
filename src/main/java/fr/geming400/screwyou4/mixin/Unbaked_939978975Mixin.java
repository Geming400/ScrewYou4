package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.EmptyBlockModel.Unbaked.class)
public class Unbaked_939978975Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1969476063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1969476063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__195481001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-195481001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_978241716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(978241716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/block/model/BlockModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void bake_1538069427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1538069427L))
            info.setReturnValue(null);
    }


}
