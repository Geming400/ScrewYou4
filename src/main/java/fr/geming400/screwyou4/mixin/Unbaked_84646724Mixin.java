package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.CompositeModel.Unbaked.class)
public class Unbaked_84646724Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1310603931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1310603931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__823979545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-823979545L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_855070248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(855070248L))
            info.setReturnValue("h3\u59528:PU_(?$H|z\u4630Q=H2g6-^b[`0\uC8EFk`#wRNW$k\u4860H:3!k\u3BA6`1\u3D06\u6D28sz3tdAA1\u7FB8\u757Eq;_Arr]|@O^RnvE>eH%!ZcL\u7435!4hbJ*NVmv\u5D51");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_641998814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(641998814L))
            info.setReturnValue(968349901);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation_1283183866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1283183866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake_842001137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(842001137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "models()Ljava/util/List;", cancellable = true)
    private void models__1614570787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1614570787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_1160337006(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1160337006L))
            info.cancel();
    }


}
