package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.ConduitSpecialRenderer.Unbaked.class)
public class Unbaked_1853866444Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_458615789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(458615789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_945240175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(945240175L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1670677328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1670677328L))
            info.setReturnValue("\u51C7MS'3ed2f{&\uFF32<7F-^\u6741Y&\u7762V\"PaF&}@rm:\u27E2nway[p<5<i%0|\u3EBE+x\uA1E4[1\uA249NLS0t\uAF56r-M\u47B5&QV\u5E44lV\u075D75?H`\uD4DC;T2ChrDQ/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1883748762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1883748762L))
            info.setReturnValue(-2008393582);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__1268298472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1268298472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/ConduitSpecialRenderer;", cancellable = true)
    private void bake__836341811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-836341811L))
            info.setReturnValue(null);
    }


}
