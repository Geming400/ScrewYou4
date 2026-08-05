package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.SpecialModelWrapper.Unbaked.class)
public class Unbaked_277591301Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void base_2129492043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2129492043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_2013445024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013445024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1663103559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1663103559L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__857868675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-857868675L))
            info.setReturnValue("E<Wzd(qYOh'\u58D1(D>#/fks\u0688QC-wE9kiY\uC0F4ryT1G?V6mvN\u48A9e1(\u0788\u35CFZui.M1ul^BYtgV^v\u01B99_%2@\uB019w/3kS@^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_315854042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315854042L))
            info.setReturnValue(-1597410404);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation_523052722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523052722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "specialModel()Lnet/minecraft/client/renderer/special/SpecialModelRenderer$Unbaked;", cancellable = true)
    private void specialModel__1301150273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1301150273L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_227797370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(227797370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake_1711186201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1711186201L))
            info.setReturnValue(null);
    }


}
