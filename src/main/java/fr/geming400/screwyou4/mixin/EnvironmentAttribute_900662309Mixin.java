package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.EnvironmentAttribute.class)
public class EnvironmentAttribute_900662309Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/attribute/AttributeType;", cancellable = true)
    private void type_1542957628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1542957628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1671085337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671085337L))
            info.setReturnValue("09nI1\u247AHG$GlAKo-LSe+44Y5\u699CVc`VQ{KV=: *w)3CW\u5844BI\uC8C8/\u981BV\u7C00Uf<G");
    }

    @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/world/attribute/AttributeType;)Lnet/minecraft/world/attribute/EnvironmentAttribute$Builder;", cancellable = true)
    private static void builder__1397108538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1397108538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultValue()Ljava/lang/Object;", cancellable = true)
    private void defaultValue_1627763055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1627763055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_934213391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934213391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSyncable()Z", cancellable = true)
    private void isSyncable__481245316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-481245316L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sanitizeValue(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void sanitizeValue_866974251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866974251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSpatiallyInterpolated()Z", cancellable = true)
    private void isSpatiallyInterpolated_1533095793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1533095793L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPositional()Z", cancellable = true)
    private void isPositional_1280563389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1280563389L))
            info.setReturnValue(false);
    }


}
