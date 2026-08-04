package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.EmptyModel.Unbaked.class)
public class Unbaked1635190198Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__923923374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-923923374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1274264839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274264839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_499730223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(499730223L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1673452940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1673452940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake__1226182197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1226182197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_1585396268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1585396268L))
            info.cancel();
    }


}
