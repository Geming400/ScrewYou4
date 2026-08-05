package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.CompositeModel.Unbaked.class)
public class Unbaked_84646724Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_1820500447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820500447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1470158982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470158982L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1050813252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1050813252L))
            info.setReturnValue("O.*1BI&cjL6S\u4781dZ'8$G\u69C2/Z]Abfh?)r)y\u387E'1Z]qt; 8aJ1mZ\u89FD%y9?\u75FEaZy\u2308b:757\u2699b 9(ofum'CO9z$\u2082d&*\u346EL;VaW2S");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_122909465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(122909465L))
            info.setReturnValue(1190345124);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation_330108145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(330108145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "models()Ljava/util/List;", cancellable = true)
    private void models_1710983539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1710983539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_34852793(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(34852793L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake_1518241624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1518241624L))
            info.setReturnValue(null);
    }


}
