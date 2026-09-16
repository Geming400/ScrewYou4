package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.multipart.KeyValueCondition.Terms.class)
public class Terms1074431350Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_165805082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165805082L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1844854379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1844854379L))
            info.setReturnValue("t|8B\"(xFph\u6804c yP&s<|\uA0EAQr=sDO2T%-3|!8t[MSf");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1631783441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1631783441L))
            info.setReturnValue(690304023);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_1371344950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1371344950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/lang/String;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void parse__161598764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-161598764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Ljava/lang/Object;Lnet/minecraft/world/level/block/state/properties/Property;)Ljava/util/function/Predicate;", cancellable = true)
    private void instantiate__1561734828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1561734828L))
            info.setReturnValue(null);
    }


}
