package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.SpecialModelWrapper.Unbaked.class)
public class Unbaked_277591301Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void base__924804580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-924804580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1117659354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1117659354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__631034968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-631034968L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1048014825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1048014825L))
            info.setReturnValue("E5fQ7Wo%L`e7$\uB7CD@2#yBz'4\u91BAi1-aHGcU'r>G");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_834943391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834943391L))
            info.setReturnValue(-1035470454);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation_1476128443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1476128443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake_1034945714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1034945714L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "specialModel()Lnet/minecraft/client/renderer/special/SpecialModelRenderer$Unbaked;", cancellable = true)
    private void specialModel_1424878511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424878511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_1353281583(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1353281583L))
            info.cancel();
    }


}
