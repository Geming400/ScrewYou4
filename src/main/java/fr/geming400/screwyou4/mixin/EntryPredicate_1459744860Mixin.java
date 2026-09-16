package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.AttributeModifiersPredicate.EntryPredicate.class)
public class EntryPredicate_1459744860Mixin {
        @Inject(at = @At("HEAD"), method = "slot()Ljava/util/Optional;", cancellable = true)
    private void slot_1960489479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960489479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_551118591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551118591L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2064798912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2064798912L))
            info.setReturnValue("\u8176y*#,]?3w\u44FDNle\u6C43RBPI.KsW$[s9(a%MG&B1\u5BF8\u1A754g?(\uD1B1BHV|K 1\u3123/\uA75F&w($e(E*%iq=\u80C4.aX\u1000x0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2017096950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017096950L))
            info.setReturnValue(-448389741);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__277226852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-277226852L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/item/component/ItemAttributeModifiers$Entry;)Z", cancellable = true)
    private void test_1304290653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1304290653L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/Optional;", cancellable = true)
    private void id__895185372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-895185372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Ljava/util/Optional;", cancellable = true)
    private void attribute__503580507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503580507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "amount()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void amount__1735769839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1735769839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "operation()Ljava/util/Optional;", cancellable = true)
    private void operation__96587152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-96587152L))
            info.setReturnValue(null);
    }


}
