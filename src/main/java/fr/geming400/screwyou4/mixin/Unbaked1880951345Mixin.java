package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.CuboidItemModelWrapper.Unbaked.class)
public class Unbaked1880951345Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_485700691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(485700691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_972325077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(972325077L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1643592426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643592426L))
            info.setReturnValue("o&g`]\u160F:;[*L");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1856663860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1856663860L))
            info.setReturnValue(1275394974);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void model_92449697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(92449697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation__1215478808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1215478808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake__1656661537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1656661537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tints()Ljava/util/List;", cancellable = true)
    private void tints__1842206407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1842206407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies__1338325668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1338325668L))
            info.cancel();
    }


}
