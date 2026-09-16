package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.TrimPredicate.class)
public class TrimPredicate751116823Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__157509445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-157509445L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1521540348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1521540348L))
            info.setReturnValue("\u9EB7`dx?)tCOIU4\uD104JmNo,&\u0210\u47F0dL\uB6320DiZ\u2146>7FU-5'0Y<G}k}\uACCC*e!+Mr\u27F7J\u25B8nL#7Rg78^ ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1308468914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1308468914L))
            info.setReturnValue(181677980);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__1827335939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827335939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__717020521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-717020521L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/equipment/trim/ArmorTrim;)Z", cancellable = true)
    private void matches__707946376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-707946376L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "pattern()Ljava/util/Optional;", cancellable = true)
    private void pattern__1239822507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1239822507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "material()Ljava/util/Optional;", cancellable = true)
    private void material__168381460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-168381460L))
            info.setReturnValue(null);
    }


}
